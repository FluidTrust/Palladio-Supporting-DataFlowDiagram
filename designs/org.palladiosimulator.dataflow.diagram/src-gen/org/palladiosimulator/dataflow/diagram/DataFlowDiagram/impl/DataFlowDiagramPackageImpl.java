/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Component;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Data;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramFactory;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Edge;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.EdgeRefinement;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Entity;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.ExternalActor;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.NamedElement;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Store;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionaryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataFlowDiagramPackageImpl extends EPackageImpl implements DataFlowDiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalActorEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowDiagramRefinementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeRefinementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataFlowDiagramPackageImpl() {
		super(eNS_URI, DataFlowDiagramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DataFlowDiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataFlowDiagramPackage init() {
		if (isInited) return (DataFlowDiagramPackage)EPackage.Registry.INSTANCE.getEPackage(DataFlowDiagramPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDataFlowDiagramPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DataFlowDiagramPackageImpl theDataFlowDiagramPackage = registeredDataFlowDiagramPackage instanceof DataFlowDiagramPackageImpl ? (DataFlowDiagramPackageImpl)registeredDataFlowDiagramPackage : new DataFlowDiagramPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DataDictionaryPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDataFlowDiagramPackage.createPackageContents();

		// Initialize created meta-data
		theDataFlowDiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataFlowDiagramPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataFlowDiagramPackage.eNS_URI, theDataFlowDiagramPackage);
		return theDataFlowDiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFlowDiagram() {
		return dataFlowDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlowDiagram_RefinedBy() {
		return (EReference)dataFlowDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlowDiagram_Nodes() {
		return (EReference)dataFlowDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlowDiagram_Edges() {
		return (EReference)dataFlowDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalActor() {
		return externalActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStore() {
		return storeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFlowDiagramRefinement() {
		return dataFlowDiagramRefinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlowDiagramRefinement_RefinedProcess() {
		return (EReference)dataFlowDiagramRefinementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlowDiagramRefinement_RefiningDiagram() {
		return (EReference)dataFlowDiagramRefinementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlowDiagramRefinement_RefinedEdges() {
		return (EReference)dataFlowDiagramRefinementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFlow() {
		return dataFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlow_Data() {
		return (EReference)dataFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Type() {
		return (EReference)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_RequiringNodes() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_ProvidingNodes() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeRefinement() {
		return edgeRefinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeRefinement_RefinedEdge() {
		return (EReference)edgeRefinementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeRefinement_RefiningEdges() {
		return (EReference)edgeRefinementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Target() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Source() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(1);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowDiagramFactory getDataFlowDiagramFactory() {
		return (DataFlowDiagramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dataFlowDiagramEClass = createEClass(DATA_FLOW_DIAGRAM);
		createEReference(dataFlowDiagramEClass, DATA_FLOW_DIAGRAM__REFINED_BY);
		createEReference(dataFlowDiagramEClass, DATA_FLOW_DIAGRAM__NODES);
		createEReference(dataFlowDiagramEClass, DATA_FLOW_DIAGRAM__EDGES);

		componentEClass = createEClass(COMPONENT);

		externalActorEClass = createEClass(EXTERNAL_ACTOR);

		storeEClass = createEClass(STORE);

		processEClass = createEClass(PROCESS);

		dataFlowDiagramRefinementEClass = createEClass(DATA_FLOW_DIAGRAM_REFINEMENT);
		createEReference(dataFlowDiagramRefinementEClass, DATA_FLOW_DIAGRAM_REFINEMENT__REFINED_PROCESS);
		createEReference(dataFlowDiagramRefinementEClass, DATA_FLOW_DIAGRAM_REFINEMENT__REFINING_DIAGRAM);
		createEReference(dataFlowDiagramRefinementEClass, DATA_FLOW_DIAGRAM_REFINEMENT__REFINED_EDGES);

		dataFlowEClass = createEClass(DATA_FLOW);
		createEReference(dataFlowEClass, DATA_FLOW__DATA);

		dataEClass = createEClass(DATA);
		createEReference(dataEClass, DATA__TYPE);

		edgeEClass = createEClass(EDGE);
		createEReference(edgeEClass, EDGE__TARGET);
		createEReference(edgeEClass, EDGE__SOURCE);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__REQUIRING_NODES);
		createEReference(nodeEClass, NODE__PROVIDING_NODES);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		entityEClass = createEClass(ENTITY);

		edgeRefinementEClass = createEClass(EDGE_REFINEMENT);
		createEReference(edgeRefinementEClass, EDGE_REFINEMENT__REFINED_EDGE);
		createEReference(edgeRefinementEClass, EDGE_REFINEMENT__REFINING_EDGES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		DataDictionaryPackage theDataDictionaryPackage = (DataDictionaryPackage)EPackage.Registry.INSTANCE.getEPackage(DataDictionaryPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataFlowDiagramEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		componentEClass.getESuperTypes().add(this.getEntity());
		externalActorEClass.getESuperTypes().add(this.getNode());
		storeEClass.getESuperTypes().add(this.getNode());
		processEClass.getESuperTypes().add(this.getNode());
		dataFlowDiagramRefinementEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		dataFlowEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		dataFlowEClass.getESuperTypes().add(this.getEdge());
		dataEClass.getESuperTypes().add(this.getEntity());
		edgeEClass.getESuperTypes().add(this.getComponent());
		nodeEClass.getESuperTypes().add(this.getComponent());
		entityEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		entityEClass.getESuperTypes().add(this.getNamedElement());
		edgeRefinementEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes and features; add operations and parameters
		initEClass(dataFlowDiagramEClass, DataFlowDiagram.class, "DataFlowDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataFlowDiagram_RefinedBy(), this.getDataFlowDiagramRefinement(), null, "refinedBy", null, 0, -1, DataFlowDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFlowDiagram_Nodes(), this.getNode(), null, "nodes", null, 0, -1, DataFlowDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFlowDiagram_Edges(), this.getEdge(), null, "edges", null, 0, -1, DataFlowDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalActorEClass, ExternalActor.class, "ExternalActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storeEClass, Store.class, "Store", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processEClass, org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataFlowDiagramRefinementEClass, DataFlowDiagramRefinement.class, "DataFlowDiagramRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataFlowDiagramRefinement_RefinedProcess(), this.getProcess(), null, "refinedProcess", null, 1, 1, DataFlowDiagramRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFlowDiagramRefinement_RefiningDiagram(), this.getDataFlowDiagram(), null, "refiningDiagram", null, 1, 1, DataFlowDiagramRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFlowDiagramRefinement_RefinedEdges(), this.getEdgeRefinement(), null, "refinedEdges", null, 0, -1, DataFlowDiagramRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFlowEClass, DataFlow.class, "DataFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataFlow_Data(), this.getData(), null, "data", null, 1, -1, DataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getData_Type(), theDataDictionaryPackage.getDataType(), null, "type", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdge_Target(), this.getNode(), null, "target", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Source(), this.getNode(), null, "source", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_RequiringNodes(), this.getNode(), null, "requiringNodes", null, 0, -1, Node.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNode_ProvidingNodes(), this.getNode(), null, "providingNodes", null, 0, -1, Node.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edgeRefinementEClass, EdgeRefinement.class, "EdgeRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgeRefinement_RefinedEdge(), this.getEdge(), null, "refinedEdge", null, 1, 1, EdgeRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeRefinement_RefiningEdges(), this.getEdge(), null, "refiningEdges", null, 0, -1, EdgeRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
		addAnnotation
		  (getNode_RequiringNodes(),
		   source,
		   new String[] {
			   "derivation", "self.oclAsType(ecore::EObject).eContainer().oclAsType(DataFlowDiagram).edges->select(e | e.source = self).target->asOrderedSet()"
		   });
		addAnnotation
		  (getNode_ProvidingNodes(),
		   source,
		   new String[] {
			   "derivation", "self.oclAsType(ecore::EObject).eContainer().oclAsType(DataFlowDiagram).edges->select(e | e.target = self).source->asOrderedSet()"
		   });
	}

} //DataFlowDiagramPackageImpl
