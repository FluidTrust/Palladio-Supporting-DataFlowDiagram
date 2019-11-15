/**
 */
package designs.metamodelalt.impl;

import designs.metamodelalt.DataFlow;
import designs.metamodelalt.Function;
import designs.metamodelalt.MetamodelaltPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link designs.metamodelalt.impl.FunctionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link designs.metamodelalt.impl.FunctionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends ComponentsImpl implements Function {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlow> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlow> target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelaltPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataFlow> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<DataFlow>(DataFlow.class, this, MetamodelaltPackage.FUNCTION__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataFlow> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<DataFlow>(DataFlow.class, this, MetamodelaltPackage.FUNCTION__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelaltPackage.FUNCTION__SOURCE:
			return getSource();
		case MetamodelaltPackage.FUNCTION__TARGET:
			return getTarget();
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
		case MetamodelaltPackage.FUNCTION__SOURCE:
			getSource().clear();
			getSource().addAll((Collection<? extends DataFlow>) newValue);
			return;
		case MetamodelaltPackage.FUNCTION__TARGET:
			getTarget().clear();
			getTarget().addAll((Collection<? extends DataFlow>) newValue);
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
		case MetamodelaltPackage.FUNCTION__SOURCE:
			getSource().clear();
			return;
		case MetamodelaltPackage.FUNCTION__TARGET:
			getTarget().clear();
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
		case MetamodelaltPackage.FUNCTION__SOURCE:
			return source != null && !source.isEmpty();
		case MetamodelaltPackage.FUNCTION__TARGET:
			return target != null && !target.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionImpl
