/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl;

import identifier.impl.IdentifierImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Component;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.ComponentImpl#getIncomingDataFlow <em>Incoming Data Flow</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.ComponentImpl#getOutgoingDataFlow <em>Outgoing Data Flow</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImpl extends IdentifierImpl implements Component {
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
		return DataFlowDiagramPackage.Literals.COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataFlowDiagramPackage.COMPONENT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getIncomingDataFlow() {
		if (incomingDataFlow == null) {
			incomingDataFlow = new EObjectResolvingEList<Component>(Component.class, this,
					DataFlowDiagramPackage.COMPONENT__INCOMING_DATA_FLOW);
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
					DataFlowDiagramPackage.COMPONENT__OUTGOING_DATA_FLOW);
		}
		return outgoingDataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DataFlowDiagramPackage.COMPONENT__NAME:
			return getName();
		case DataFlowDiagramPackage.COMPONENT__INCOMING_DATA_FLOW:
			return getIncomingDataFlow();
		case DataFlowDiagramPackage.COMPONENT__OUTGOING_DATA_FLOW:
			return getOutgoingDataFlow();
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
		case DataFlowDiagramPackage.COMPONENT__NAME:
			setName((String) newValue);
			return;
		case DataFlowDiagramPackage.COMPONENT__INCOMING_DATA_FLOW:
			getIncomingDataFlow().clear();
			getIncomingDataFlow().addAll((Collection<? extends Component>) newValue);
			return;
		case DataFlowDiagramPackage.COMPONENT__OUTGOING_DATA_FLOW:
			getOutgoingDataFlow().clear();
			getOutgoingDataFlow().addAll((Collection<? extends Component>) newValue);
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
		case DataFlowDiagramPackage.COMPONENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DataFlowDiagramPackage.COMPONENT__INCOMING_DATA_FLOW:
			getIncomingDataFlow().clear();
			return;
		case DataFlowDiagramPackage.COMPONENT__OUTGOING_DATA_FLOW:
			getOutgoingDataFlow().clear();
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
		case DataFlowDiagramPackage.COMPONENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DataFlowDiagramPackage.COMPONENT__INCOMING_DATA_FLOW:
			return incomingDataFlow != null && !incomingDataFlow.isEmpty();
		case DataFlowDiagramPackage.COMPONENT__OUTGOING_DATA_FLOW:
			return outgoingDataFlow != null && !outgoingDataFlow.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
