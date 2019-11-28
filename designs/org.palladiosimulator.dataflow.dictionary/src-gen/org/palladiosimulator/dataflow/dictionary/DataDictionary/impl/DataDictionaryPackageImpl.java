/**
 */
package org.palladiosimulator.dataflow.dictionary.DataDictionary.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.CollectionDataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.CompositeDataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionary;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionaryFactory;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionaryPackage;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.Entry;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.PrimitiveDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataDictionaryPackageImpl extends EPackageImpl implements DataDictionaryPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass dataDictionaryEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass collectionDataTypeEClass = null;
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass compositeDataTypeEClass = null;
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass primitiveDataTypeEClass = null;
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass entryEClass = null;
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass dataTypeEClass = null;

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
     * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionaryPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private DataDictionaryPackageImpl() {
        super(eNS_URI, DataDictionaryFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link DataDictionaryPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static DataDictionaryPackage init() {
        if (isInited) return (DataDictionaryPackage)EPackage.Registry.INSTANCE.getEPackage(DataDictionaryPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredDataDictionaryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        DataDictionaryPackageImpl theDataDictionaryPackage = registeredDataDictionaryPackage instanceof DataDictionaryPackageImpl ? (DataDictionaryPackageImpl)registeredDataDictionaryPackage : new DataDictionaryPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        IdentifierPackage.eINSTANCE.eClass();
        XMLTypePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theDataDictionaryPackage.createPackageContents();

        // Initialize created meta-data
        theDataDictionaryPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theDataDictionaryPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(DataDictionaryPackage.eNS_URI, theDataDictionaryPackage);
        return theDataDictionaryPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDataDictionary() {
        return dataDictionaryEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataDictionary_Entries() {
        return (EReference)dataDictionaryEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCollectionDataType() {
        return collectionDataTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCollectionDataType_Type() {
        return (EReference)collectionDataTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCompositeDataType() {
        return compositeDataTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCompositeDataType_Components() {
        return (EReference)compositeDataTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPrimitiveDataType() {
        return primitiveDataTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEntry() {
        return entryEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getEntry_Type() {
        return (EReference)entryEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEntry_Name() {
        return (EAttribute)entryEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDataType() {
        return dataTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDataType_Name() {
        return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DataDictionaryFactory getDataDictionaryFactory() {
        return (DataDictionaryFactory)getEFactoryInstance();
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
        dataDictionaryEClass = createEClass(DATA_DICTIONARY);
        createEReference(dataDictionaryEClass, DATA_DICTIONARY__ENTRIES);

        collectionDataTypeEClass = createEClass(COLLECTION_DATA_TYPE);
        createEReference(collectionDataTypeEClass, COLLECTION_DATA_TYPE__TYPE);

        compositeDataTypeEClass = createEClass(COMPOSITE_DATA_TYPE);
        createEReference(compositeDataTypeEClass, COMPOSITE_DATA_TYPE__COMPONENTS);

        primitiveDataTypeEClass = createEClass(PRIMITIVE_DATA_TYPE);

        entryEClass = createEClass(ENTRY);
        createEReference(entryEClass, ENTRY__TYPE);
        createEAttribute(entryEClass, ENTRY__NAME);

        dataTypeEClass = createEClass(DATA_TYPE);
        createEAttribute(dataTypeEClass, DATA_TYPE__NAME);
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
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        dataDictionaryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        collectionDataTypeEClass.getESuperTypes().add(this.getDataType());
        compositeDataTypeEClass.getESuperTypes().add(this.getDataType());
        primitiveDataTypeEClass.getESuperTypes().add(this.getDataType());
        entryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        dataTypeEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

        // Initialize classes and features; add operations and parameters
        initEClass(dataDictionaryEClass, DataDictionary.class, "DataDictionary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataDictionary_Entries(), this.getDataType(), null, "entries", null, 0, -1, DataDictionary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(collectionDataTypeEClass, CollectionDataType.class, "CollectionDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCollectionDataType_Type(), this.getDataType(), null, "type", null, 1, 1, CollectionDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(compositeDataTypeEClass, CompositeDataType.class, "CompositeDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCompositeDataType_Components(), this.getEntry(), null, "components", null, 1, -1, CompositeDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(primitiveDataTypeEClass, PrimitiveDataType.class, "PrimitiveDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(entryEClass, Entry.class, "Entry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEntry_Type(), this.getDataType(), null, "type", null, 1, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEntry_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDataType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //DataDictionaryPackageImpl
