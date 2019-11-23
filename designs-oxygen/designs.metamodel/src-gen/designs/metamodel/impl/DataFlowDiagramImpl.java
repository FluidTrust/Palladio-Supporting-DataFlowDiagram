/**
 */
package designs.metamodel.impl;

import designs.metamodel.Component;
import designs.metamodel.DataFlowDiagram;
import designs.metamodel.MetamodelPackage;
import designs.metamodel.RefiningReference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Flow Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link designs.metamodel.impl.DataFlowDiagramImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link designs.metamodel.impl.DataFlowDiagramImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link designs.metamodel.impl.DataFlowDiagramImpl#getRefinedBy <em>Refined By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataFlowDiagramImpl extends IdentifierImpl implements DataFlowDiagram {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected RefiningReference refines;

	/**
	 * The cached value of the '{@link #getRefinedBy() <em>Refined By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlowDiagram> refinedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.DATA_FLOW_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<Component>(Component.class, this,
					MetamodelPackage.DATA_FLOW_DIAGRAM__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefiningReference getRefines() {
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefines(RefiningReference newRefines, NotificationChain msgs) {
		RefiningReference oldRefines = refines;
		refines = newRefines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.DATA_FLOW_DIAGRAM__REFINES, oldRefines, newRefines);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefines(RefiningReference newRefines) {
		if (newRefines != refines) {
			NotificationChain msgs = null;
			if (refines != null)
				msgs = ((InternalEObject) refines).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.DATA_FLOW_DIAGRAM__REFINES, null, msgs);
			if (newRefines != null)
				msgs = ((InternalEObject) newRefines).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.DATA_FLOW_DIAGRAM__REFINES, null, msgs);
			msgs = basicSetRefines(newRefines, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.DATA_FLOW_DIAGRAM__REFINES,
					newRefines, newRefines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlowDiagram> getRefinedBy() {
		if (refinedBy == null) {
			refinedBy = new EObjectContainmentEList<DataFlowDiagram>(DataFlowDiagram.class, this,
					MetamodelPackage.DATA_FLOW_DIAGRAM__REFINED_BY);
		}
		return refinedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.DATA_FLOW_DIAGRAM__COMPONENT:
			return ((InternalEList<?>) getComponent()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.DATA_FLOW_DIAGRAM__REFINES:
			return basicSetRefines(null, msgs);
		case MetamodelPackage.DATA_FLOW_DIAGRAM__REFINED_BY:
			return ((InternalEList<?>) getRefinedBy()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.DATA_FLOW_DIAGRAM__COMPONENT:
			return getComponent();
		case MetamodelPackage.DATA_FLOW_DIAGRAM__REFINES:
			return getRefines();
		case MetamodelPackage.DATA_FLOW_DIAGRAM__REFINED_BY:
			return getRefinedBy();
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
		case MetamodelPackage.DATA_FLOW_DIAGRAM__COMPONENT:
			getComponent().clear();
			getComponent().addAll((Collection<? extends Component>) newValue);
			return;
		case MetamodelPackage.DATA_FLOW_DIAGRAM__REFINES:
			setRefines((RefiningReference) newValue);
			return;
		case MetamodelPackage.DATA_FLOW_DIAGRAM__REFINED_BY:
			getRefinedBy().clear();
			getRefinedBy().addAll((Collection<? extends DataFlowDiagram>) newValue);
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
		case MetamodelPackage.DATA_FLOW_DIAGRAM__COMPONENT:
			getComponent().clear();
			return;
		case MetamodelPackage.DATA_FLOW_DIAGRAM__REFINES:
			setRefines((RefiningReference) null);
			return;
		case MetamodelPackage.DATA_FLOW_DIAGRAM__REFINED_BY:
			getRefinedBy().clear();
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
		case MetamodelPackage.DATA_FLOW_DIAGRAM__COMPONENT:
			return component != null && !component.isEmpty();
		case MetamodelPackage.DATA_FLOW_DIAGRAM__REFINES:
			return refines != null;
		case MetamodelPackage.DATA_FLOW_DIAGRAM__REFINED_BY:
			return refinedBy != null && !refinedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataFlowDiagramImpl
