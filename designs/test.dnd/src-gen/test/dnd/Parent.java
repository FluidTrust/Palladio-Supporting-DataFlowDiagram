/**
 */
package test.dnd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.dnd.Parent#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see test.dnd.DndPackage#getParent()
 * @model
 * @generated
 */
public interface Parent extends Component {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link test.dnd.Child}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see test.dnd.DndPackage#getParent_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Child> getChildren();

} // Parent
