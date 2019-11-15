/**
 */
package designs.metamodelalt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designs.metamodelalt.Function#getSource <em>Source</em>}</li>
 *   <li>{@link designs.metamodelalt.Function#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see designs.metamodelalt.MetamodelaltPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Components {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link designs.metamodelalt.DataFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see designs.metamodelalt.MetamodelaltPackage#getFunction_Source()
	 * @model
	 * @generated
	 */
	EList<DataFlow> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link designs.metamodelalt.DataFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see designs.metamodelalt.MetamodelaltPackage#getFunction_Target()
	 * @model
	 * @generated
	 */
	EList<DataFlow> getTarget();

} // Function
