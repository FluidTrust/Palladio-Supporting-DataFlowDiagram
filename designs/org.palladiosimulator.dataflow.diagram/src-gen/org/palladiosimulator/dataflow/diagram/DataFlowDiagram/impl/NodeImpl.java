/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
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
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.NodeImpl#getRequiringProcesses <em>Requiring Processes</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.NodeImpl#getProvidingProcesses <em>Providing Processes</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.NodeImpl#getEquals <em>Equals</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NodeImpl extends ComponentImpl implements Node {
	/**
	 * The cached setting delegate for the '{@link #getRequiringProcesses() <em>Requiring Processes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiringProcesses()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REQUIRING_PROCESSES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DataFlowDiagramPackage.Literals.NODE__REQUIRING_PROCESSES).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getProvidingProcesses() <em>Providing Processes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidingProcesses()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PROVIDING_PROCESSES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DataFlowDiagramPackage.Literals.NODE__PROVIDING_PROCESSES).getSettingDelegate();
	/**
	 * The cached value of the '{@link #getEquals() <em>Equals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquals()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> equals;

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
	@SuppressWarnings("unchecked")
	public EList<Node> getRequiringProcesses() {
		return (EList<Node>)REQUIRING_PROCESSES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Node> getProvidingProcesses() {
		return (EList<Node>)PROVIDING_PROCESSES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEquals() {
		if (equals == null) {
			equals = new EObjectResolvingEList<Node>(Node.class, this, DataFlowDiagramPackage.NODE__EQUALS);
		}
		return equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataFlowDiagramPackage.NODE__REQUIRING_PROCESSES:
				return getRequiringProcesses();
			case DataFlowDiagramPackage.NODE__PROVIDING_PROCESSES:
				return getProvidingProcesses();
			case DataFlowDiagramPackage.NODE__EQUALS:
				return getEquals();
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
			case DataFlowDiagramPackage.NODE__EQUALS:
				getEquals().clear();
				getEquals().addAll((Collection<? extends Node>)newValue);
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
			case DataFlowDiagramPackage.NODE__EQUALS:
				getEquals().clear();
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
			case DataFlowDiagramPackage.NODE__REQUIRING_PROCESSES:
				return REQUIRING_PROCESSES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case DataFlowDiagramPackage.NODE__PROVIDING_PROCESSES:
				return PROVIDING_PROCESSES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case DataFlowDiagramPackage.NODE__EQUALS:
				return equals != null && !equals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl
