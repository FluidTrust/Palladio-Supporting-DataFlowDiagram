/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
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
	int DATA_FLOW_DIAGRAM__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM__REFINED_BY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM__NODES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM__EDGES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Flow Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.EntityImpl
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

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
	int COMPONENT__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.StoreImpl
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getStore()
	 * @generated
	 */
	int STORE = 3;

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
	 * The meta object id for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowImpl
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 6;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataImpl
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getData()
	 * @generated
	 */
	int DATA = 7;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.NodeImpl
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 9;

				/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = COMPONENT__ID;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = COMPONENT__NAME;

				/**
	 * The feature id for the '<em><b>Requiring Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__REQUIRING_PROCESSES = COMPONENT_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Providing Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PROVIDING_PROCESSES = COMPONENT_FEATURE_COUNT + 1;

				/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

				/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int EXTERNAL_ACTOR__ID = NODE__ID;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int EXTERNAL_ACTOR__NAME = NODE__NAME;

				/**
	 * The feature id for the '<em><b>Requiring Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTOR__REQUIRING_PROCESSES = NODE__REQUIRING_PROCESSES;

				/**
	 * The feature id for the '<em><b>Providing Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTOR__PROVIDING_PROCESSES = NODE__PROVIDING_PROCESSES;

				/**
	 * The number of structural features of the '<em>External Actor</em>' class.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int EXTERNAL_ACTOR_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int STORE__ID = NODE__ID;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int STORE__NAME = NODE__NAME;

				/**
	 * The feature id for the '<em><b>Requiring Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__REQUIRING_PROCESSES = NODE__REQUIRING_PROCESSES;

				/**
	 * The feature id for the '<em><b>Providing Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__PROVIDING_PROCESSES = NODE__PROVIDING_PROCESSES;

				/**
	 * The number of structural features of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int STORE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int PROCESS__ID = NODE__ID;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int PROCESS__NAME = NODE__NAME;

				/**
	 * The feature id for the '<em><b>Requiring Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__REQUIRING_PROCESSES = NODE__REQUIRING_PROCESSES;

				/**
	 * The feature id for the '<em><b>Providing Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROVIDING_PROCESSES = NODE__PROVIDING_PROCESSES;

				/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int PROCESS_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

				/**
	 * The meta object id for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramRefinementImpl <em>Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramRefinementImpl
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getDataFlowDiagramRefinement()
	 * @generated
	 */
	int DATA_FLOW_DIAGRAM_REFINEMENT = 5;

				/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM_REFINEMENT__ID = IdentifierPackage.IDENTIFIER__ID;

				/**
	 * The feature id for the '<em><b>Refined Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM_REFINEMENT__REFINED_PROCESS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Refining Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM_REFINEMENT__REFINING_DIAGRAM = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

				/**
	 * The feature id for the '<em><b>Providing Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM_REFINEMENT__PROVIDING_PROCESSES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

				/**
	 * The feature id for the '<em><b>Requiring Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM_REFINEMENT__REQUIRING_PROCESSES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

				/**
	 * The number of structural features of the '<em>Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM_REFINEMENT_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

				/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int DATA_FLOW__ID = IdentifierPackage.IDENTIFIER__ID;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
				    * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				   int DATA_FLOW__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int DATA_FLOW__TARGET = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

				/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int DATA_FLOW__SOURCE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

				/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int DATA_FLOW__DATA = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

				/**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

				/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ID = ENTITY__ID;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
				    * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				   int DATA__NAME = ENTITY__NAME;

				/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
				int DATA__TYPE = ENTITY_FEATURE_COUNT + 0;

				/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

				/**
	 * The meta object id for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.EdgeImpl
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 8;

				/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ID = COMPONENT__ID;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NAME = COMPONENT__NAME;

				/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = COMPONENT_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = COMPONENT_FEATURE_COUNT + 1;

				/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.NamedElementImpl
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 10;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

				/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

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
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram#getRefinedBy <em>Refined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refined By</em>'.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram#getRefinedBy()
	 * @see #getDataFlowDiagram()
	 * @generated
	 */
	EReference getDataFlowDiagram_RefinedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram#getNodes()
	 * @see #getDataFlowDiagram()
	 * @generated
	 */
	EReference getDataFlowDiagram_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram#getEdges()
	 * @see #getDataFlowDiagram()
	 * @generated
	 */
	EReference getDataFlowDiagram_Edges();

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
	 * Returns the meta object for class '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refinement</em>'.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement
	 * @generated
	 */
	EClass getDataFlowDiagramRefinement();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement#getRefinedProcess <em>Refined Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refined Process</em>'.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement#getRefinedProcess()
	 * @see #getDataFlowDiagramRefinement()
	 * @generated
	 */
	EReference getDataFlowDiagramRefinement_RefinedProcess();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement#getRefiningDiagram <em>Refining Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refining Diagram</em>'.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement#getRefiningDiagram()
	 * @see #getDataFlowDiagramRefinement()
	 * @generated
	 */
	EReference getDataFlowDiagramRefinement_RefiningDiagram();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement#getProvidingProcesses <em>Providing Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Providing Processes</em>'.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement#getProvidingProcesses()
	 * @see #getDataFlowDiagramRefinement()
	 * @generated
	 */
	EReference getDataFlowDiagramRefinement_ProvidingProcesses();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement#getRequiringProcesses <em>Requiring Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requiring Processes</em>'.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement#getRequiringProcesses()
	 * @see #getDataFlowDiagramRefinement()
	 * @generated
	 */
	EReference getDataFlowDiagramRefinement_RequiringProcesses();

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
	 * Returns the meta object for class '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node#getRequiringProcesses <em>Requiring Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requiring Processes</em>'.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node#getRequiringProcesses()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_RequiringProcesses();

				/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node#getProvidingProcesses <em>Providing Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Providing Processes</em>'.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node#getProvidingProcesses()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ProvidingProcesses();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Edge
	 * @generated
	 */
	EClass getEdge();

				/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

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
		 * The meta object literal for the '<em><b>Refined By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_DIAGRAM__REFINED_BY = eINSTANCE.getDataFlowDiagram_RefinedBy();
		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_DIAGRAM__NODES = eINSTANCE.getDataFlowDiagram_Nodes();
		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_DIAGRAM__EDGES = eINSTANCE.getDataFlowDiagram_Edges();
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
		 * The meta object literal for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramRefinementImpl <em>Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramRefinementImpl
		 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getDataFlowDiagramRefinement()
		 * @generated
		 */
		EClass DATA_FLOW_DIAGRAM_REFINEMENT = eINSTANCE.getDataFlowDiagramRefinement();
		/**
		 * The meta object literal for the '<em><b>Refined Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_DIAGRAM_REFINEMENT__REFINED_PROCESS = eINSTANCE.getDataFlowDiagramRefinement_RefinedProcess();
		/**
		 * The meta object literal for the '<em><b>Refining Diagram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_DIAGRAM_REFINEMENT__REFINING_DIAGRAM = eINSTANCE.getDataFlowDiagramRefinement_RefiningDiagram();
		/**
		 * The meta object literal for the '<em><b>Providing Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_DIAGRAM_REFINEMENT__PROVIDING_PROCESSES = eINSTANCE.getDataFlowDiagramRefinement_ProvidingProcesses();
		/**
		 * The meta object literal for the '<em><b>Requiring Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_DIAGRAM_REFINEMENT__REQUIRING_PROCESSES = eINSTANCE.getDataFlowDiagramRefinement_RequiringProcesses();
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
		 * The meta object literal for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.NodeImpl
		 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();
								/**
		 * The meta object literal for the '<em><b>Requiring Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__REQUIRING_PROCESSES = eINSTANCE.getNode_RequiringProcesses();
								/**
		 * The meta object literal for the '<em><b>Providing Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PROVIDING_PROCESSES = eINSTANCE.getNode_ProvidingProcesses();
								/**
		 * The meta object literal for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.NamedElementImpl
		 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();
								/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();
								/**
		 * The meta object literal for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.EntityImpl
		 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();
								/**
		 * The meta object literal for the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.EdgeImpl
		 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();
								/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();
								/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

	}

} //DataFlowDiagramPackage
