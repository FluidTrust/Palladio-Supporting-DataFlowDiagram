package diagram.editor.sirius.util;

import java.util.ArrayList;
import java.util.List;
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
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.CompositeDataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.Entry;

public class DFDRefinementUtil {
	
	private static EdgeRefinement currentRefinement = null;
	
	public static void setCurrentRefinement(EdgeRefinement ncurrentRefinement) {
		currentRefinement = ncurrentRefinement;
	}
	
	public static EdgeRefinement getCurrentRefinement() {
		return currentRefinement;
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
				DataFlow ndf = DFDModificationUtil.makeSingleDataFlow(d, df);
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
					Data data = DFDModificationUtil.makeData(e);
					DataFlow ndf = DFDModificationUtil.makeSingleDataFlow(data, df);
					ndf.setName(name + suffix++);
					dfs.add(ndf);
				}
				results.addAll(dfs);
			}
		}
		return results;

	}
	

	public static boolean needsRef(EObject a, EObject b) {
		boolean sameDFD = isSameDFD(a, b);
		boolean toRef = isRefined(a);
		boolean fromRef = isRefined(b);
		return (!sameDFD || toRef || fromRef);
	}
	
	public static DataFlowDiagramRefinement getRefinement(EObject node) {
		return (DataFlowDiagramRefinement) new ArrayList<EObject>(
				new EObjectQuery(node).getInverseReferences("refinedProcess")).get(0);
	}
	
	public static boolean isRefined(EObject self) {
		List<EObject> refs = new ArrayList<EObject>(new EObjectQuery(self).getInverseReferences("refinedProcess"));
		return !refs.isEmpty();
	}
	
	public static boolean isRefinedDFD(EObject self) {
		List<EObject> refs = new ArrayList<EObject>(new EObjectQuery(self).getInverseReferences("refiningDiagram"));
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
	
	public static EdgeRefinement addToRef(DataFlow df, DataFlow ndf, DataFlowDiagramRefinement ref) {
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
				DataFlow ndf = DFDModificationUtil.makeSingleDataFlow(d, df);
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
					Data data = DFDModificationUtil.makeData(e);
					DataFlow ndf = DFDModificationUtil.makeSingleDataFlow(data, df);
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

}
