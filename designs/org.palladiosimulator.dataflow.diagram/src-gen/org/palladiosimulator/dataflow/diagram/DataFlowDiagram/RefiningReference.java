/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram;

import identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refining Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.RefiningReference#getRefinedProcesses <em>Refined Processes</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getRefiningReference()
 * @model
 * @generated
 */
public interface RefiningReference extends Identifier {
	/**
	 * Returns the value of the '<em><b>Refined Processes</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Processes</em>' reference list.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getRefiningReference_RefinedProcesses()
	 * @model required="true"
	 * @generated
	 */
	EList<org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process> getRefinedProcesses();

} // RefiningReference
