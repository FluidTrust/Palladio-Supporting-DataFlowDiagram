/**
 */
package designs.alternative.dd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Dictionary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designs.alternative.dd.DataDictionary#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see designs.alternative.dd.DdPackage#getDataDictionary()
 * @model
 * @generated
 */
public interface DataDictionary extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link designs.alternative.dd.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see designs.alternative.dd.DdPackage#getDataDictionary_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

} // DataDictionary
