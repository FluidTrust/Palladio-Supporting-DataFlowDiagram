/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Edge;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Flow Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramImpl#getRefinedBy <em>Refined By</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramImpl#getRefiningEdges <em>Refining Edges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFlowDiagramImpl extends IdentifierImpl implements DataFlowDiagram {
	/**
	 * The cached value of the '{@link #getRefinedBy() <em>Refined By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlowDiagramRefinement> refinedBy;
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;
	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edges;
	/**
	 * The cached value of the '{@link #getRefiningEdges() <em>Refining Edges</em>}' containment reference list.
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
	protected DataFlowDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataFlowDiagramPackage.Literals.DATA_FLOW_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataFlowDiagramRefinement> getRefinedBy() {
		if (refinedBy == null) {
			refinedBy = new EObjectContainmentEList<DataFlowDiagramRefinement>(DataFlowDiagramRefinement.class, this, DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINED_BY);
		}
		return refinedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentEList<Edge>(Edge.class, this, DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__EDGES);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getRefiningEdges() {
		if (refiningEdges == null) {
			refiningEdges = new EObjectContainmentEList<Edge>(Edge.class, this, DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINING_EDGES);
		}
		return refiningEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINED_BY:
				return ((InternalEList<?>)getRefinedBy()).basicRemove(otherEnd, msgs);
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINING_EDGES:
				return ((InternalEList<?>)getRefiningEdges()).basicRemove(otherEnd, msgs);
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
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINED_BY:
				return getRefinedBy();
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__NODES:
				return getNodes();
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__EDGES:
				return getEdges();
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINING_EDGES:
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
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINED_BY:
				getRefinedBy().clear();
				getRefinedBy().addAll((Collection<? extends DataFlowDiagramRefinement>)newValue);
				return;
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends Edge>)newValue);
				return;
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINING_EDGES:
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
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINED_BY:
				getRefinedBy().clear();
				return;
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__NODES:
				getNodes().clear();
				return;
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__EDGES:
				getEdges().clear();
				return;
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINING_EDGES:
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
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINED_BY:
				return refinedBy != null && !refinedBy.isEmpty();
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__NODES:
				return nodes != null && !nodes.isEmpty();
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__EDGES:
				return edges != null && !edges.isEmpty();
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINING_EDGES:
				return refiningEdges != null && !refiningEdges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataFlowDiagramImpl
