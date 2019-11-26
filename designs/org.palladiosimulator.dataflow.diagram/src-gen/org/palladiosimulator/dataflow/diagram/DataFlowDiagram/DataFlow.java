/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram;

import identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow#getData <em>Data</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow#getSource <em>Source</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getDataFlow()
 * @model
 * @generated
 */
public interface DataFlow extends Identifier {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getDataFlow_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Component)
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getDataFlow_Source()
	 * @model required="true"
	 * @generated
	 */
	Component getSource();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Component value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Component)
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getDataFlow_Target()
	 * @model required="true"
	 * @generated
	 */
	Component getTarget();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Component value);

} // DataFlow
