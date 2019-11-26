/**
 */
package org.palladiosimulator.dataflow.dictionary.DataDictionary.impl;

import identifier.impl.IdentifierImpl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionary;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionaryPackage;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Dictionary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.impl.DataDictionaryImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataDictionaryImpl extends IdentifierImpl implements DataDictionary {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> entries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataDictionaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataDictionaryPackage.Literals.DATA_DICTIONARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<DataType>(DataType.class, this,
					DataDictionaryPackage.DATA_DICTIONARY__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DataDictionaryPackage.DATA_DICTIONARY__ENTRIES:
			return ((InternalEList<?>) getEntries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DataDictionaryPackage.DATA_DICTIONARY__ENTRIES:
			return getEntries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DataDictionaryPackage.DATA_DICTIONARY__ENTRIES:
			getEntries().clear();
			getEntries().addAll((Collection<? extends DataType>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DataDictionaryPackage.DATA_DICTIONARY__ENTRIES:
			getEntries().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DataDictionaryPackage.DATA_DICTIONARY__ENTRIES:
			return entries != null && !entries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataDictionaryImpl
