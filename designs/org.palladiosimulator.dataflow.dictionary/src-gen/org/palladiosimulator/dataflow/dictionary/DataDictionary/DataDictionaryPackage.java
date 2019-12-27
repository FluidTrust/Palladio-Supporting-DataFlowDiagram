/**
 */
package org.palladiosimulator.dataflow.dictionary.DataDictionary;

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
 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionaryFactory
 * @model kind="package"
 * @generated
 */
public interface DataDictionaryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DataDictionary";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/dataflow/dictionary/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DataDictionary";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataDictionaryPackage eINSTANCE = org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryImpl <em>Data Dictionary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryImpl
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryPackageImpl#getDataDictionary()
	 * @generated
	 */
	int DATA_DICTIONARY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DICTIONARY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DICTIONARY__ENTRIES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DICTIONARY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.NamedElementImpl
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 6;

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
	 * The meta object id for the '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.EntityImpl
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataTypeImpl
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ID = ENTITY__ID;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.CollectionDataTypeImpl <em>Collection Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.CollectionDataTypeImpl
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryPackageImpl#getCollectionDataType()
	 * @generated
	 */
	int COLLECTION_DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.CompositeDataTypeImpl <em>Composite Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.CompositeDataTypeImpl
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryPackageImpl#getCompositeDataType()
	 * @generated
	 */
	int COMPOSITE_DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE__COMPONENTS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.PrimitiveDataTypeImpl
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryPackageImpl#getPrimitiveDataType()
	 * @generated
	 */
	int PRIMITIVE_DATA_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__ID = DATA_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.EntryImpl
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__TYPE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionary <em>Data Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Dictionary</em>'.
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionary
	 * @generated
	 */
	EClass getDataDictionary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionary#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionary#getEntries()
	 * @see #getDataDictionary()
	 * @generated
	 */
	EReference getDataDictionary_Entries();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.CollectionDataType <em>Collection Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Data Type</em>'.
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.CollectionDataType
	 * @generated
	 */
	EClass getCollectionDataType();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.CollectionDataType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.CollectionDataType#getType()
	 * @see #getCollectionDataType()
	 * @generated
	 */
	EReference getCollectionDataType_Type();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.CompositeDataType <em>Composite Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Data Type</em>'.
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.CompositeDataType
	 * @generated
	 */
	EClass getCompositeDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.CompositeDataType#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.CompositeDataType#getComponents()
	 * @see #getCompositeDataType()
	 * @generated
	 */
	EReference getCompositeDataType_Components();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Data Type</em>'.
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.PrimitiveDataType
	 * @generated
	 */
	EClass getPrimitiveDataType();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.Entry#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.Entry#getType()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Type();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataDictionaryFactory getDataDictionaryFactory();

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
		 * The meta object literal for the '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryImpl <em>Data Dictionary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryImpl
		 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryPackageImpl#getDataDictionary()
		 * @generated
		 */
		EClass DATA_DICTIONARY = eINSTANCE.getDataDictionary();
		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DICTIONARY__ENTRIES = eINSTANCE.getDataDictionary_Entries();
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.CollectionDataTypeImpl <em>Collection Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.CollectionDataTypeImpl
		 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryPackageImpl#getCollectionDataType()
		 * @generated
		 */
		EClass COLLECTION_DATA_TYPE = eINSTANCE.getCollectionDataType();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_DATA_TYPE__TYPE = eINSTANCE.getCollectionDataType_Type();
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.CompositeDataTypeImpl <em>Composite Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.CompositeDataTypeImpl
		 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryPackageImpl#getCompositeDataType()
		 * @generated
		 */
		EClass COMPOSITE_DATA_TYPE = eINSTANCE.getCompositeDataType();
		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_DATA_TYPE__COMPONENTS = eINSTANCE.getCompositeDataType_Components();
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.PrimitiveDataTypeImpl
		 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryPackageImpl#getPrimitiveDataType()
		 * @generated
		 */
		EClass PRIMITIVE_DATA_TYPE = eINSTANCE.getPrimitiveDataType();
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.EntryImpl
		 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__TYPE = eINSTANCE.getEntry_Type();
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataTypeImpl
		 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.NamedElementImpl
		 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.EntityImpl
		 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

	}

} //DataDictionaryPackage
