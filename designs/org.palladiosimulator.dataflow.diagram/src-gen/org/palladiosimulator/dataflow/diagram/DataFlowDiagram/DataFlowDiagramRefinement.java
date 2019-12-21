/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement#getRefinedProcesses <em>Refined Processes</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement#getRefiningDiagram <em>Refining Diagram</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getDataFlowDiagramRefinement()
 * @model
 * @generated
 */
public interface DataFlowDiagramRefinement extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Refined Processes</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Processes</em>' reference list.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getDataFlowDiagramRefinement_RefinedProcesses()
	 * @model required="true"
	 * @generated
	 */
	EList<org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process> getRefinedProcesses();

	/**
	 * Returns the value of the '<em><b>Refining Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refining Diagram</em>' containment reference.
	 * @see #setRefiningDiagram(DataFlowDiagram)
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getDataFlowDiagramRefinement_RefiningDiagram()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataFlowDiagram getRefiningDiagram();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement#getRefiningDiagram <em>Refining Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refining Diagram</em>' containment reference.
	 * @see #getRefiningDiagram()
	 * @generated
	 */
	void setRefiningDiagram(DataFlowDiagram value);

} // DataFlowDiagramRefinement
