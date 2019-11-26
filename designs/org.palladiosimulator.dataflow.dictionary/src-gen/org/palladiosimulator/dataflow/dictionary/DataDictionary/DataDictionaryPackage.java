/**
 */
package org.palladiosimulator.dataflow.dictionary.DataDictionary;

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
	DataDictionaryPackage eINSTANCE = org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryPackageImpl
			.init();

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
	 * The number of structural features of the '<em>Data Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DICTIONARY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DICTIONARY_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

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

	}

} //DataDictionaryPackage
