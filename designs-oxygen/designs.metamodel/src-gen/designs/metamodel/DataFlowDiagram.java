/**
 */
package designs.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flow Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designs.metamodel.DataFlowDiagram#getComponent <em>Component</em>}</li>
 *   <li>{@link designs.metamodel.DataFlowDiagram#getRefines <em>Refines</em>}</li>
 *   <li>{@link designs.metamodel.DataFlowDiagram#getRefinedBy <em>Refined By</em>}</li>
 * </ul>
 *
 * @see designs.metamodel.MetamodelPackage#getDataFlowDiagram()
 * @model abstract="true"
 * @generated
 */
public interface DataFlowDiagram extends Identifier {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link designs.metamodel.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see designs.metamodel.MetamodelPackage#getDataFlowDiagram_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Refines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refines</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refines</em>' containment reference.
	 * @see #setRefines(RefiningReference)
	 * @see designs.metamodel.MetamodelPackage#getDataFlowDiagram_Refines()
	 * @model containment="true"
	 * @generated
	 */
	RefiningReference getRefines();

	/**
	 * Sets the value of the '{@link designs.metamodel.DataFlowDiagram#getRefines <em>Refines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refines</em>' containment reference.
	 * @see #getRefines()
	 * @generated
	 */
	void setRefines(RefiningReference value);

	/**
	 * Returns the value of the '<em><b>Refined By</b></em>' containment reference list.
	 * The list contents are of type {@link designs.metamodel.DataFlowDiagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined By</em>' containment reference list.
	 * @see designs.metamodel.MetamodelPackage#getDataFlowDiagram_RefinedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataFlowDiagram> getRefinedBy();

} // DataFlowDiagram
