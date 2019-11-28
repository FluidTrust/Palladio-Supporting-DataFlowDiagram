/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.RefiningReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refining Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.RefiningReferenceImpl#getRefinedProcesses <em>Refined Processes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefiningReferenceImpl extends de.uka.ipd.sdq.identifier.impl.IdentifierImpl implements RefiningReference {
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
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected RefiningReferenceImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return DataFlowDiagramPackage.Literals.REFINING_REFERENCE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process> getRefinedProcesses() {
        if (refinedProcesses == null) {
            refinedProcesses = new EObjectResolvingEList<org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process>(org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process.class, this, DataFlowDiagramPackage.REFINING_REFERENCE__REFINED_PROCESSES);
        }
        return refinedProcesses;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DataFlowDiagramPackage.REFINING_REFERENCE__REFINED_PROCESSES:
                return getRefinedProcesses();
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
            case DataFlowDiagramPackage.REFINING_REFERENCE__REFINED_PROCESSES:
                getRefinedProcesses().clear();
                getRefinedProcesses().addAll((Collection<? extends org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process>)newValue);
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
            case DataFlowDiagramPackage.REFINING_REFERENCE__REFINED_PROCESSES:
                getRefinedProcesses().clear();
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
            case DataFlowDiagramPackage.REFINING_REFERENCE__REFINED_PROCESSES:
                return refinedProcesses != null && !refinedProcesses.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //RefiningReferenceImpl
