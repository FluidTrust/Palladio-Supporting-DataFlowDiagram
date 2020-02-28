package diagram.editor.sirius.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
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
import org.palladiosimulator.dataflow.dictionary.DataDictionary.CompositeDataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.Entry;

public class DFDModificationUtil {

	private static EdgeRefinement currentRefinement = null;

	
	
	public static void setCurrentRefinement(EdgeRefinement ncurrentRefinement) {
		currentRefinement = ncurrentRefinement;
	}
	
	public static EdgeRefinement getCurrentRefinement() {
		return currentRefinement;
	}
	public static boolean needsRef(EObject a, EObject b) {
		boolean sameDFD = isSameDFD(a, b);
		boolean toRef = isRefined(a);
		boolean fromRef = isRefined(b);
		return (!sameDFD || toRef || fromRef);
	}

	private static boolean isSameDFD(EObject a, EObject b) {
		return ComparisonUtil.isEqual(a.eContainer(), b.eContainer());
	}
	
	public static List<Edge> refineEdge(Edge edge) {
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
				List<Entry> entries = DFDTypeUtil.refineDT(type, session);
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
	
	private static void removeFromRefs(DataFlow df) {
		List<EObject> refs = new ArrayList<EObject>(new EObjectQuery(df).getInverseReferences("refiningEdges"));
		for (EObject r : refs) {
			EdgeRefinement er = (EdgeRefinement) r;
			er.getRefiningEdges().remove(df);
		}

	}
	
	public static boolean isBorderNode(Node n) {
		return getContexts(n).size() > 1;
	}

	public static Set<DataFlowDiagram> getContexts(Node n) {
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
	
	public static void deleteEdge(EObject self) {
		DataFlowDiagram dfd = (DataFlowDiagram) self.eContainer();
		removeFromRefs((DataFlow) self);
		dfd.getEdges().remove(self);
	}
	
	public static Tuple<List<EdgeRefinement>, List<EdgeRefinement>> getEdgeRefinements(Node n, DataFlowDiagram context) {
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

	
	public static void deleteNode(EObject self) {

		List<EObject> refiningRefs = new ArrayList<EObject>(
				new EObjectQuery(self).getInverseReferences("refinedProcess"));
		List<EObject> targetRefs = new ArrayList<EObject>(new EObjectQuery(self).getInverseReferences("target").stream()
				.filter(r -> r instanceof DataFlow).collect(Collectors.toList()));
		List<EObject> sourceRefs = new ArrayList<EObject>(new EObjectQuery(self).getInverseReferences("source").stream()
				.filter(r -> r instanceof DataFlow).collect(Collectors.toList()));

		for (EObject r : refiningRefs) {
			DataFlowDiagram ndfd = (DataFlowDiagram) r.eContainer();
			ndfd.getRefinedBy().remove(r);
		}

		for (EObject t : targetRefs) {
			DataFlowDiagram ndfd = (DataFlowDiagram) t.eContainer();
			ndfd.getEdges().remove(t);
		}

		for (EObject s : sourceRefs) {
			DataFlowDiagram ndfd = (DataFlowDiagram) s.eContainer();
			ndfd.getEdges().remove(s);
		}
		DataFlowDiagram dfd = (DataFlowDiagram) self.eContainer();
		dfd.getNodes().remove(self);
		for (DataFlowDiagramRefinement r : dfd.getRefinedBy()) {
			List<EdgeRefinement> toDelete = new ArrayList<EdgeRefinement>();
			for (EdgeRefinement er : r.getRefinedEdges()) {
				if (er.getRefinedEdge() == null || ComparisonUtil.isEqual(er.getRefinedEdge().getSource(), self)
						|| ComparisonUtil.isEqual(er.getRefinedEdge().getTarget(), self)) {
					toDelete.add(er);

				}
			}
			r.getRefinedEdges().removeAll(toDelete);
		}

	}
	
	public static void refineProcess(EObject newDFD, EObject p, DataFlowDiagram oldDFD, DataFlowDiagramRefinement ref) {
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
	
	public static void createDF(EObject self, EObject source, EObject target, boolean needsRef) {
		DataFlow df = DataFlowDiagramFactory.eINSTANCE.createDataFlow();
		DataFlowDiagram sourceDFD = (DataFlowDiagram) source.eContainer();
		DataFlowDiagram targetDFD = (DataFlowDiagram) target.eContainer();
		df.setSource((Node) source);
		df.setTarget((Node) target);
		df.setName("new Data Flow");
		sourceDFD.getEdges().add(df);
		if (!ComparisonUtil.isEqual(sourceDFD, targetDFD)) { // TODO needed for visibility; also used in validation?!
			targetDFD.getEdges().add(df);

		}

		if (needsRef) {
			currentRefinement.getRefiningEdges().add(df);
		}

	}
	
	private static Node copyNode(Node n) { // simulated polymorphism! Naming schemes?
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

	private static DataFlow makeSingleDataFlow(Data data, DataFlow df) {
		DataFlow ndf = copyDataFlow(df);
		ndf.setName(data.getName());
		ndf.getData().clear();
		ndf.getData().add(copyData(data));
		return ndf;
	}

	private static Data copyData(Data d) {
		Data nd = DataFlowDiagramFactory.eINSTANCE.createData();
		nd.setName(d.getName());
		nd.setType(d.getType());
		return nd;
	}

	private static DataFlow copyDataFlow(DataFlow df) {
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

	
	public static void createLeveledDFD(List<DataFlow> inc, List<DataFlow> out, Process p, DataFlowDiagram oldDFD,
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
	
	private static boolean isRefinedBy(DataFlowDiagram upper, DataFlowDiagram lower) {
		return upper.getRefinedBy().stream().map(r -> r.getRefiningDiagram())
				.anyMatch(d -> ComparisonUtil.isEqual(d, lower));
	}
	public static List<EdgeRefinement> getAllRefinements(EObject self, EObject source, EObject target) {
		List<EdgeRefinement> refs = new ArrayList<EdgeRefinement>();

		DataFlowDiagram sourceDFD = (DataFlowDiagram) source.eContainer();
		DataFlowDiagram targetDFD = (DataFlowDiagram) target.eContainer();
		if (isRefinedBy(sourceDFD, targetDFD)) {
			refs.addAll(getOutputRefs(sourceDFD, targetDFD, (Node) source, (Node) target));
		} else {
			refs.addAll(getInputRefs(sourceDFD, targetDFD, (Node) source, (Node) target));
		}
		return refs;

	}
	
	private static List<EdgeRefinement> getInputRefs(DataFlowDiagram sourceDFD, DataFlowDiagram targetDFD, Node source,
			Node target) {
		List<EdgeRefinement> refs = targetDFD.getRefinedBy().stream()
				.filter(r -> ComparisonUtil.isEqual(r.getRefiningDiagram(), sourceDFD)).map(r -> r.getRefinedEdges())
				.flatMap(List::stream).collect(Collectors.toList());
		return refs.stream().filter(r -> ComparisonUtil.isEqual(r.getRefinedEdge().getTarget(), target))
				.collect(Collectors.toList());
	}

	private static List<EdgeRefinement> getOutputRefs(DataFlowDiagram sourceDFD, DataFlowDiagram targetDFD, Node source,
			Node target) {
		List<EdgeRefinement> refs = sourceDFD.getRefinedBy().stream()
				.filter(r -> ComparisonUtil.isEqual(r.getRefiningDiagram(), targetDFD)).map(r -> r.getRefinedEdges())
				.flatMap(List::stream).collect(Collectors.toList());
		return refs.stream().filter(r -> ComparisonUtil.isEqual(r.getRefinedEdge().getSource(), source))
				.collect(Collectors.toList());
	}
	
	private static EdgeRefinement addToRef(DataFlow df, DataFlow ndf, DataFlowDiagramRefinement ref) {
		EdgeRefinement er = DataFlowDiagramFactory.eINSTANCE.createEdgeRefinement();
		er.setRefinedEdge(df);
		if (ndf != null) {
			er.getRefiningEdges().add(ndf);
		}
		ref.getRefinedEdges().add(er);
		return er;
	}

	private static EdgeRefinement getRefinedEdge(DataFlow refiningDF) {
		List<EObject> refs = new ArrayList<EObject>(new EObjectQuery(refiningDF).getInverseReferences("refiningEdges"));
		if (refs.isEmpty())
			return null;
		return (EdgeRefinement) refs.get(0);
	}

	private static Data makeData(Entry e) {
		Data d = DataFlowDiagramFactory.eINSTANCE.createData();
		d.setName(e.getName());
		d.setType(e.getType());
		return d;
	}

	
	public static void refineDF(EObject self, DataFlow df, DataFlowDiagram dfd) {
		Session session = SessionManager.INSTANCE.getSession(df);

		if (df.getData().isEmpty() || !DFDValidationUtil.isRefinable(df)) {
			return;
		}

		EdgeRefinement ref = getRefinedEdge(df);
		if (ref != null) {
			ref.getRefiningEdges().remove(df);
		}

		if (df.getData().size() > 1) {
			// one df per data
			for (Data d : df.getData()) {
				DataFlow ndf = makeSingleDataFlow(d, df);
				dfd.getEdges().add(ndf);
				if (ref != null) {
					ref.getRefiningEdges().add(ndf);
				}

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
				List<Entry> entries = DFDTypeUtil.refineDT(type, session);
				for (Entry e : entries) {
					Data data = makeData(e);
					DataFlow ndf = makeSingleDataFlow(data, df);
					ndf.setName(name + suffix++);
					dfs.add(ndf);
					if (ref != null) {
						ref.getRefiningEdges().add(ndf);
					}
				}
				dfd.getEdges().remove(df);
				dfd.getEdges().addAll(dfs);
			}

		}

	}
	
	private static DataFlowDiagramRefinement getRefinement(EObject node) {
		return (DataFlowDiagramRefinement) new ArrayList<EObject>(
				new EObjectQuery(node).getInverseReferences("refinedProcess")).get(0);
	}
	
	public static boolean isRefined(EObject self) {
		List<EObject> refs = new ArrayList<EObject>(new EObjectQuery(self).getInverseReferences("refinedProcess"));
		return !refs.isEmpty();
	}
	
	public static void addNewRefinedDF(EObject self, EObject source, EObject target) {

		DataFlowDiagram sourceDFD = (DataFlowDiagram) source.eContainer();
		DataFlowDiagram targetDFD = (DataFlowDiagram) target.eContainer();
		DataFlow df = DataFlowDiagramFactory.eINSTANCE.createDataFlow();
		df.setSource((Node) source);
		df.setTarget((Node) target);
		df.setName("new Data Flow");
		if (isSameDFD(source, target)) { // to/from refinedNode
			sourceDFD.getEdges().add(df);

			if (isRefined(source) && isRefined(target)) {
				DataFlowDiagramRefinement sourceRef = getRefinement(source);
				addToRef(df, null, sourceRef);
				DataFlowDiagramRefinement targetRef = getRefinement(target);
				addToRef(df, null, targetRef);
			} else {
				DataFlowDiagramRefinement ref = isRefined(source) ? getRefinement(source) : getRefinement(target);
				addToRef(df, null, ref);
			}
			// TODO: is allowed?
		} else { // to/from border node
			if (isRefinedBy(sourceDFD, targetDFD)) {
				// add ref to output refs of source-node
			} else {
				// add ref to input refs of target-node
			}

		}

	}
}
