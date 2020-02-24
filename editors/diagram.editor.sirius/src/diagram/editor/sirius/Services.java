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
import org.palladiosimulator.dataflow.dictionary.DataDictionary.CollectionDataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.CompositeDataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionary;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.Entry;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.PrimitiveDataType;

import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
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

	public EObject navigateUp(EObject self, EObject dfd) {
		return dfd.eContainer().eContainer();
	}

	public List<EObject> listDataTypes(EObject self) {
		Session session = SessionManager.INSTANCE.getSession(self);
		return DFDUtil.getDataTypes(session);
	}

	public boolean isRefined(EObject self) {
		List<EObject> refs = new ArrayList<EObject>(new EObjectQuery(self).getInverseReferences("refinedProcess"));
		return !refs.isEmpty();
	}

	public boolean isNotRefined(EObject self) {
		List<EObject> refs = new ArrayList<EObject>(new EObjectQuery(self).getInverseReferences("refinedProcess"));
		return refs.isEmpty();
	}

	private List<Edge> refineEdge(Edge edge) {
		DataFlow df = (DataFlow) edge;
		Session session = new ArrayList<Session>(SessionManager.INSTANCE.getSessions()).get(0);
		List<Edge> results = new ArrayList<Edge>();
		if (df.getData().size() > 1) {
			// one df per data
			for (Data d : df.getData()) {
				DataFlow ndf = makeSingleDataFlow(d, df);
				results.add(ndf);
			}

		} else {
			// one df per type
			Data origin = df.getData().get(0);
			DataType type = origin.getType();
			String name = origin.getName() + ".";
			int suffix = 1;
			List<DataFlow> dfs = new ArrayList<DataFlow>();
			if (type instanceof CompositeDataType) {
				List<Entry> entries = DFDUtil.refineDT(type, session); // TODO: error
				for (Entry e : entries) {
					Data data = makeData(e);
					DataFlow ndf = makeSingleDataFlow(data, df);
					ndf.setName(name + suffix++);
					dfs.add(ndf);
				}
				results.addAll(dfs);
			}
		}
		return results;

	}

	public void refineDF(EObject self, DataFlow df, DataFlowDiagram dfd) {
		Session session = SessionManager.INSTANCE.getSession(df);

		if (df.getData().isEmpty() || !isRefinable(df)) {
			return;
		}

		EdgeRefinement ref = getRefinedEdge(df);
		if (ref == null) {
			return;// TODO correct?
		} else {
			ref.getRefiningEdges().remove(df);
		}

		if (df.getData().size() > 1) {
			// one df per data
			for (Data d : df.getData()) {
				DataFlow ndf = makeSingleDataFlow(d, df);
				dfd.getEdges().add(ndf);
				ref.getRefiningEdges().add(ndf);

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
					ref.getRefiningEdges().add(ndf);
				}
				dfd.getEdges().remove(df);
				dfd.getEdges().addAll(dfs);
			}

		}

	}

	private void addToRef(DataFlow df, DataFlow ndf, DataFlowDiagramRefinement ref) {
		EdgeRefinement er = DataFlowDiagramFactory.eINSTANCE.createEdgeRefinement();
		er.setRefinedEdge(df);
		er.getRefiningEdges().add(ndf);
		ref.getRefinedEdges().add(er);

	}

	private EdgeRefinement getRefinedEdge(DataFlow refiningDF) {
		List<EObject> refs = new ArrayList<EObject>(new EObjectQuery(refiningDF).getInverseReferences("refiningEdges"));
		if (refs.isEmpty())
			return null;
		return (EdgeRefinement) refs.get(0);
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

				if (ComparisonUtil.isEqual(p, df.getTarget())) {
					incoming.add(df);
				}
				if (ComparisonUtil.isEqual(p, df.getSource())) {
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

	public void addDF(EObject self, EObject source, EObject target) {
		DataFlow df = DataFlowDiagramFactory.eINSTANCE.createDataFlow();
		DataFlowDiagram sourceDFD = (DataFlowDiagram) source.eContainer();
		DataFlowDiagram targetDFD = (DataFlowDiagram) target.eContainer();
		df.setSource((Node) source);
		df.setTarget((Node) target);
		df.setName("new Data Flow");

		sourceDFD.getEdges().add(df);
		if (!ComparisonUtil.isEqual(sourceDFD, targetDFD)) { // TODO correct?
			targetDFD.getEdges().add(copyDataFlow(df));
		}
	}

	/*
	 * Semantic Validation Rules
	 */

	private boolean isBorderNode(Node n) {
		return getContexts(n).size() > 1;
	}

	private Set<DataFlow> getRef(Node n, String ref) { // "source" or "target"
		List<EObject> refs = new ArrayList<EObject>(new EObjectQuery(n).getInverseReferences(ref).stream()
				.filter(r -> r instanceof DataFlow).collect(Collectors.toList()));
		Set<DataFlow> dfs = new HashSet<DataFlow>();
		refs.forEach(i -> dfs.add((DataFlow) i));
		return dfs;
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

	private Tuple<List<EdgeRefinement>, List<EdgeRefinement>> getEdgeRefinements(Node n, DataFlowDiagram context) {
		List<EdgeRefinement> inputs = new ArrayList<EdgeRefinement>();
		List<EdgeRefinement> outputs = new ArrayList<EdgeRefinement>();
		for (DataFlowDiagramRefinement ref : context.getRefinedBy()) {
			for (EdgeRefinement er : ref.getRefinedEdges()) {
				if (ComparisonUtil.isEqual(n, er.getRefinedEdge().getSource())) {
					outputs.add(er);
				}
				if (ComparisonUtil.isEqual(n, er.getRefinedEdge().getTarget())) {
					inputs.add(er);
				}
			}
		}

		return new Tuple<List<EdgeRefinement>, List<EdgeRefinement>>(inputs, outputs);

	}

	public boolean inputOutputIsConsistent(EObject self) {
		Node n = (Node) self;
		if (!isBorderNode(n)) {
			return true;
		}
		Set<DataFlowDiagram> allContexts = getContexts(n);

		for (DataFlowDiagram context : allContexts) {
			Tuple<List<EdgeRefinement>, List<EdgeRefinement>> toCheck = getEdgeRefinements(n, context);
			if (!isConsistent(toCheck)) {
				return false;
			}
		}

		return true;
	}

	public void deleteNode(EObject self) {
		System.out.println("called"); // TODO remove underlying dfds if deleted
		return;
	}

	private boolean isRefinable(Edge e) {
		DataFlow df = (DataFlow) e;
		if (df.getData().size() > 1) {
			return true;
		}
		if (df.getData().size() > 0 && df.getData().get(0).getType() instanceof CompositeDataType) {
			return true;
		}

		return false;

	}

	private static boolean findMatch(Edge d, List<Edge> candidates) {
		for (Edge c : candidates) {
			if (ComparisonUtil.isEquivalent((DataFlow) d, (DataFlow) c)) {
				return true;
			}
		}
		return false;
	}

	private boolean isEquivalent(List<Edge> base, List<Edge> subFlows) {

		for (Edge b : base) {
			if (!findMatch(b, subFlows)) {
				return false;
			}

		}
		for (Edge s : subFlows) {
			if (!findMatch(s, base)) {
				return false;
			}

		}
		return true;
	}

	private List<List<Edge>> refineAllButOne(List<Edge> input) {
		List<List<Edge>> results = new ArrayList<List<Edge>>();

		for (int exception = 0; exception < input.size(); exception++) {

			List<Edge> currentResults = new ArrayList<Edge>();

			for (int i = 0; i < input.size(); i++) {

				if (i == exception || !isRefinable(input.get(i))) {
					currentResults.add(input.get(i));
					continue;
				}
				currentResults.addAll(refineEdge(input.get(i)));
			}
			results.add(currentResults);

		}
		return results;

	}

	private boolean canMerge(Edge base, List<Edge> refiningEdges) {

		if (isEquivalent(new ArrayList<Edge>(List.of(base)), refiningEdges)) {
			return true;
		}

		if (!isRefinable(base)) {
			return false;
		}
		// generate all candidates; initialized with first refinement
		List<List<Edge>> candidates = new ArrayList<List<Edge>>(List.of(refineEdge(base)));

		Iterator<List<Edge>> cIterator = candidates.iterator();

		while (cIterator.hasNext()) {
			List<Edge> c = cIterator.next();
			System.out.println(c);
			if (isEquivalent(c, refiningEdges)) { // check if current candidate is solution
				System.out.println("---");
				return true;
			}
			List<List<Edge>> newCandidates = refineAllButOne(c); // refine all but one candidate -> will over time
																	// generate all possible combinations of refinements
			//System.out.println(newCandidates);
			//candidates.addAll(newCandidates);
			/*
			for (List<Edge> nc : newCandidates) { // stop adding to list if no new candidates are possible
				if (!nc.isEmpty() && !candidates.contains(nc)) {
					candidates.add(nc);
				}
			}
			*/

		}


		System.out.println("===");

		return false;
	}

	private boolean isConsistent(Tuple<List<EdgeRefinement>, List<EdgeRefinement>> toCheck) {
		List<EdgeRefinement> inputs = toCheck.getFirst();
		List<EdgeRefinement> outputs = toCheck.getSecond();
		for (EdgeRefinement ref : inputs) {
			Edge base = ref.getRefinedEdge();
			if (!canMerge(base, ref.getRefiningEdges())) {
				return false;
			}
		}

		for (EdgeRefinement ref : outputs) {
			Edge base = ref.getRefinedEdge();
			if (!canMerge(base, ref.getRefiningEdges())) {
				return false;
			}
		}
		return true;
	}
}
