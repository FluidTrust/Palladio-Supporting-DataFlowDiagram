/**
 */
package designs.metamodel;

import designs.metamodel.identifier.Identifier;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link designs.metamodel.Component#getIncomingDataFlow <em>Incoming Data Flow</em>}</li>
 *   <li>{@link designs.metamodel.Component#getOutgoingDataFlow <em>Outgoing Data Flow</em>}</li>
 *   <li>{@link designs.metamodel.Component#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see designs.metamodel.MetamodelPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends Identifier {
	/**
	 * Returns the value of the '<em><b>Incoming Data Flow</b></em>' reference list.
	 * The list contents are of type {@link designs.metamodel.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Data Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Data Flow</em>' reference list.
	 * @see designs.metamodel.MetamodelPackage#getComponent_IncomingDataFlow()
	 * @model
	 * @generated
	 */
	EList<Component> getIncomingDataFlow();

	/**
	 * Returns the value of the '<em><b>Outgoing Data Flow</b></em>' reference list.
	 * The list contents are of type {@link designs.metamodel.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Data Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Data Flow</em>' reference list.
	 * @see designs.metamodel.MetamodelPackage#getComponent_OutgoingDataFlow()
	 * @model
	 * @generated
	 */
	EList<Component> getOutgoingDataFlow();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see designs.metamodel.MetamodelPackage#getComponent_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link designs.metamodel.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Component
