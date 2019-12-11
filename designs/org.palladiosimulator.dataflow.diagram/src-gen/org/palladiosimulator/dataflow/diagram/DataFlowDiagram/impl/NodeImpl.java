/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.NodeImpl#getIncomingDataFlow <em>Incoming Data Flow</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.NodeImpl#getOutgoingDataFlow <em>Outgoing Data Flow</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.NodeImpl#getEquals <em>Equals</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NodeImpl extends NamedComponentImpl implements Node {
	/**
	 * The cached value of the '{@link #getIncomingDataFlow() <em>Incoming Data Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingDataFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> incomingDataFlow;

	/**
	 * The cached value of the '{@link #getOutgoingDataFlow() <em>Outgoing Data Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingDataFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> outgoingDataFlow;

	/**
	 * The cached value of the '{@link #getEquals() <em>Equals</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquals()
	 * @generated
	 * @ordered
	 */
	protected Node equals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataFlowDiagramPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getOutgoingDataFlow() {
		if (outgoingDataFlow == null) {
			outgoingDataFlow = new EObjectResolvingEList<Node>(Node.class, this, DataFlowDiagramPackage.NODE__OUTGOING_DATA_FLOW);
		}
		return outgoingDataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEquals() {
		if (equals != null && equals.eIsProxy()) {
			InternalEObject oldEquals = (InternalEObject)equals;
			equals = (Node)eResolveProxy(oldEquals);
			if (equals != oldEquals) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataFlowDiagramPackage.NODE__EQUALS, oldEquals, equals));
			}
		}
		return equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEquals() {
		return equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquals(Node newEquals) {
		Node oldEquals = equals;
		equals = newEquals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataFlowDiagramPackage.NODE__EQUALS, oldEquals, equals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getIncomingDataFlow() {
		if (incomingDataFlow == null) {
			incomingDataFlow = new EObjectResolvingEList<Node>(Node.class, this, DataFlowDiagramPackage.NODE__INCOMING_DATA_FLOW);
		}
		return incomingDataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataFlowDiagramPackage.NODE__INCOMING_DATA_FLOW:
				return getIncomingDataFlow();
			case DataFlowDiagramPackage.NODE__OUTGOING_DATA_FLOW:
				return getOutgoingDataFlow();
			case DataFlowDiagramPackage.NODE__EQUALS:
				if (resolve) return getEquals();
				return basicGetEquals();
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
			case DataFlowDiagramPackage.NODE__INCOMING_DATA_FLOW:
				getIncomingDataFlow().clear();
				getIncomingDataFlow().addAll((Collection<? extends Node>)newValue);
				return;
			case DataFlowDiagramPackage.NODE__OUTGOING_DATA_FLOW:
				getOutgoingDataFlow().clear();
				getOutgoingDataFlow().addAll((Collection<? extends Node>)newValue);
				return;
			case DataFlowDiagramPackage.NODE__EQUALS:
				setEquals((Node)newValue);
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
			case DataFlowDiagramPackage.NODE__INCOMING_DATA_FLOW:
				getIncomingDataFlow().clear();
				return;
			case DataFlowDiagramPackage.NODE__OUTGOING_DATA_FLOW:
				getOutgoingDataFlow().clear();
				return;
			case DataFlowDiagramPackage.NODE__EQUALS:
				setEquals((Node)null);
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
			case DataFlowDiagramPackage.NODE__INCOMING_DATA_FLOW:
				return incomingDataFlow != null && !incomingDataFlow.isEmpty();
			case DataFlowDiagramPackage.NODE__OUTGOING_DATA_FLOW:
				return outgoingDataFlow != null && !outgoingDataFlow.isEmpty();
			case DataFlowDiagramPackage.NODE__EQUALS:
				return equals != null;
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl
