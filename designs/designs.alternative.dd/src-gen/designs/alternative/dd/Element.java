/**
 */
package designs.alternative.dd;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designs.alternative.dd.Element#getName <em>Name</em>}</li>
 *   <li>{@link designs.alternative.dd.Element#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @see designs.alternative.dd.DdPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see designs.alternative.dd.DdPackage#getElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link designs.alternative.dd.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Composition</b></em>' reference list.
	 * The list contents are of type {@link designs.alternative.dd.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' reference list.
	 * @see designs.alternative.dd.DdPackage#getElement_Composition()
	 * @model
	 * @generated
	 */
	EList<Element> getComposition();

} // Element
