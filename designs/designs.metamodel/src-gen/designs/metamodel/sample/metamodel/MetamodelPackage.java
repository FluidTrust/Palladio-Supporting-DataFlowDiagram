/**
 */
package designs.metamodel.sample.metamodel;

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
 * @see designs.metamodel.sample.metamodel.MetamodelFactory
 * @model kind="package"
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
	MetamodelPackage eINSTANCE = designs.metamodel.sample.metamodel.impl.MetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link designs.metamodel.sample.metamodel.impl.DataFlowDiagramImpl <em>Data Flow Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designs.metamodel.sample.metamodel.impl.DataFlowDiagramImpl
	 * @see designs.metamodel.sample.metamodel.impl.MetamodelPackageImpl#getDataFlowDiagram()
	 * @generated
	 */
	int DATA_FLOW_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM__COMPONENTS = 0;

	/**
	 * The number of structural features of the '<em>Data Flow Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Flow Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link designs.metamodel.sample.metamodel.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designs.metamodel.sample.metamodel.impl.ComponentImpl
	 * @see designs.metamodel.sample.metamodel.impl.MetamodelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OUTPUTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link designs.metamodel.sample.metamodel.impl.ExternalComponentImpl <em>External Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designs.metamodel.sample.metamodel.impl.ExternalComponentImpl
	 * @see designs.metamodel.sample.metamodel.impl.MetamodelPackageImpl#getExternalComponent()
	 * @generated
	 */
	int EXTERNAL_COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT__OUTPUTS = COMPONENT__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>External Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link designs.metamodel.sample.metamodel.impl.TerminatorImpl <em>Terminator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designs.metamodel.sample.metamodel.impl.TerminatorImpl
	 * @see designs.metamodel.sample.metamodel.impl.MetamodelPackageImpl#getTerminator()
	 * @generated
	 */
	int TERMINATOR = 1;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATOR__OUTPUTS = EXTERNAL_COMPONENT__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATOR__NAME = EXTERNAL_COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Terminator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATOR_FEATURE_COUNT = EXTERNAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Terminator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATOR_OPERATION_COUNT = EXTERNAL_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link designs.metamodel.sample.metamodel.impl.InternalComponentImpl <em>Internal Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designs.metamodel.sample.metamodel.impl.InternalComponentImpl
	 * @see designs.metamodel.sample.metamodel.impl.MetamodelPackageImpl#getInternalComponent()
	 * @generated
	 */
	int INTERNAL_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT__OUTPUTS = COMPONENT__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT__INPUTS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Internal Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Internal Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link designs.metamodel.sample.metamodel.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designs.metamodel.sample.metamodel.impl.ProcessImpl
	 * @see designs.metamodel.sample.metamodel.impl.MetamodelPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OUTPUTS = INTERNAL_COMPONENT__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = INTERNAL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INPUTS = INTERNAL_COMPONENT__INPUTS;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = INTERNAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = INTERNAL_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link designs.metamodel.sample.metamodel.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designs.metamodel.sample.metamodel.impl.StoreImpl
	 * @see designs.metamodel.sample.metamodel.impl.MetamodelPackageImpl#getStore()
	 * @generated
	 */
	int STORE = 3;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__OUTPUTS = INTERNAL_COMPONENT__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__NAME = INTERNAL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__INPUTS = INTERNAL_COMPONENT__INPUTS;

	/**
	 * The number of structural features of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = INTERNAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_OPERATION_COUNT = INTERNAL_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link designs.metamodel.sample.metamodel.DataFlowDiagram <em>Data Flow Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow Diagram</em>'.
	 * @see designs.metamodel.sample.metamodel.DataFlowDiagram
	 * @generated
	 */
	EClass getDataFlowDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link designs.metamodel.sample.metamodel.DataFlowDiagram#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see designs.metamodel.sample.metamodel.DataFlowDiagram#getComponents()
	 * @see #getDataFlowDiagram()
	 * @generated
	 */
	EReference getDataFlowDiagram_Components();

	/**
	 * Returns the meta object for class '{@link designs.metamodel.sample.metamodel.Terminator <em>Terminator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminator</em>'.
	 * @see designs.metamodel.sample.metamodel.Terminator
	 * @generated
	 */
	EClass getTerminator();

	/**
	 * Returns the meta object for class '{@link designs.metamodel.sample.metamodel.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see designs.metamodel.sample.metamodel.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for class '{@link designs.metamodel.sample.metamodel.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store</em>'.
	 * @see designs.metamodel.sample.metamodel.Store
	 * @generated
	 */
	EClass getStore();

	/**
	 * Returns the meta object for class '{@link designs.metamodel.sample.metamodel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see designs.metamodel.sample.metamodel.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link designs.metamodel.sample.metamodel.Component#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see designs.metamodel.sample.metamodel.Component#getOutputs()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Outputs();

	/**
	 * Returns the meta object for the attribute '{@link designs.metamodel.sample.metamodel.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see designs.metamodel.sample.metamodel.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for class '{@link designs.metamodel.sample.metamodel.InternalComponent <em>Internal Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Component</em>'.
	 * @see designs.metamodel.sample.metamodel.InternalComponent
	 * @generated
	 */
	EClass getInternalComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link designs.metamodel.sample.metamodel.InternalComponent#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see designs.metamodel.sample.metamodel.InternalComponent#getInputs()
	 * @see #getInternalComponent()
	 * @generated
	 */
	EReference getInternalComponent_Inputs();

	/**
	 * Returns the meta object for class '{@link designs.metamodel.sample.metamodel.ExternalComponent <em>External Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Component</em>'.
	 * @see designs.metamodel.sample.metamodel.ExternalComponent
	 * @generated
	 */
	EClass getExternalComponent();

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
		 * The meta object literal for the '{@link designs.metamodel.sample.metamodel.impl.DataFlowDiagramImpl <em>Data Flow Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designs.metamodel.sample.metamodel.impl.DataFlowDiagramImpl
		 * @see designs.metamodel.sample.metamodel.impl.MetamodelPackageImpl#getDataFlowDiagram()
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
		 * The meta object literal for the '{@link designs.metamodel.sample.metamodel.impl.TerminatorImpl <em>Terminator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designs.metamodel.sample.metamodel.impl.TerminatorImpl
		 * @see designs.metamodel.sample.metamodel.impl.MetamodelPackageImpl#getTerminator()
		 * @generated
		 */
		EClass TERMINATOR = eINSTANCE.getTerminator();

		/**
		 * The meta object literal for the '{@link designs.metamodel.sample.metamodel.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designs.metamodel.sample.metamodel.impl.ProcessImpl
		 * @see designs.metamodel.sample.metamodel.impl.MetamodelPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '{@link designs.metamodel.sample.metamodel.impl.StoreImpl <em>Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designs.metamodel.sample.metamodel.impl.StoreImpl
		 * @see designs.metamodel.sample.metamodel.impl.MetamodelPackageImpl#getStore()
		 * @generated
		 */
		EClass STORE = eINSTANCE.getStore();

		/**
		 * The meta object literal for the '{@link designs.metamodel.sample.metamodel.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designs.metamodel.sample.metamodel.impl.ComponentImpl
		 * @see designs.metamodel.sample.metamodel.impl.MetamodelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OUTPUTS = eINSTANCE.getComponent_Outputs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '{@link designs.metamodel.sample.metamodel.impl.InternalComponentImpl <em>Internal Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designs.metamodel.sample.metamodel.impl.InternalComponentImpl
		 * @see designs.metamodel.sample.metamodel.impl.MetamodelPackageImpl#getInternalComponent()
		 * @generated
		 */
		EClass INTERNAL_COMPONENT = eINSTANCE.getInternalComponent();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_COMPONENT__INPUTS = eINSTANCE.getInternalComponent_Inputs();

		/**
		 * The meta object literal for the '{@link designs.metamodel.sample.metamodel.impl.ExternalComponentImpl <em>External Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designs.metamodel.sample.metamodel.impl.ExternalComponentImpl
		 * @see designs.metamodel.sample.metamodel.impl.MetamodelPackageImpl#getExternalComponent()
		 * @generated
		 */
		EClass EXTERNAL_COMPONENT = eINSTANCE.getExternalComponent();

	}

} //MetamodelPackage
