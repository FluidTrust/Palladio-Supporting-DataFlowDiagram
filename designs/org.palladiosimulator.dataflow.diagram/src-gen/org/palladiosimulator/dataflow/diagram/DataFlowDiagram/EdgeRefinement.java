/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.EdgeRefinement#getRefinedEdge <em>Refined Edge</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.EdgeRefinement#getRefiningEdges <em>Refining Edges</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getEdgeRefinement()
 * @model
 * @generated
 */
public interface EdgeRefinement extends EObject, Identifier {

	/**
	 * Returns the value of the '<em><b>Refined Edge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Edge</em>' reference.
	 * @see #setRefinedEdge(Edge)
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getEdgeRefinement_RefinedEdge()
	 * @model required="true"
	 * @generated
	 */
	Edge getRefinedEdge();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.EdgeRefinement#getRefinedEdge <em>Refined Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined Edge</em>' reference.
	 * @see #getRefinedEdge()
	 * @generated
	 */
	void setRefinedEdge(Edge value);

	/**
	 * Returns the value of the '<em><b>Refining Edges</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Edge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refining Edges</em>' reference list.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getEdgeRefinement_RefiningEdges()
	 * @model
	 * @generated
	 */
	EList<Edge> getRefiningEdges();
} // EdgeRefinement
