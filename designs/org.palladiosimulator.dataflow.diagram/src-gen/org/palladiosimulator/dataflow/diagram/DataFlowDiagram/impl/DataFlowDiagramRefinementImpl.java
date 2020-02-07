/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramRefinementImpl#getRefinedProcess <em>Refined Process</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramRefinementImpl#getRefiningDiagram <em>Refining Diagram</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramRefinementImpl#getProvidingProcesses <em>Providing Processes</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramRefinementImpl#getRequiringProcesses <em>Requiring Processes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFlowDiagramRefinementImpl extends IdentifierImpl implements DataFlowDiagramRefinement {
	/**
	 * The cached value of the '{@link #getRefinedProcess() <em>Refined Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedProcess()
	 * @generated
	 * @ordered
	 */
	protected org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process refinedProcess;

	/**
	 * The cached value of the '{@link #getRefiningDiagram() <em>Refining Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefiningDiagram()
	 * @generated
	 * @ordered
	 */
	protected DataFlowDiagram refiningDiagram;

	/**
	 * The cached setting delegate for the '{@link #getProvidingProcesses() <em>Providing Processes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidingProcesses()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PROVIDING_PROCESSES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DataFlowDiagramPackage.Literals.DATA_FLOW_DIAGRAM_REFINEMENT__PROVIDING_PROCESSES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getRequiringProcesses() <em>Requiring Processes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiringProcesses()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REQUIRING_PROCESSES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DataFlowDiagramPackage.Literals.DATA_FLOW_DIAGRAM_REFINEMENT__REQUIRING_PROCESSES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowDiagramRefinementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataFlowDiagramPackage.Literals.DATA_FLOW_DIAGRAM_REFINEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process getRefinedProcess() {
		if (refinedProcess != null && refinedProcess.eIsProxy()) {
			InternalEObject oldRefinedProcess = (InternalEObject)refinedProcess;
			refinedProcess = (org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process)eResolveProxy(oldRefinedProcess);
			if (refinedProcess != oldRefinedProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINED_PROCESS, oldRefinedProcess, refinedProcess));
			}
		}
		return refinedProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process basicGetRefinedProcess() {
		return refinedProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinedProcess(org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process newRefinedProcess) {
		org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process oldRefinedProcess = refinedProcess;
		refinedProcess = newRefinedProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINED_PROCESS, oldRefinedProcess, refinedProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowDiagram getRefiningDiagram() {
		return refiningDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefiningDiagram(DataFlowDiagram newRefiningDiagram, NotificationChain msgs) {
		DataFlowDiagram oldRefiningDiagram = refiningDiagram;
		refiningDiagram = newRefiningDiagram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINING_DIAGRAM, oldRefiningDiagram, newRefiningDiagram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefiningDiagram(DataFlowDiagram newRefiningDiagram) {
		if (newRefiningDiagram != refiningDiagram) {
			NotificationChain msgs = null;
			if (refiningDiagram != null)
				msgs = ((InternalEObject)refiningDiagram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINING_DIAGRAM, null, msgs);
			if (newRefiningDiagram != null)
				msgs = ((InternalEObject)newRefiningDiagram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINING_DIAGRAM, null, msgs);
			msgs = basicSetRefiningDiagram(newRefiningDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINING_DIAGRAM, newRefiningDiagram, newRefiningDiagram));
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
	@SuppressWarnings("unchecked")
	public EList<Node> getRequiringProcesses() {
		return (EList<Node>)REQUIRING_PROCESSES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINING_DIAGRAM:
				return basicSetRefiningDiagram(null, msgs);
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
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINED_PROCESS:
				if (resolve) return getRefinedProcess();
				return basicGetRefinedProcess();
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINING_DIAGRAM:
				return getRefiningDiagram();
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__PROVIDING_PROCESSES:
				return getProvidingProcesses();
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REQUIRING_PROCESSES:
				return getRequiringProcesses();
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
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINED_PROCESS:
				setRefinedProcess((org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process)newValue);
				return;
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINING_DIAGRAM:
				setRefiningDiagram((DataFlowDiagram)newValue);
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
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINED_PROCESS:
				setRefinedProcess((org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process)null);
				return;
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINING_DIAGRAM:
				setRefiningDiagram((DataFlowDiagram)null);
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
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINED_PROCESS:
				return refinedProcess != null;
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINING_DIAGRAM:
				return refiningDiagram != null;
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__PROVIDING_PROCESSES:
				return PROVIDING_PROCESSES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REQUIRING_PROCESSES:
				return REQUIRING_PROCESSES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //DataFlowDiagramRefinementImpl
