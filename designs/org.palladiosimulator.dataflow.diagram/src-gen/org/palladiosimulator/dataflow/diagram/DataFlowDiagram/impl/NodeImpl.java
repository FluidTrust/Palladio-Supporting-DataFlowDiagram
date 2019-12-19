/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
	public EList<Node> getRequiringProcesses() {
		// TODO: implement this method to return the 'Requiring Processes' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getProvidingProcesses() {
		// TODO: implement this method to return the 'Providing Processes' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
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
			case DataFlowDiagramPackage.NODE__REQUIRING_PROCESSES:
				getRequiringProcesses().clear();
				getRequiringProcesses().addAll((Collection<? extends Node>)newValue);
				return;
			case DataFlowDiagramPackage.NODE__PROVIDING_PROCESSES:
				getProvidingProcesses().clear();
				getProvidingProcesses().addAll((Collection<? extends Node>)newValue);
				return;
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
			case DataFlowDiagramPackage.NODE__REQUIRING_PROCESSES:
				getRequiringProcesses().clear();
				return;
			case DataFlowDiagramPackage.NODE__PROVIDING_PROCESSES:
				getProvidingProcesses().clear();
				return;
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
				return !getRequiringProcesses().isEmpty();
			case DataFlowDiagramPackage.NODE__PROVIDING_PROCESSES:
				return !getProvidingProcesses().isEmpty();
			case DataFlowDiagramPackage.NODE__EQUALS:
				return equals != null && !equals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl
