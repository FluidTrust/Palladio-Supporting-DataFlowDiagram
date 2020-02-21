/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Edge;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.EdgeRefinement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.EdgeRefinementImpl#getRefinedEdge <em>Refined Edge</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.EdgeRefinementImpl#getRefiningEdges <em>Refining Edges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeRefinementImpl extends IdentifierImpl implements EdgeRefinement {
	/**
	 * The cached value of the '{@link #getRefinedEdge() <em>Refined Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedEdge()
	 * @generated
	 * @ordered
	 */
	protected Edge refinedEdge;
	/**
	 * The cached value of the '{@link #getRefiningEdges() <em>Refining Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefiningEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> refiningEdges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeRefinementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataFlowDiagramPackage.Literals.EDGE_REFINEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge getRefinedEdge() {
		if (refinedEdge != null && refinedEdge.eIsProxy()) {
			InternalEObject oldRefinedEdge = (InternalEObject)refinedEdge;
			refinedEdge = (Edge)eResolveProxy(oldRefinedEdge);
			if (refinedEdge != oldRefinedEdge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataFlowDiagramPackage.EDGE_REFINEMENT__REFINED_EDGE, oldRefinedEdge, refinedEdge));
			}
		}
		return refinedEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge basicGetRefinedEdge() {
		return refinedEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinedEdge(Edge newRefinedEdge) {
		Edge oldRefinedEdge = refinedEdge;
		refinedEdge = newRefinedEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataFlowDiagramPackage.EDGE_REFINEMENT__REFINED_EDGE, oldRefinedEdge, refinedEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getRefiningEdges() {
		if (refiningEdges == null) {
			refiningEdges = new EObjectResolvingEList<Edge>(Edge.class, this, DataFlowDiagramPackage.EDGE_REFINEMENT__REFINING_EDGES);
		}
		return refiningEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataFlowDiagramPackage.EDGE_REFINEMENT__REFINED_EDGE:
				if (resolve) return getRefinedEdge();
				return basicGetRefinedEdge();
			case DataFlowDiagramPackage.EDGE_REFINEMENT__REFINING_EDGES:
				return getRefiningEdges();
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
			case DataFlowDiagramPackage.EDGE_REFINEMENT__REFINED_EDGE:
				setRefinedEdge((Edge)newValue);
				return;
			case DataFlowDiagramPackage.EDGE_REFINEMENT__REFINING_EDGES:
				getRefiningEdges().clear();
				getRefiningEdges().addAll((Collection<? extends Edge>)newValue);
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
			case DataFlowDiagramPackage.EDGE_REFINEMENT__REFINED_EDGE:
				setRefinedEdge((Edge)null);
				return;
			case DataFlowDiagramPackage.EDGE_REFINEMENT__REFINING_EDGES:
				getRefiningEdges().clear();
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
			case DataFlowDiagramPackage.EDGE_REFINEMENT__REFINED_EDGE:
				return refinedEdge != null;
			case DataFlowDiagramPackage.EDGE_REFINEMENT__REFINING_EDGES:
				return refiningEdges != null && !refiningEdges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EdgeRefinementImpl
