package diagram.editor.sirius.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.ui.util.WorkbenchPartDescriptor;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.ui.part.ValidateAction;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.ui.IEditorPart;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Edge;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.EdgeRefinement;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.CompositeDataType;

public class DFDValidationUtil {

	/**
	 * TODO you can get the current representation in two steps:
	 * 
	 * 1. retrieve current session from
	 * org.eclipse.sirius.business.api.session.SessionManager.INSTANCE.sessions 2.
	 * get list of representations from
	 * org.eclipse.sirius.business.api.dialect.DialectManager.INSTANCE.getAllRepresentations(session)
	 * 
	 * 
	 * Another solution, that should be more efficient, you can also retrieve the
	 * DDiagram by using the crossreference[1]: Collection<EObject> result = new
	 * EObjectQuery(mySemanticElement).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
	 * 
	 * This will give you the diagram element representing your semantic element.
	 * From this element, all you need to do is find the container that is a
	 * DRepresentation (here a DDiagram) and you will have the name of the diagram.
	 * 
	 * @param session
	 * @param diagram
	 */

	public static void validateDiagram(DataFlowDiagram dfd) {
		Session session = SessionManager.INSTANCE.getSession(dfd);
		DRepresentation diagram = getRepresentation(session, dfd);
		IEditorPart editorPart = DialectUIManager.INSTANCE.openEditor(session, diagram, new NullProgressMonitor());
		WorkbenchPartDescriptor workbenchPartDescriptor = new WorkbenchPartDescriptor(editorPart.getSite().getId(),
				editorPart.getClass(), editorPart.getSite().getPage());
		ValidateAction va = new ValidateAction(workbenchPartDescriptor);
		va.run();
	}

	private static DRepresentation getRepresentation(Session session, DataFlowDiagram dfd) { // TODO
		/*
		 * for (DRepresentation r :
		 * DialectManager.INSTANCE.getAllRepresentations(session)) {
		 * System.out.println(r); System.out.println(r.eContents());
		 * 
		 * }
		 */
		return null;

	}

	public static boolean inputOutputIsConsistent(EObject self) {

		Node n = (Node) self;

		if (hasEmptyEdgeRefinements(n)) {
			return false;
		}
		if (!DFDModificationUtil.isBorderNode(n)) {
			return true;
		}

		Set<DataFlowDiagram> allContexts = DFDModificationUtil.getContexts(n);
		for (DataFlowDiagram context : allContexts) {
			Tuple<List<EdgeRefinement>, List<EdgeRefinement>> toCheck = DFDModificationUtil.getEdgeRefinements(n,
					context);
			if (!isConsistent(toCheck.getFirst()).stream().allMatch(t -> t.getSecond())) { // check inputs
				return false;
			}

			if (!isConsistent(toCheck.getSecond()).stream().allMatch(t -> t.getSecond())) { // check outputs
				return false;
			}
		}

		return true;
	}

	private static boolean hasEmptyEdgeRefinements(Node n) {
		Tuple<List<EdgeRefinement>, List<EdgeRefinement>> refinements = DFDModificationUtil.getEdgeRefinements(n,
				(DataFlowDiagram) n.eContainer());

		for (EdgeRefinement er : refinements.getFirst()) {
			if (er.getRefiningEdges().isEmpty()) {
				return true;
			}
		}

		for (EdgeRefinement er : refinements.getSecond()) {
			if (er.getRefiningEdges().isEmpty()) {
				return true;
			}
		}

		return false;

	}

	public static List<Tuple<EdgeRefinement, Boolean>> isConsistent(List<EdgeRefinement> toCheck) {
		List<Tuple<EdgeRefinement, Boolean>> results = new ArrayList<Tuple<EdgeRefinement, Boolean>>();
		for (EdgeRefinement ref : toCheck) {
			boolean currentResult = true;
			Edge base = ref.getRefinedEdge();
			if (!canMerge(base, ref.getRefiningEdges())) {
				currentResult = false;
			}
			results.add(new Tuple<EdgeRefinement, Boolean>(ref, currentResult));
		}

		return results;
	}

	private static boolean canMerge(Edge base, List<Edge> refiningEdges) {
		if (isEquivalent(new ArrayList<Edge>(List.of(base)), refiningEdges)) {
			return true;
		}

		if (!isRefinable(base)) {
			return false;
		}
		// generate all candidates; initialized with first refinement
		List<List<Edge>> candidates = new ArrayList<List<Edge>>();
		List<List<Edge>> newCandidates = new ArrayList<List<Edge>>(List.of(DFDRefinementUtil.refineEdge(base)));

		while (!isEquivalentList(candidates, newCandidates)) {
			candidates.clear();
			candidates.addAll(newCandidates);
			newCandidates.clear();
			for (List<Edge> c : candidates) {
				if (isEquivalent(c, refiningEdges)) { // check if current candidate is solution
					System.out.println("---");
					return true;
				}

				for (List<Edge> r : refineOne(c)) { // refine one df of each candidate -> will over time generate all
													// possible combinations of refinements
					if (!contains(r, newCandidates)) { // do not consider duplicates
						newCandidates.add(r);
					}
				}
			}
		}
		return false;
	}

	public static boolean isRefinable(Edge e) {
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

	private static boolean contains(List<Edge> target, List<List<Edge>> test) {
		for (List<Edge> t : test) {
			if (isEquivalent(t, target)) {
				return true;
			}
		}

		return false;
	}

	private static boolean isEquivalentList(List<List<Edge>> one, List<List<Edge>> two) {
		if (one.size() != two.size()) {
			return false;
		}

		for (List<Edge> o : one) {
			if (!contains(o, two)) {
				return false;
			}
		}

		for (List<Edge> t : two) {
			if (!contains(t, one))
				return false;
		}

		return true;
	}

	private static boolean isEquivalent(List<Edge> base, List<Edge> subFlows) {
		// TODO consider duplicates
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

	private static List<List<Edge>> refineAllButOne(List<Edge> input) {
		List<List<Edge>> results = new ArrayList<List<Edge>>();

		for (int exception = 0; exception < input.size(); exception++) {

			List<Edge> currentResults = new ArrayList<Edge>();

			for (int i = 0; i < input.size(); i++) {

				if (i == exception || !isRefinable(input.get(i))) {
					currentResults.add(input.get(i));
					continue;
				}
				currentResults.addAll(DFDRefinementUtil.refineEdge(input.get(i)));
			}
			results.add(currentResults);

		}
		return results;

	}

	private static List<List<Edge>> refineOne(List<Edge> input) {
		List<List<Edge>> results = new ArrayList<List<Edge>>();

		for (int exception = 0; exception < input.size(); exception++) {

			List<Edge> currentResults = new ArrayList<Edge>();

			for (int i = 0; i < input.size(); i++) {

				if (i == exception && isRefinable(input.get(i))) {
					currentResults.addAll(DFDRefinementUtil.refineEdge(input.get(i)));
					continue;
				}
				currentResults.add(input.get(i));
			}
			results.add(currentResults);

		}
		return results;

	}
}
