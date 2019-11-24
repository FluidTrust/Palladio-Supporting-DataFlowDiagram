/**
 */
package designs.metamodel;

import designs.metamodel.identifier.Identifier;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refining Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designs.metamodel.RefiningReference#getRefinedProcesses <em>Refined Processes</em>}</li>
 * </ul>
 *
 * @see designs.metamodel.MetamodelPackage#getRefiningReference()
 * @model
 * @generated
 */
public interface RefiningReference extends Identifier {
	/**
	 * Returns the value of the '<em><b>Refined Processes</b></em>' reference list.
	 * The list contents are of type {@link designs.metamodel.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined Processes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Processes</em>' reference list.
	 * @see designs.metamodel.MetamodelPackage#getRefiningReference_RefinedProcesses()
	 * @model required="true"
	 * @generated
	 */
	EList<designs.metamodel.Process> getRefinedProcesses();

} // RefiningReference
