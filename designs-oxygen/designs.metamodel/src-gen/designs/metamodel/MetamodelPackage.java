/**
 */
package designs.metamodel;

import designs.metamodel.identifier.IdentifierPackage;
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
 * <!-- begin-model-doc -->
 * <p>
 * Inherit from this entity to make an element uniquely identifiable.<br />
 * Identifiers&nbsp;are&nbsp;not&nbsp;fixed&nbsp;to&nbsp;one&nbsp;realization.<br />
 * GUIDs&nbsp;are&nbsp;recommend.&nbsp;GUIDs&nbsp;are&nbsp;described&nbsp;in&nbsp;their&nbsp;own&nbsp;model.&nbsp;See&nbsp;GUIDModel&nbsp;(GUID.emx).<br />
 * Identifier&nbsp;implementations&nbsp;can&nbsp;be&nbsp;found&nbsp;in&nbsp;external&nbsp;projects&nbsp;only.
 * </p>
 * <!-- end-model-doc -->
 * @see designs.metamodel.MetamodelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL identifierIsUnique='Identifier.allInstances()-&gt;isUnique(p: Identifier | p.id)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='identifierIsUnique'"
 * @generated
 */
public interface MetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelPackage eINSTANCE = designs.metamodel.impl.MetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link designs.metamodel.impl.DataFlowDiagramImpl <em>Data Flow Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designs.metamodel.impl.DataFlowDiagramImpl
	 * @see designs.metamodel.impl.MetamodelPackageImpl#getDataFlowDiagram()
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
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM__COMPONENT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM__REFINES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM__REFINED_BY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Flow Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Flow Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link designs.metamodel.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designs.metamodel.impl.ComponentImpl
	 * @see designs.metamodel.impl.MetamodelPackageImpl#getComponent()
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
	int COMPONENT__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Incoming Data Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INCOMING_DATA_FLOW = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Data Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OUTGOING_DATA_FLOW = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link designs.metamodel.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designs.metamodel.impl.DataFlowImpl
	 * @see designs.metamodel.impl.MetamodelPackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Incoming Data Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__INCOMING_DATA_FLOW = COMPONENT__INCOMING_DATA_FLOW;

	/**
	 * The feature id for the '<em><b>Outgoing Data Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__OUTGOING_DATA_FLOW = COMPONENT__OUTGOING_DATA_FLOW;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__DATA = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__SOURCE = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__TARGET = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__TYPE = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link designs.metamodel.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designs.metamodel.impl.ProcessImpl
	 * @see designs.metamodel.impl.MetamodelPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ID = COMPONENT__ID;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = COMPONENT__NAME;

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
	 * The meta object id for the '{@link designs.metamodel.impl.ExternalActorImpl <em>External Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designs.metamodel.impl.ExternalActorImpl
	 * @see designs.metamodel.impl.MetamodelPackageImpl#getExternalActor()
	 * @generated
	 */
	int EXTERNAL_ACTOR = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTOR__ID = COMPONENT__ID;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTOR__NAME = COMPONENT__NAME;

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
	 * The meta object id for the '{@link designs.metamodel.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designs.metamodel.impl.StoreImpl
	 * @see designs.metamodel.impl.MetamodelPackageImpl#getStore()
	 * @generated
	 */
	int STORE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ID = COMPONENT__ID;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__NAME = COMPONENT__NAME;

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
	 * The meta object id for the '{@link designs.metamodel.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designs.metamodel.impl.DataImpl
	 * @see designs.metamodel.impl.MetamodelPackageImpl#getData()
	 * @generated
	 */
	int DATA = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link designs.metamodel.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designs.metamodel.impl.PortImpl
	 * @see designs.metamodel.impl.MetamodelPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ID = COMPONENT__ID;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = COMPONENT__NAME;

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
	 * The meta object id for the '{@link designs.metamodel.impl.RefiningReferenceImpl <em>Refining Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designs.metamodel.impl.RefiningReferenceImpl
	 * @see designs.metamodel.impl.MetamodelPackageImpl#getRefiningReference()
	 * @generated
	 */
	int REFINING_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINING_REFERENCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Refined Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINING_REFERENCE__REFINED_PROCESSES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Refining Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINING_REFERENCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Refining Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINING_REFERENCE_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link designs.metamodel.DataFlowDiagram <em>Data Flow Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow Diagram</em>'.
	 * @see designs.metamodel.DataFlowDiagram
	 * @generated
	 */
	EClass getDataFlowDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link designs.metamodel.DataFlowDiagram#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see designs.metamodel.DataFlowDiagram#getComponent()
	 * @see #getDataFlowDiagram()
	 * @generated
	 */
	EReference getDataFlowDiagram_Component();

	/**
	 * Returns the meta object for the containment reference '{@link designs.metamodel.DataFlowDiagram#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refines</em>'.
	 * @see designs.metamodel.DataFlowDiagram#getRefines()
	 * @see #getDataFlowDiagram()
	 * @generated
	 */
	EReference getDataFlowDiagram_Refines();

	/**
	 * Returns the meta object for the containment reference list '{@link designs.metamodel.DataFlowDiagram#getRefinedBy <em>Refined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refined By</em>'.
	 * @see designs.metamodel.DataFlowDiagram#getRefinedBy()
	 * @see #getDataFlowDiagram()
	 * @generated
	 */
	EReference getDataFlowDiagram_RefinedBy();

	/**
	 * Returns the meta object for class '{@link designs.metamodel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see designs.metamodel.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference list '{@link designs.metamodel.Component#getIncomingDataFlow <em>Incoming Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Data Flow</em>'.
	 * @see designs.metamodel.Component#getIncomingDataFlow()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_IncomingDataFlow();

	/**
	 * Returns the meta object for the reference list '{@link designs.metamodel.Component#getOutgoingDataFlow <em>Outgoing Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Data Flow</em>'.
	 * @see designs.metamodel.Component#getOutgoingDataFlow()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_OutgoingDataFlow();

	/**
	 * Returns the meta object for the attribute '{@link designs.metamodel.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see designs.metamodel.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for class '{@link designs.metamodel.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see designs.metamodel.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link designs.metamodel.DataFlow#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see designs.metamodel.DataFlow#getData()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Data();

	/**
	 * Returns the meta object for the reference '{@link designs.metamodel.DataFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see designs.metamodel.DataFlow#getSource()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link designs.metamodel.DataFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see designs.metamodel.DataFlow#getTarget()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Target();

	/**
	 * Returns the meta object for the containment reference '{@link designs.metamodel.DataFlow#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see designs.metamodel.DataFlow#getType()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Type();

	/**
	 * Returns the meta object for class '{@link designs.metamodel.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see designs.metamodel.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for class '{@link designs.metamodel.ExternalActor <em>External Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Actor</em>'.
	 * @see designs.metamodel.ExternalActor
	 * @generated
	 */
	EClass getExternalActor();

	/**
	 * Returns the meta object for class '{@link designs.metamodel.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store</em>'.
	 * @see designs.metamodel.Store
	 * @generated
	 */
	EClass getStore();

	/**
	 * Returns the meta object for class '{@link designs.metamodel.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see designs.metamodel.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link designs.metamodel.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see designs.metamodel.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

	/**
	 * Returns the meta object for class '{@link designs.metamodel.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see designs.metamodel.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for class '{@link designs.metamodel.RefiningReference <em>Refining Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refining Reference</em>'.
	 * @see designs.metamodel.RefiningReference
	 * @generated
	 */
	EClass getRefiningReference();

	/**
	 * Returns the meta object for the reference list '{@link designs.metamodel.RefiningReference#getRefinedProcesses <em>Refined Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refined Processes</em>'.
	 * @see designs.metamodel.RefiningReference#getRefinedProcesses()
	 * @see #getRefiningReference()
	 * @generated
	 */
	EReference getRefiningReference_RefinedProcesses();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetamodelFactory getMetamodelFactory();

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
		 * The meta object literal for the '{@link designs.metamodel.impl.DataFlowDiagramImpl <em>Data Flow Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designs.metamodel.impl.DataFlowDiagramImpl
		 * @see designs.metamodel.impl.MetamodelPackageImpl#getDataFlowDiagram()
		 * @generated
		 */
		EClass DATA_FLOW_DIAGRAM = eINSTANCE.getDataFlowDiagram();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_DIAGRAM__COMPONENT = eINSTANCE.getDataFlowDiagram_Component();

		/**
		 * The meta object literal for the '<em><b>Refines</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_DIAGRAM__REFINES = eINSTANCE.getDataFlowDiagram_Refines();

		/**
		 * The meta object literal for the '<em><b>Refined By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_DIAGRAM__REFINED_BY = eINSTANCE.getDataFlowDiagram_RefinedBy();

		/**
		 * The meta object literal for the '{@link designs.metamodel.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designs.metamodel.impl.ComponentImpl
		 * @see designs.metamodel.impl.MetamodelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '{@link designs.metamodel.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designs.metamodel.impl.DataFlowImpl
		 * @see designs.metamodel.impl.MetamodelPackageImpl#getDataFlow()
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
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__TYPE = eINSTANCE.getDataFlow_Type();

		/**
		 * The meta object literal for the '{@link designs.metamodel.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designs.metamodel.impl.ProcessImpl
		 * @see designs.metamodel.impl.MetamodelPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '{@link designs.metamodel.impl.ExternalActorImpl <em>External Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designs.metamodel.impl.ExternalActorImpl
		 * @see designs.metamodel.impl.MetamodelPackageImpl#getExternalActor()
		 * @generated
		 */
		EClass EXTERNAL_ACTOR = eINSTANCE.getExternalActor();

		/**
		 * The meta object literal for the '{@link designs.metamodel.impl.StoreImpl <em>Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designs.metamodel.impl.StoreImpl
		 * @see designs.metamodel.impl.MetamodelPackageImpl#getStore()
		 * @generated
		 */
		EClass STORE = eINSTANCE.getStore();

		/**
		 * The meta object literal for the '{@link designs.metamodel.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designs.metamodel.impl.DataImpl
		 * @see designs.metamodel.impl.MetamodelPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NAME = eINSTANCE.getData_Name();

		/**
		 * The meta object literal for the '{@link designs.metamodel.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designs.metamodel.impl.PortImpl
		 * @see designs.metamodel.impl.MetamodelPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '{@link designs.metamodel.impl.RefiningReferenceImpl <em>Refining Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designs.metamodel.impl.RefiningReferenceImpl
		 * @see designs.metamodel.impl.MetamodelPackageImpl#getRefiningReference()
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

	}

} //MetamodelPackage
