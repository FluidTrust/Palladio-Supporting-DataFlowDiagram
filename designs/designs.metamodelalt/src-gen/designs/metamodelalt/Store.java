/**
 */
package designs.metamodelalt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designs.metamodelalt.Store#getSource <em>Source</em>}</li>
 *   <li>{@link designs.metamodelalt.Store#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see designs.metamodelalt.MetamodelaltPackage#getStore()
 * @model
 * @generated
 */
public interface Store extends Components {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(DataFlow)
	 * @see designs.metamodelalt.MetamodelaltPackage#getStore_Source()
	 * @model
	 * @generated
	 */
	DataFlow getSource();

	/**
	 * Sets the value of the '{@link designs.metamodelalt.Store#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DataFlow value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link designs.metamodelalt.DataFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see designs.metamodelalt.MetamodelaltPackage#getStore_Target()
	 * @model
	 * @generated
	 */
	EList<DataFlow> getTarget();

} // Store
