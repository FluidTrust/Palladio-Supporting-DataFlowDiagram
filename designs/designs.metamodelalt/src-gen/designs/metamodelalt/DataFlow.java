/**
 */
package designs.metamodelalt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designs.metamodelalt.DataFlow#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see designs.metamodelalt.MetamodelaltPackage#getDataFlow()
 * @model
 * @generated
 */
public interface DataFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link designs.metamodelalt.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see designs.metamodelalt.MetamodelaltPackage#getDataFlow_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

} // DataFlow
