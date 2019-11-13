/**
 */
package designs.metamodel.sample.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flow Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designs.metamodel.sample.metamodel.DataFlowDiagram#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see designs.metamodel.sample.metamodel.MetamodelPackage#getDataFlowDiagram()
 * @model
 * @generated
 */
public interface DataFlowDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link designs.metamodel.sample.metamodel.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see designs.metamodel.sample.metamodel.MetamodelPackage#getDataFlowDiagram_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

} // DataFlowDiagram
