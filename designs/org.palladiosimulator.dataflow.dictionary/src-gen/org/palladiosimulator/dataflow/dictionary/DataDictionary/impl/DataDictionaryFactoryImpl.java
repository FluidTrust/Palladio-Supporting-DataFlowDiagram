/**
 */
package org.palladiosimulator.dataflow.dictionary.DataDictionary.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.dataflow.dictionary.DataDictionary.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataDictionaryFactoryImpl extends EFactoryImpl implements DataDictionaryFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static DataDictionaryFactory init() {
        try {
            DataDictionaryFactory theDataDictionaryFactory = (DataDictionaryFactory)EPackage.Registry.INSTANCE.getEFactory(DataDictionaryPackage.eNS_URI);
            if (theDataDictionaryFactory != null) {
                return theDataDictionaryFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DataDictionaryFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DataDictionaryFactoryImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case DataDictionaryPackage.DATA_DICTIONARY: return createDataDictionary();
            case DataDictionaryPackage.COLLECTION_DATA_TYPE: return createCollectionDataType();
            case DataDictionaryPackage.COMPOSITE_DATA_TYPE: return createCompositeDataType();
            case DataDictionaryPackage.PRIMITIVE_DATA_TYPE: return createPrimitiveDataType();
            case DataDictionaryPackage.ENTRY: return createEntry();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DataDictionary createDataDictionary() {
        DataDictionaryImpl dataDictionary = new DataDictionaryImpl();
        return dataDictionary;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CollectionDataType createCollectionDataType() {
        CollectionDataTypeImpl collectionDataType = new CollectionDataTypeImpl();
        return collectionDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CompositeDataType createCompositeDataType() {
        CompositeDataTypeImpl compositeDataType = new CompositeDataTypeImpl();
        return compositeDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PrimitiveDataType createPrimitiveDataType() {
        PrimitiveDataTypeImpl primitiveDataType = new PrimitiveDataTypeImpl();
        return primitiveDataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Entry createEntry() {
        EntryImpl entry = new EntryImpl();
        return entry;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DataDictionaryPackage getDataDictionaryPackage() {
        return (DataDictionaryPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static DataDictionaryPackage getPackage() {
        return DataDictionaryPackage.eINSTANCE;
    }

} //DataDictionaryFactoryImpl
