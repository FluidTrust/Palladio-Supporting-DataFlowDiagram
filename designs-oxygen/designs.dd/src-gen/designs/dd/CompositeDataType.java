/**
 */
package designs.dd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designs.dd.CompositeDataType#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see designs.dd.DdPackage#getCompositeDataType()
 * @model
 * @generated
 */
public interface CompositeDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link designs.dd.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see designs.dd.DdPackage#getCompositeDataType_Entries()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Entry> getEntries();

} // CompositeDataType
