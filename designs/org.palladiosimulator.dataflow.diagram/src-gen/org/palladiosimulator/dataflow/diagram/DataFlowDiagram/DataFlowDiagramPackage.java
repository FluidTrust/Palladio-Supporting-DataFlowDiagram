/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram;

import identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramFactory
 * @model kind="package"
 * @generated
 */
public interface DataFlowDiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DataFlowDiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/dataflow/diagram/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DataFlowDiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataFlowDiagramPackage eINSTANCE = org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramImpl <em>Data Flow Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramImpl
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getDataFlowDiagram()
	 * @generated
	 */
	int DATA_FLOW_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The number of structural features of the '<em>Data Flow Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Flow Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram <em>Data Flow Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow Diagram</em>'.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram
	 * @generated
	 */
	EClass getDataFlowDiagram();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFlowDiagramFactory getDataFlowDiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramImpl <em>Data Flow Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramImpl
		 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getDataFlowDiagram()
		 * @generated
		 */
		EClass DATA_FLOW_DIAGRAM = eINSTANCE.getDataFlowDiagram();

	}

} //DataFlowDiagramPackage
