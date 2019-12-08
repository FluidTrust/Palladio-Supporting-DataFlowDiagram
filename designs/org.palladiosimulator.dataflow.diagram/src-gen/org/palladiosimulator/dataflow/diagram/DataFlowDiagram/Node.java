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
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node#getOutgoingDataFlow <em>Outgoing Data Flow</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node#getIncomingDataFlow <em>Incoming Data Flow</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends Component {
	/**
	 * Returns the value of the '<em><b>Outgoing Data Flow</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Data Flow</em>' reference list.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getNode_OutgoingDataFlow()
	 * @model
	 * @generated
	 */
	EList<Node> getOutgoingDataFlow();

	/**
	 * Returns the value of the '<em><b>Incoming Data Flow</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Data Flow</em>' reference list.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getNode_IncomingDataFlow()
	 * @model
	 * @generated
	 */
	EList<Node> getIncomingDataFlow();

} // Node
