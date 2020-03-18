/**
 */
package org.palladiosimulator.dataflow.dictionary.DataDictionary;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionaryPackage
 * @generated
 */
public interface DataDictionaryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataDictionaryFactory eINSTANCE = org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Dictionary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Dictionary</em>'.
	 * @generated
	 */
	DataDictionary createDataDictionary();

	/**
	 * Returns a new object of class '<em>Collection Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Data Type</em>'.
	 * @generated
	 */
	CollectionDataType createCollectionDataType();

	/**
	 * Returns a new object of class '<em>Composite Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Data Type</em>'.
	 * @generated
	 */
	CompositeDataType createCompositeDataType();

	/**
	 * Returns a new object of class '<em>Primitive Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Data Type</em>'.
	 * @generated
	 */
	PrimitiveDataType createPrimitiveDataType();

	/**
	 * Returns a new object of class '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry</em>'.
	 * @generated
	 */
	Entry createEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataDictionaryPackage getDataDictionaryPackage();

} //DataDictionaryFactory
