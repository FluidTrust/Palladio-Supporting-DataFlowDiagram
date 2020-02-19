package diagram.editor.sirius;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Data;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramFactory;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Edge;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.ExternalActor;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Store;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.util.DataFlowDiagramSwitch;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.CompositeDataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionary;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.Entry;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.CreateRepresentationCommand;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

/**
 * The services class used by VSM.
 */
public class Services {

	private boolean isEqual(EObject e1, EObject e2) {
		return EcoreUtil.equals(e1, e2);

	}

	public void refineDF(EObject self, DataFlow df, DataFlowDiagram dfd) {
		Session session = SessionManager.INSTANCE.getSession(df);

		if (df.getData().isEmpty()) { // TODO check centrally?
			return;
		}
		if (df.getData().size() > 1) {
			// one df per data
			for (Data d : df.getData()) {
				dfd.getEdges().add(makeSingleDataFlow(d, df));

			}
			dfd.getEdges().remove(df);

		} else {
			// one df per type
			Data origin = df.getData().get(0);
			DataType type = origin.getType();
			String name = origin.getName() + ".";
			int suffix = 1;
			List<DataFlow> dfs = new ArrayList<DataFlow>();
			if (type instanceof CompositeDataType) {
				List<Entry> entries = DFDUtil.refineDT(type, session);
				for (Entry e : entries) {
					Data data = makeData(e);
					DataFlow ndf = makeSingleDataFlow(data, df);
					ndf.setName(name + suffix++);
					dfs.add(ndf);

				}
				dfd.getEdges().remove(df);
				dfd.getEdges().addAll(dfs);
			}

		}

	}

	private Data makeData(Entry e) {
		Data d = DataFlowDiagramFactory.eINSTANCE.createData();
		d.setName(e.getName());
		d.setType(e.getType());
		return d;
	}

	public void refineProcess(EObject newDFD, EObject p, DataFlowDiagram oldDFD) {
		List<Edge> edges = oldDFD.getEdges();
		List<DataFlow> incoming = new ArrayList<DataFlow>();
		List<DataFlow> outgoing = new ArrayList<DataFlow>();
		for (Edge e : edges) {
			if (e instanceof DataFlow) {
				DataFlow df = (DataFlow) e;

				if (isEqual(p, df.getTarget())) {
					incoming.add(df);
				}
				if (isEqual(p, df.getSource())) {
					outgoing.add(df);
				}

			}
		}
		createLeveledDFD(incoming, outgoing, (Process) p, oldDFD, (DataFlowDiagram) newDFD);
	}

	private Node copyNode(Node n) { // simulated polymorphism! Naming schemes?
		// EMF switches? DataFlowDiagramSwitch<Node> EcoreUtil.copy
		String name = n.getName();
		Node copy = null;
		if (n instanceof Process) {
			Process p = DataFlowDiagramFactory.eINSTANCE.createProcess();
			p.setName(name);
			copy = p;
		} else if (n instanceof ExternalActor) {
			ExternalActor ea = DataFlowDiagramFactory.eINSTANCE.createExternalActor();
			ea.setName(name);
			copy = ea;
		} else if (n instanceof Store) {
			Store s = DataFlowDiagramFactory.eINSTANCE.createStore();
			s.setName(name);
			copy = s;
		}

		return copy;
	}

	private DataFlow makeSingleDataFlow(Data data, DataFlow df) {
		DataFlow ndf = copyDataFlow(df);
		ndf.setName(data.getName());
		ndf.getData().clear();
		ndf.getData().add(copyData(data));
		return ndf;
	}

	private Data copyData(Data d) {
		Data nd = DataFlowDiagramFactory.eINSTANCE.createData();
		nd.setName(d.getName());
		nd.setType(d.getType());
		return nd;
	}

	private DataFlow copyDataFlow(DataFlow df) {
		DataFlow ndf = DataFlowDiagramFactory.eINSTANCE.createDataFlow();
		ndf.setName(df.getName());
		for (Data d : df.getData()) {
			Data nd = copyData(d);
			ndf.getData().add(nd);
		}
		ndf.setSource(df.getSource());
		ndf.setTarget(df.getTarget());
		return ndf;
	}

	public void createLeveledDFD(List<DataFlow> inc, List<DataFlow> out, Process p, DataFlowDiagram oldDFD,
			DataFlowDiagram newDFD) {

		Node newProcess = copyNode(p);
		newDFD.getNodes().add(newProcess);

		for (DataFlow df : inc) {
			DataFlow ndf = copyDataFlow(df);
			ndf.setTarget(newProcess);
			newDFD.getEdges().add(ndf);
		}

		for (DataFlow df : out) {
			DataFlow ndf = copyDataFlow(df);
			ndf.setSource(newProcess);
			newDFD.getEdges().add(ndf);
		}

		DFDUtil.validateDiagram(newDFD); // TODO: not working
	}

	public void loadResources(EObject self) {
		ResourceDialog r = new ResourceDialog(Display.getCurrent().getActiveShell(), "Load Data Dictionary",
				SWT.SINGLE);
		r.open();
		r.setBlockOnOpen(true);
		Session session = SessionManager.INSTANCE.getSession(self);
		for (URI uri : r.getURIs()) {
			if (!DFDUtil.uriAlreadyLoaded(uri, session))
				session.addSemanticResource(uri, new NullProgressMonitor());

		}

	}

	/*
	 * Semantic Validation Rules
	 */

	public boolean leveledInOutCorrect(EObject self) {
		Process refinedProcess = getRefinedProcess(self); // may not (i.e., no longer) be part of current dfd
		if (refinedProcess == null) {
			return true;
		}

		// TODO: types
		DataFlowDiagram dfd = (DataFlowDiagram) self;
		Map<Node, Set<Data>> requiredInput = getInput(refinedProcess);
		Map<Node, Set<Data>> requiredOutput = getOutput(refinedProcess);
		Map<Node, Set<Data>> currentInput = new HashMap<Node, Set<Data>>();
		Map<Node, Set<Data>> currentOutput = new HashMap<Node, Set<Data>>();
		List<Node> ownedNodes = dfd.getNodes();
		List<Edge> ownedEdges = dfd.getEdges();

		// find in- and output of all sources and sinks; check if they, in their union,
		// contain all data objects that the old ones did
		for (Edge e : ownedEdges) {
			DataFlow df = (DataFlow) e;
			Node source = df.getSource();
			Node target = df.getTarget();
			if (!ownedNodes.contains(source)) {
				currentInput.computeIfPresent(source,
						(k, v) -> Stream.concat(v.stream(), df.getData().stream()).collect(Collectors.toSet()));

				currentInput.putIfAbsent(source, new HashSet<Data>(df.getData()));

			} else if (!ownedNodes.contains(target)) {
				currentOutput.computeIfPresent(target,
						(k, v) -> Stream.concat(v.stream(), df.getData().stream()).collect(Collectors.toSet()));

				currentOutput.putIfAbsent(target, new HashSet<Data>(df.getData()));

			}

		}

		Set<Data> newInput = new HashSet<Data>();
		Set<Data> oldInput = new HashSet<Data>();
		Set<Data> newOutput = new HashSet<Data>();
		Set<Data> oldOutput = new HashSet<Data>();
		requiredInput.values().stream().forEach(oldInput::addAll);
		currentInput.values().stream().forEach(newInput::addAll);
		requiredOutput.values().stream().forEach(oldInput::addAll);
		currentOutput.values().stream().forEach(newInput::addAll);
		System.out.println(oldInput);
		System.out.println(newInput);
		System.out.println(isSubset(oldInput, newInput));
		
		//return newInput.containsAll(oldInput) && newOutput.containsAll(oldOutput);
		return isSubset(oldInput, newInput) && isSubset(oldInput, newOutput); // FIXME
	}
	
	private boolean isSubset (Collection<Data> as, Collection<Data> bs){ // TODO override Data equals?
		boolean result = true;
		/*
		for (Data a: as) {
			for (Data b: bs) {
				if (isSameData(a, b))
					continue;
				
			}
			return false;
		}
		*/
		return result;
	}

	
	private boolean isSameData(Data a, Data b) { // TODO
		return true;
		
	}
	
	public List<EObject> listDataTypes(EObject self) {
		Session session = SessionManager.INSTANCE.getSession(self);
		return DFDUtil.getDataTypes(session);
	}

	public boolean isRefined(EObject self) {
		List<EObject> refs = new ArrayList<EObject>(new EObjectQuery(self).getInverseReferences("refinedProcess"));
		return !refs.isEmpty();
	}
	private Process getRefinedProcess(EObject dfd) {
		List<EObject> refs = new ArrayList<EObject>(new EObjectQuery(dfd).getInverseReferences("refiningDiagram"));
		if (refs.isEmpty()) {
			return null;
		}
		DataFlowDiagramRefinement ref = (DataFlowDiagramRefinement) refs.get(0);
		return ref.getRefinedProcess();

	}

	private Map<Node, Set<Data>> getInput(Process p) {
		List<EObject> refs = new ArrayList<EObject>(new EObjectQuery(p).getInverseReferences("target")).stream()
				.filter(r -> r instanceof DataFlow).collect(Collectors.toList());
		Map<Node, Set<Data>> input = new HashMap<Node, Set<Data>>();

		for (EObject ref : refs) {
			DataFlow df = (DataFlow) ref;
			Node source = df.getSource();

			input.computeIfPresent(source,
					(k, v) -> Stream.concat(v.stream(), df.getData().stream()).collect(Collectors.toSet()));

			input.putIfAbsent(source, new HashSet<Data>(df.getData()));

		}

		return input;

	}

	private Map<Node, Set<Data>> getOutput(Process p) {
		List<EObject> refs = new ArrayList<EObject>(new EObjectQuery(p).getInverseReferences("source")).stream()
				.filter(r -> r instanceof DataFlow).collect(Collectors.toList());
		Map<Node, Set<Data>> input = new HashMap<Node, Set<Data>>();

		for (EObject ref : refs) {
			DataFlow df = (DataFlow) ref;
			Node target = df.getTarget();

			input.computeIfPresent(target,
					(k, v) -> Stream.concat(v.stream(), df.getData().stream()).collect(Collectors.toSet()));

			input.putIfAbsent(target, new HashSet<Data>(df.getData()));

		}

		return input;

	}

}
