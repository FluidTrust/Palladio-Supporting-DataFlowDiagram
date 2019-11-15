/**
 */
package designs.metamodelalt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designs.metamodelalt.Terminator#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see designs.metamodelalt.MetamodelaltPackage#getTerminator()
 * @model
 * @generated
 */
public interface Terminator extends Components {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link designs.metamodelalt.DataFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see designs.metamodelalt.MetamodelaltPackage#getTerminator_Target()
	 * @model
	 * @generated
	 */
	EList<DataFlow> getTarget();

} // Terminator
