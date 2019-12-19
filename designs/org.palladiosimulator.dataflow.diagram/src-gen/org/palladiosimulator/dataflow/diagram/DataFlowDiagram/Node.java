/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node#getRequiringProcesses <em>Requiring Processes</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node#getProvidingProcesses <em>Providing Processes</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node#getEquals <em>Equals</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends NamedComponent {
	/**
	 * Returns the value of the '<em><b>Requiring Processes</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiring Processes</em>' reference list.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getNode_RequiringProcesses()
	 * @model transient="true" volatile="true"
	 * @generated
	 */
	EList<Node> getRequiringProcesses();

	/**
	 * Returns the value of the '<em><b>Providing Processes</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providing Processes</em>' reference list.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getNode_ProvidingProcesses()
	 * @model transient="true" volatile="true"
	 * @generated
	 */
	EList<Node> getProvidingProcesses();

	/**
	 * Returns the value of the '<em><b>Equals</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equals</em>' reference list.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getNode_Equals()
	 * @model
	 * @generated
	 */
	EList<Node> getEquals();

} // Node
