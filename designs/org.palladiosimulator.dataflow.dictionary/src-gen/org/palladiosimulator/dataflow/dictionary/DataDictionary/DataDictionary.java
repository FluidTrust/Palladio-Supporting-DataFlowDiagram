/**
 */
package org.palladiosimulator.dataflow.dictionary.DataDictionary;

import de.uka.ipd.sdq.identifier.Identifier;
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
 *   <li>{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionary#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionaryPackage#getDataDictionary()
 * @model
 * @generated
 */
public interface DataDictionary extends EObject, Identifier {

	/**
     * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.dataflow.dictionary.DataDictionary.DataType}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Entries</em>' containment reference list.
     * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionaryPackage#getDataDictionary_Entries()
     * @model containment="true"
     * @generated
     */
	EList<DataType> getEntries();
} // DataDictionary
