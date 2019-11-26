/**
 */
package DataDictionary;

import identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Dictionary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataDictionary.DataDictionary#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see DataDictionary.DataDictionaryPackage#getDataDictionary()
 * @model
 * @generated
 */
public interface DataDictionary extends Identifier {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link DataDictionary.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see DataDictionary.DataDictionaryPackage#getDataDictionary_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getEntries();

} // DataDictionary
