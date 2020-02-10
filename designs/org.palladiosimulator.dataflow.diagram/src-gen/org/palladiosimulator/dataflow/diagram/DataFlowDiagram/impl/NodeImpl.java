/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
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
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.NodeImpl#getRequiringNodes <em>Requiring Nodes</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.NodeImpl#getProvidingNodes <em>Providing Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NodeImpl extends ComponentImpl implements Node {
	/**
	 * The cached setting delegate for the '{@link #getRequiringNodes() <em>Requiring Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiringNodes()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REQUIRING_NODES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DataFlowDiagramPackage.Literals.NODE__REQUIRING_NODES).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getProvidingNodes() <em>Providing Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidingNodes()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PROVIDING_NODES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DataFlowDiagramPackage.Literals.NODE__PROVIDING_NODES).getSettingDelegate();
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
	public EList<Node> getRequiringNodes() {
		return (EList<Node>)REQUIRING_NODES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Node> getProvidingNodes() {
		return (EList<Node>)PROVIDING_NODES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataFlowDiagramPackage.NODE__REQUIRING_NODES:
				return getRequiringNodes();
			case DataFlowDiagramPackage.NODE__PROVIDING_NODES:
				return getProvidingNodes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataFlowDiagramPackage.NODE__REQUIRING_NODES:
				return REQUIRING_NODES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case DataFlowDiagramPackage.NODE__PROVIDING_NODES:
				return PROVIDING_NODES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl
