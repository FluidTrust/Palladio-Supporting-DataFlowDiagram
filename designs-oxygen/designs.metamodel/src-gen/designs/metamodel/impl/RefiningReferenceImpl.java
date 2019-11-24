/**
 */
package designs.metamodel.impl;

import designs.metamodel.MetamodelPackage;
import designs.metamodel.RefiningReference;
import designs.metamodel.identifier.impl.IdentifierImpl;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refining Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link designs.metamodel.impl.RefiningReferenceImpl#getRefinedProcesses <em>Refined Processes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefiningReferenceImpl extends IdentifierImpl implements RefiningReference {
	/**
	 * The cached value of the '{@link #getRefinedProcesses() <em>Refined Processes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<designs.metamodel.Process> refinedProcesses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefiningReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.REFINING_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<designs.metamodel.Process> getRefinedProcesses() {
		if (refinedProcesses == null) {
			refinedProcesses = new EObjectResolvingEList<designs.metamodel.Process>(designs.metamodel.Process.class,
					this, MetamodelPackage.REFINING_REFERENCE__REFINED_PROCESSES);
		}
		return refinedProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.REFINING_REFERENCE__REFINED_PROCESSES:
			return getRefinedProcesses();
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
		case MetamodelPackage.REFINING_REFERENCE__REFINED_PROCESSES:
			getRefinedProcesses().clear();
			getRefinedProcesses().addAll((Collection<? extends designs.metamodel.Process>) newValue);
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
		case MetamodelPackage.REFINING_REFERENCE__REFINED_PROCESSES:
			getRefinedProcesses().clear();
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
		case MetamodelPackage.REFINING_REFERENCE__REFINED_PROCESSES:
			return refinedProcesses != null && !refinedProcesses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RefiningReferenceImpl
