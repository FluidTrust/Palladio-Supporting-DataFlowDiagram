/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramRefinementImpl#getRefinedProcesses <em>Refined Processes</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramRefinementImpl#getRefiningDiagram <em>Refining Diagram</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFlowDiagramRefinementImpl extends IdentifierImpl implements DataFlowDiagramRefinement {
	/**
	 * The cached value of the '{@link #getRefinedProcesses() <em>Refined Processes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process> refinedProcesses;

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
	public EList<org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process> getRefinedProcesses() {
		if (refinedProcesses == null) {
			refinedProcesses = new EObjectResolvingEList<org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process>(org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process.class, this, DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINED_PROCESSES);
		}
		return refinedProcesses;
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
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINED_PROCESSES:
				return getRefinedProcesses();
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINING_DIAGRAM:
				return getRefiningDiagram();
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
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINED_PROCESSES:
				getRefinedProcesses().clear();
				getRefinedProcesses().addAll((Collection<? extends org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process>)newValue);
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
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINED_PROCESSES:
				getRefinedProcesses().clear();
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
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINED_PROCESSES:
				return refinedProcesses != null && !refinedProcesses.isEmpty();
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT__REFINING_DIAGRAM:
				return refiningDiagram != null;
		}
		return super.eIsSet(featureID);
	}

} //DataFlowDiagramRefinementImpl
