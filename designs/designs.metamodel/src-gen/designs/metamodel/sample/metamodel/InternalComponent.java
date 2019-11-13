/**
 */
package designs.metamodel.sample.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designs.metamodel.sample.metamodel.InternalComponent#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see designs.metamodel.sample.metamodel.MetamodelPackage#getInternalComponent()
 * @model abstract="true"
 * @generated
 */
public interface InternalComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link designs.metamodel.sample.metamodel.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see designs.metamodel.sample.metamodel.MetamodelPackage#getInternalComponent_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getInputs();

} // InternalComponent
