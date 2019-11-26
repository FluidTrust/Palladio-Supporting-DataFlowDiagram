/**
 */
package DataDictionary;

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
 *   <li>{@link DataDictionary.CompositeDataType#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see DataDictionary.DataDictionaryPackage#getCompositeDataType()
 * @model
 * @generated
 */
public interface CompositeDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link DataDictionary.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see DataDictionary.DataDictionaryPackage#getCompositeDataType_Components()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Entry> getComponents();

} // CompositeDataType
