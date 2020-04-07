package org.palladiosimulator.dataflow.diagram.editor.sirius.util.modification;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Edge;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.EdgeRefinement;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process;
import org.palladiosimulator.dataflow.diagram.editor.sirius.util.leveling.ComparisonUtil;
import org.palladiosimulator.dataflow.diagram.editor.sirius.util.leveling.DFDRefinementUtil;



/**
 * 
 * Utility class handling modification of existing dfds as well as creation of
 * new (i.e., refining) ones.
 *
 */
public class DFDModificationUtil {

	private static void removeFromRefs(DataFlow df) {
		List<EObject> refs = QueryUtil.getInverseReferences(df, "refiningEdges");
		refs.addAll(QueryUtil.getInverseReferences(df, "refinedEdge"));
		List<EdgeRefinement> toDelete = new ArrayList<EdgeRefinement>();
		for (EObject r : refs) {
			EdgeRefinement er = (EdgeRefinement) r;
			er.getRefiningEdges().remove(df);
			if (er.getRefinedEdge() == null || ComparisonUtil.isEqual(er.getRefinedEdge(), df)) {
				toDelete.add((EdgeRefinement) er);
			}
		}

		for (EdgeRefinement er : toDelete) {
			DataFlowDiagramRefinement ref = (DataFlowDiagramRefinement) er.eContainer();
			ref.getRefinedEdges().remove(er);

		}

	}

	public static void deleteEdge(EObject self) {
		DataFlowDiagram dfd = (DataFlowDiagram) self.eContainer();
		removeFromRefs((DataFlow) self);
		dfd.getEdges().remove(self);
	}

	public static void deleteNode(EObject self) {

		List<EObject> refiningRefs = QueryUtil.getInverseReferences(self, "refinedProcess");

		List<EObject> targetRefs = QueryUtil.getInverseReferences(self, "target").stream()
				.filter(r -> r instanceof DataFlow).collect(Collectors.toList());
		List<EObject> sourceRefs = QueryUtil.getInverseReferences(self, "source").stream()
				.filter(r -> r instanceof DataFlow).collect(Collectors.toList());

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

	public static void createLeveledDFD(List<DataFlow> inc, List<DataFlow> out, Process p, DataFlowDiagram oldDFD,
			DataFlowDiagram newDFD, DataFlowDiagramRefinement ref) {

		Node newProcess = ComponentFactory.copyNode(p);
		newDFD.getNodes().add(newProcess);

		for (DataFlow df : inc) {
			DataFlow ndf = ComponentFactory.copyDataFlow(df);
			ndf.setTarget(newProcess);
			newDFD.getEdges().add(ndf);
			DFDRefinementUtil.addToRef(df, ndf, ref);
		}

		for (DataFlow df : out) {
			DataFlow ndf = ComponentFactory.copyDataFlow(df);
			ndf.setSource(newProcess);
			newDFD.getEdges().add(ndf);
			DFDRefinementUtil.addToRef(df, ndf, ref);
		}
	}

}
