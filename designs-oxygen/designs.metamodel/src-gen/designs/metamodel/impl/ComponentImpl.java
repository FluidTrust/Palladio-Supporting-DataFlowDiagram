/**
 */
package designs.metamodel.impl;

import designs.metamodel.Component;
import designs.metamodel.MetamodelPackage;
import designs.metamodel.identifier.impl.IdentifierImpl;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link designs.metamodel.impl.ComponentImpl#getIncomingDataFlow <em>Incoming Data Flow</em>}</li>
 *   <li>{@link designs.metamodel.impl.ComponentImpl#getOutgoingDataFlow <em>Outgoing Data Flow</em>}</li>
 *   <li>{@link designs.metamodel.impl.ComponentImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImpl extends IdentifierImpl implements Component {
	/**
	 * The cached value of the '{@link #getIncomingDataFlow() <em>Incoming Data Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingDataFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> incomingDataFlow;

	/**
	 * The cached value of the '{@link #getOutgoingDataFlow() <em>Outgoing Data Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingDataFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> outgoingDataFlow;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getIncomingDataFlow() {
		if (incomingDataFlow == null) {
			incomingDataFlow = new EObjectResolvingEList<Component>(Component.class, this,
					MetamodelPackage.COMPONENT__INCOMING_DATA_FLOW);
		}
		return incomingDataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getOutgoingDataFlow() {
		if (outgoingDataFlow == null) {
			outgoingDataFlow = new EObjectResolvingEList<Component>(Component.class, this,
					MetamodelPackage.COMPONENT__OUTGOING_DATA_FLOW);
		}
		return outgoingDataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.COMPONENT__INCOMING_DATA_FLOW:
			return getIncomingDataFlow();
		case MetamodelPackage.COMPONENT__OUTGOING_DATA_FLOW:
			return getOutgoingDataFlow();
		case MetamodelPackage.COMPONENT__NAME:
			return getName();
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
		case MetamodelPackage.COMPONENT__INCOMING_DATA_FLOW:
			getIncomingDataFlow().clear();
			getIncomingDataFlow().addAll((Collection<? extends Component>) newValue);
			return;
		case MetamodelPackage.COMPONENT__OUTGOING_DATA_FLOW:
			getOutgoingDataFlow().clear();
			getOutgoingDataFlow().addAll((Collection<? extends Component>) newValue);
			return;
		case MetamodelPackage.COMPONENT__NAME:
			setName((String) newValue);
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
		case MetamodelPackage.COMPONENT__INCOMING_DATA_FLOW:
			getIncomingDataFlow().clear();
			return;
		case MetamodelPackage.COMPONENT__OUTGOING_DATA_FLOW:
			getOutgoingDataFlow().clear();
			return;
		case MetamodelPackage.COMPONENT__NAME:
			setName(NAME_EDEFAULT);
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
		case MetamodelPackage.COMPONENT__INCOMING_DATA_FLOW:
			return incomingDataFlow != null && !incomingDataFlow.isEmpty();
		case MetamodelPackage.COMPONENT__OUTGOING_DATA_FLOW:
			return outgoingDataFlow != null && !outgoingDataFlow.isEmpty();
		case MetamodelPackage.COMPONENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
