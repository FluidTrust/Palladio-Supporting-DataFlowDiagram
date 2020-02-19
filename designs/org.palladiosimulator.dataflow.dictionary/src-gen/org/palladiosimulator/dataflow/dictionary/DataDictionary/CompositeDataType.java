/**
 */
package org.palladiosimulator.dataflow.dictionary.DataDictionary;

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
 *   <li>{@link org.palladiosimulator.dataflow.dictionary.DataDictionary.CompositeDataType#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionaryPackage#getCompositeDataType()
 * @model annotation="\040http://www.eclipse.org/emf/2002/Ecore/OCL uniqueEntryNames='self.entries-&gt;isUnique(name)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueEntryNames'"
 * @generated
 */
public interface CompositeDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.dataflow.dictionary.DataDictionary.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionaryPackage#getCompositeDataType_Components()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Entry> getComponents();

} // CompositeDataType
