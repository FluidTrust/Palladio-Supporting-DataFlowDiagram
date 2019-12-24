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
public interface Node extends Component {
	/**
	 * Returns the value of the '<em><b>Requiring Processes</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiring Processes</em>' reference list.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getNode_RequiringProcesses()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.oclAsType(ecore::EObject).eContainer().oclAsType(DataFlowDiagram).edges-&gt;selectByKind(DataFlow)-&gt;select(df | df.source = self).target-&gt;asOrderedSet()'"
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
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.oclAsType(ecore::EObject).eContainer().oclAsType(DataFlowDiagram).edges-&gt;selectByKind(DataFlow)-&gt;select(df | df.source = self).source-&gt;asOrderedSet()'"
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
