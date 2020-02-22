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
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.EdgeRefinement;
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

	public List<EObject> listDataTypes(EObject self) {
		Session session = SessionManager.INSTANCE.getSession(self);
		return DFDUtil.getDataTypes(session);
	}

	public boolean isRefined(EObject self) {
		List<EObject> refs = new ArrayList<EObject>(new EObjectQuery(self).getInverseReferences("refinedProcess"));
		return !refs.isEmpty();
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

	public void refineProcess(EObject newDFD, EObject p, DataFlowDiagram oldDFD, DataFlowDiagramRefinement ref) {
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
		createLeveledDFD(incoming, outgoing, (Process) p, oldDFD, (DataFlowDiagram) newDFD, ref);
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
			DataFlowDiagram newDFD, DataFlowDiagramRefinement ref) {

		Node newProcess = copyNode(p);
		newDFD.getNodes().add(newProcess);

		for (DataFlow df : inc) {
			DataFlow ndf = copyDataFlow(df);
			ndf.setTarget(newProcess);
			newDFD.getEdges().add(ndf);
			addToRef(df, ndf, ref);
		}

		for (DataFlow df : out) {
			DataFlow ndf = copyDataFlow(df);
			ndf.setSource(newProcess);
			newDFD.getEdges().add(ndf);
			addToRef(df, ndf, ref);
		}
		// DFDUtil.validateDiagram(newDFD); // TODO: not working

	}

	private void addToRef(DataFlow df, DataFlow ndf, DataFlowDiagramRefinement ref) {
		EdgeRefinement er = DataFlowDiagramFactory.eINSTANCE.createEdgeRefinement();
		er.setRefinedEdge(df);
		er.getRefiningEdges().add(ndf);
		ref.getRefinedEdges().add(er);

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

	private boolean isBorderNode(Node n) {

		return getContexts(n).size() > 1; //TODO not working

	}

	private Set<DataFlowDiagram> getContexts(Node n) {
		List<EObject> inputRefs = new ArrayList<EObject>(new EObjectQuery(n).getInverseReferences("target").stream()
				.filter(r -> r instanceof DataFlow).collect(Collectors.toList()));
		List<EObject> outputRefs = new ArrayList<EObject>(new EObjectQuery(n).getInverseReferences("source").stream()
				.filter(r -> r instanceof DataFlow).collect(Collectors.toList()));
		Set<DataFlowDiagram> contexts = new HashSet<DataFlowDiagram>();
		for (EObject eo : inputRefs) {
			contexts.add((DataFlowDiagram) eo.eContainer());
		}
		for (EObject eo : outputRefs) {
			contexts.add((DataFlowDiagram) eo.eContainer());
		}

		return contexts;

	}

	public boolean inputOutputIsConsistent(EObject self) {
		Node n = (Node) self;
		if (!isBorderNode(n)) {
			System.out.println(n);
			return true;
		}

		Set<DataFlowDiagram> contexts = getContexts(n);
		for (DataFlowDiagram context : contexts) {
			if (!isRefiningDiagram(context)) {
				continue;
			}
			Tuple<List<EdgeRefinement>, List<EdgeRefinement>> edgeRefinements = getEdgeRefinements(context, n);
			List<EdgeRefinement> refinedInputs = edgeRefinements.getFirst();
			List<EdgeRefinement> refinedOutputs = edgeRefinements.getSecond();
			Tuple<List<Edge>, List<Edge>> actualDFs = getCurrentDataFlows(context, n);
			List<Edge> actualInputs = actualDFs.getFirst();
			List<Edge> actualOutputs = actualDFs.getSecond();
			if (!isConsistent(refinedInputs, actualInputs) || !isConsistent(refinedOutputs, actualOutputs)) {
				return false;
			}
		}

		return true;
	}

	private boolean isConsistent(List<EdgeRefinement> refined, List<Edge> actual) {
		/*
		if (refined.isEmpty() != actual.isEmpty()) {
			return false;
		}
		*/
		// TODO logic
		return true;

	}

	private Tuple<List<EdgeRefinement>, List<EdgeRefinement>> getEdgeRefinements(DataFlowDiagram dfd, Node n) {
		List<EdgeRefinement> inputs = new ArrayList<EdgeRefinement>();
		List<EdgeRefinement> outputs = new ArrayList<EdgeRefinement>();
		List<EObject> refs = new ArrayList<EObject>(new EObjectQuery(dfd).getInverseReferences("refiningDiagram"));
		List<EdgeRefinement> allEdges = ((DataFlowDiagramRefinement) refs.get(0)).getRefinedEdges();

		for (EdgeRefinement er : allEdges) {
			if (isEqual(er.getRefinedEdge().getSource(), n)) {
				outputs.add(er);

			} else if (isEqual(er.getRefinedEdge().getTarget(), n)) {
				inputs.add(er);

			}
		}
		return new Tuple<List<EdgeRefinement>, List<EdgeRefinement>>(inputs, outputs);
	}

	private Tuple<List<Edge>, List<Edge>> getCurrentDataFlows(DataFlowDiagram context, Node n) {
		List<Edge> input = new ArrayList<Edge>();
		List<Edge> output = new ArrayList<Edge>();
		for (Edge e : context.getEdges()) {
			if (isEqual(n, e.getSource())) {
				output.add(e);
			} else if (isEqual(n, e.getTarget())) {
				input.add(e);
			}
		}

		return new Tuple<List<Edge>, List<Edge>>(input, output);

	}

	private boolean isRefiningDiagram(DataFlowDiagram dfd) {
		return !new EObjectQuery(dfd).getInverseReferences("refiningDiagram").isEmpty();
	}
}
