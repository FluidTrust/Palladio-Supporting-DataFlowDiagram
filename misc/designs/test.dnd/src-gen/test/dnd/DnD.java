/**
 */
package test.dnd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dn D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.dnd.DnD#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see test.dnd.DndPackage#getDnD()
 * @model
 * @generated
 */
public interface DnD extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link test.dnd.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see test.dnd.DndPackage#getDnD_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

} // DnD
