/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	DataFlowDiagramPackage eINSTANCE = org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl.init();

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
	int DATA_FLOW_DIAGRAM__ID = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER__ID;

	/**
     * The feature id for the '<em><b>Components</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_FLOW_DIAGRAM__COMPONENTS = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Refined By</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_FLOW_DIAGRAM__REFINED_BY = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Refines</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_FLOW_DIAGRAM__REFINES = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
     * The number of structural features of the '<em>Data Flow Diagram</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_FLOW_DIAGRAM_FEATURE_COUNT = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
     * The number of operations of the '<em>Data Flow Diagram</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_FLOW_DIAGRAM_OPERATION_COUNT = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.ComponentImpl
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getComponent()
     * @generated
     */
	int COMPONENT = 1;

	/**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__ID = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER__ID;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__NAME = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Incoming Data Flow</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__INCOMING_DATA_FLOW = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Outgoing Data Flow</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT__OUTGOING_DATA_FLOW = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
     * The number of structural features of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_FEATURE_COUNT = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
     * The number of operations of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int COMPONENT_OPERATION_COUNT = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.ExternalActorImpl <em>External Actor</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.ExternalActorImpl
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getExternalActor()
     * @generated
     */
	int EXTERNAL_ACTOR = 2;

	/**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXTERNAL_ACTOR__ID = COMPONENT__ID;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXTERNAL_ACTOR__NAME = COMPONENT__NAME;

	/**
     * The feature id for the '<em><b>Incoming Data Flow</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXTERNAL_ACTOR__INCOMING_DATA_FLOW = COMPONENT__INCOMING_DATA_FLOW;

	/**
     * The feature id for the '<em><b>Outgoing Data Flow</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXTERNAL_ACTOR__OUTGOING_DATA_FLOW = COMPONENT__OUTGOING_DATA_FLOW;

	/**
     * The number of structural features of the '<em>External Actor</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXTERNAL_ACTOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
     * The number of operations of the '<em>External Actor</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXTERNAL_ACTOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.StoreImpl <em>Store</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.StoreImpl
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getStore()
     * @generated
     */
	int STORE = 3;

	/**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STORE__ID = COMPONENT__ID;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STORE__NAME = COMPONENT__NAME;

	/**
     * The feature id for the '<em><b>Incoming Data Flow</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STORE__INCOMING_DATA_FLOW = COMPONENT__INCOMING_DATA_FLOW;

	/**
     * The feature id for the '<em><b>Outgoing Data Flow</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STORE__OUTGOING_DATA_FLOW = COMPONENT__OUTGOING_DATA_FLOW;

	/**
     * The number of structural features of the '<em>Store</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STORE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
     * The number of operations of the '<em>Store</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STORE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.ProcessImpl
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getProcess()
     * @generated
     */
	int PROCESS = 4;

	/**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCESS__ID = COMPONENT__ID;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCESS__NAME = COMPONENT__NAME;

	/**
     * The feature id for the '<em><b>Incoming Data Flow</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCESS__INCOMING_DATA_FLOW = COMPONENT__INCOMING_DATA_FLOW;

	/**
     * The feature id for the '<em><b>Outgoing Data Flow</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCESS__OUTGOING_DATA_FLOW = COMPONENT__OUTGOING_DATA_FLOW;

	/**
     * The number of structural features of the '<em>Process</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCESS_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
     * The number of operations of the '<em>Process</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCESS_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.PortImpl
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getPort()
     * @generated
     */
	int PORT = 5;

	/**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PORT__ID = COMPONENT__ID;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PORT__NAME = COMPONENT__NAME;

	/**
     * The feature id for the '<em><b>Incoming Data Flow</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PORT__INCOMING_DATA_FLOW = COMPONENT__INCOMING_DATA_FLOW;

	/**
     * The feature id for the '<em><b>Outgoing Data Flow</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PORT__OUTGOING_DATA_FLOW = COMPONENT__OUTGOING_DATA_FLOW;

	/**
     * The number of structural features of the '<em>Port</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PORT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
     * The number of operations of the '<em>Port</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PORT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.RefiningReferenceImpl <em>Refining Reference</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.RefiningReferenceImpl
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getRefiningReference()
     * @generated
     */
	int REFINING_REFERENCE = 6;

	/**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFINING_REFERENCE__ID = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER__ID;

	/**
     * The feature id for the '<em><b>Refined Processes</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFINING_REFERENCE__REFINED_PROCESSES = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Refining Reference</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFINING_REFERENCE_FEATURE_COUNT = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
     * The number of operations of the '<em>Refining Reference</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REFINING_REFERENCE_OPERATION_COUNT = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowImpl <em>Data Flow</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowImpl
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getDataFlow()
     * @generated
     */
	int DATA_FLOW = 7;

	/**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_FLOW__ID = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER__ID;

	/**
     * The feature id for the '<em><b>Data</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_FLOW__DATA = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_FLOW__SOURCE = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_FLOW__TARGET = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_FLOW__NAME = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Data Flow</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_FLOW_FEATURE_COUNT = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
     * The number of operations of the '<em>Data Flow</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_FLOW_OPERATION_COUNT = de.uka.ipd.sdq.identifier.IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataImpl <em>Data</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataImpl
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getData()
     * @generated
     */
	int DATA = 8;

	/**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA__TYPE = 0;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA__NAME = 1;

    /**
     * The number of structural features of the '<em>Data</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_FEATURE_COUNT = 2;

	/**
     * The number of operations of the '<em>Data</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_OPERATION_COUNT = 0;

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
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram#getComponents <em>Components</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Components</em>'.
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram#getComponents()
     * @see #getDataFlowDiagram()
     * @generated
     */
	EReference getDataFlowDiagram_Components();

	/**
     * Returns the meta object for the reference list '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram#getRefinedBy <em>Refined By</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Refined By</em>'.
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram#getRefinedBy()
     * @see #getDataFlowDiagram()
     * @generated
     */
	EReference getDataFlowDiagram_RefinedBy();

	/**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram#getRefines <em>Refines</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Refines</em>'.
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram#getRefines()
     * @see #getDataFlowDiagram()
     * @generated
     */
	EReference getDataFlowDiagram_Refines();

	/**
     * Returns the meta object for class '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Component <em>Component</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component</em>'.
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Component
     * @generated
     */
	EClass getComponent();

	/**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Component#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Component#getName()
     * @see #getComponent()
     * @generated
     */
	EAttribute getComponent_Name();

	/**
     * Returns the meta object for the reference list '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Component#getIncomingDataFlow <em>Incoming Data Flow</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Incoming Data Flow</em>'.
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Component#getIncomingDataFlow()
     * @see #getComponent()
     * @generated
     */
	EReference getComponent_IncomingDataFlow();

	/**
     * Returns the meta object for the reference list '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Component#getOutgoingDataFlow <em>Outgoing Data Flow</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Outgoing Data Flow</em>'.
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Component#getOutgoingDataFlow()
     * @see #getComponent()
     * @generated
     */
	EReference getComponent_OutgoingDataFlow();

	/**
     * Returns the meta object for class '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.ExternalActor <em>External Actor</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>External Actor</em>'.
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.ExternalActor
     * @generated
     */
	EClass getExternalActor();

	/**
     * Returns the meta object for class '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Store <em>Store</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Store</em>'.
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Store
     * @generated
     */
	EClass getStore();

	/**
     * Returns the meta object for class '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process <em>Process</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Process</em>'.
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process
     * @generated
     */
	EClass getProcess();

	/**
     * Returns the meta object for class '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Port <em>Port</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Port</em>'.
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Port
     * @generated
     */
	EClass getPort();

	/**
     * Returns the meta object for class '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.RefiningReference <em>Refining Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Refining Reference</em>'.
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.RefiningReference
     * @generated
     */
	EClass getRefiningReference();

	/**
     * Returns the meta object for the reference list '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.RefiningReference#getRefinedProcesses <em>Refined Processes</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Refined Processes</em>'.
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.RefiningReference#getRefinedProcesses()
     * @see #getRefiningReference()
     * @generated
     */
	EReference getRefiningReference_RefinedProcesses();

	/**
     * Returns the meta object for class '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow <em>Data Flow</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Flow</em>'.
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow
     * @generated
     */
	EClass getDataFlow();

	/**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow#getData <em>Data</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data</em>'.
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow#getData()
     * @see #getDataFlow()
     * @generated
     */
	EReference getDataFlow_Data();

	/**
     * Returns the meta object for the reference '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow#getSource()
     * @see #getDataFlow()
     * @generated
     */
	EReference getDataFlow_Source();

	/**
     * Returns the meta object for the reference '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow#getTarget()
     * @see #getDataFlow()
     * @generated
     */
	EReference getDataFlow_Target();

	/**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow#getName()
     * @see #getDataFlow()
     * @generated
     */
    EAttribute getDataFlow_Name();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Data <em>Data</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data</em>'.
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Data
     * @generated
     */
	EClass getData();

	/**
     * Returns the meta object for the reference '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Data#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Data#getType()
     * @see #getData()
     * @generated
     */
	EReference getData_Type();

	/**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Data#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Data#getName()
     * @see #getData()
     * @generated
     */
    EAttribute getData_Name();

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
		/**
         * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DATA_FLOW_DIAGRAM__COMPONENTS = eINSTANCE.getDataFlowDiagram_Components();
		/**
         * The meta object literal for the '<em><b>Refined By</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DATA_FLOW_DIAGRAM__REFINED_BY = eINSTANCE.getDataFlowDiagram_RefinedBy();
		/**
         * The meta object literal for the '<em><b>Refines</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DATA_FLOW_DIAGRAM__REFINES = eINSTANCE.getDataFlowDiagram_Refines();
		/**
         * The meta object literal for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.ComponentImpl <em>Component</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.ComponentImpl
         * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getComponent()
         * @generated
         */
		EClass COMPONENT = eINSTANCE.getComponent();
		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();
		/**
         * The meta object literal for the '<em><b>Incoming Data Flow</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference COMPONENT__INCOMING_DATA_FLOW = eINSTANCE.getComponent_IncomingDataFlow();
		/**
         * The meta object literal for the '<em><b>Outgoing Data Flow</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference COMPONENT__OUTGOING_DATA_FLOW = eINSTANCE.getComponent_OutgoingDataFlow();
		/**
         * The meta object literal for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.ExternalActorImpl <em>External Actor</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.ExternalActorImpl
         * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getExternalActor()
         * @generated
         */
		EClass EXTERNAL_ACTOR = eINSTANCE.getExternalActor();
		/**
         * The meta object literal for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.StoreImpl <em>Store</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.StoreImpl
         * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getStore()
         * @generated
         */
		EClass STORE = eINSTANCE.getStore();
		/**
         * The meta object literal for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.ProcessImpl <em>Process</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.ProcessImpl
         * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getProcess()
         * @generated
         */
		EClass PROCESS = eINSTANCE.getProcess();
		/**
         * The meta object literal for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.PortImpl <em>Port</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.PortImpl
         * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getPort()
         * @generated
         */
		EClass PORT = eINSTANCE.getPort();
		/**
         * The meta object literal for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.RefiningReferenceImpl <em>Refining Reference</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.RefiningReferenceImpl
         * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getRefiningReference()
         * @generated
         */
		EClass REFINING_REFERENCE = eINSTANCE.getRefiningReference();
		/**
         * The meta object literal for the '<em><b>Refined Processes</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference REFINING_REFERENCE__REFINED_PROCESSES = eINSTANCE.getRefiningReference_RefinedProcesses();
		/**
         * The meta object literal for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowImpl <em>Data Flow</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowImpl
         * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getDataFlow()
         * @generated
         */
		EClass DATA_FLOW = eINSTANCE.getDataFlow();
		/**
         * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DATA_FLOW__DATA = eINSTANCE.getDataFlow_Data();
		/**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DATA_FLOW__SOURCE = eINSTANCE.getDataFlow_Source();
		/**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DATA_FLOW__TARGET = eINSTANCE.getDataFlow_Target();
		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_FLOW__NAME = eINSTANCE.getDataFlow_Name();
        /**
         * The meta object literal for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataImpl <em>Data</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataImpl
         * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getData()
         * @generated
         */
		EClass DATA = eINSTANCE.getData();
		/**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DATA__TYPE = eINSTANCE.getData_Type();
        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA__NAME = eINSTANCE.getData_Name();

	}

} //DataFlowDiagramPackage
