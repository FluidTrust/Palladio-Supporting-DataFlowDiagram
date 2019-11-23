/**
 */
package designs.metamodel.util;

import designs.metamodel.Component;
import designs.metamodel.Data;
import designs.metamodel.DataFlow;
import designs.metamodel.DataFlowDiagram;
import designs.metamodel.ExternalActor;
import designs.metamodel.Identifier;
import designs.metamodel.MetamodelPackage;
import designs.metamodel.Port;
import designs.metamodel.RefiningReference;
import designs.metamodel.Store;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see designs.metamodel.MetamodelPackage
 * @generated
 */
public class MetamodelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MetamodelValidator INSTANCE = new MetamodelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "designs.metamodel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return MetamodelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case MetamodelPackage.IDENTIFIER:
			return validateIdentifier((Identifier) value, diagnostics, context);
		case MetamodelPackage.DATA_FLOW_DIAGRAM:
			return validateDataFlowDiagram((DataFlowDiagram) value, diagnostics, context);
		case MetamodelPackage.COMPONENT:
			return validateComponent((Component) value, diagnostics, context);
		case MetamodelPackage.DATA_FLOW:
			return validateDataFlow((DataFlow) value, diagnostics, context);
		case MetamodelPackage.PROCESS:
			return validateProcess((designs.metamodel.Process) value, diagnostics, context);
		case MetamodelPackage.EXTERNAL_ACTOR:
			return validateExternalActor((ExternalActor) value, diagnostics, context);
		case MetamodelPackage.STORE:
			return validateStore((Store) value, diagnostics, context);
		case MetamodelPackage.DATA:
			return validateData((Data) value, diagnostics, context);
		case MetamodelPackage.PORT:
			return validatePort((Port) value, diagnostics, context);
		case MetamodelPackage.REFINING_REFERENCE:
			return validateRefiningReference((RefiningReference) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifier(Identifier identifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(identifier, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(identifier, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(identifier, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(identifier, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(identifier, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(identifier, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(identifier, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(identifier, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(identifier, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIdentifier_identifierIsUnique(identifier, diagnostics, context);
		return result;
	}

	/**
	 * Validates the identifierIsUnique constraint of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifier_identifierIsUnique(Identifier identifier, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "identifierIsUnique", getObjectLabel(identifier, context) },
								new Object[] { identifier }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataFlowDiagram(DataFlowDiagram dataFlowDiagram, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataFlowDiagram, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dataFlowDiagram, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dataFlowDiagram, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dataFlowDiagram, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(dataFlowDiagram, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dataFlowDiagram, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dataFlowDiagram, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dataFlowDiagram, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dataFlowDiagram, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIdentifier_identifierIsUnique(dataFlowDiagram, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(component, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIdentifier_identifierIsUnique(component, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataFlow(DataFlow dataFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataFlow, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dataFlow, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dataFlow, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dataFlow, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(dataFlow, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dataFlow, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dataFlow, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dataFlow, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dataFlow, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIdentifier_identifierIsUnique(dataFlow, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(designs.metamodel.Process process, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(process, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(process, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIdentifier_identifierIsUnique(process, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalActor(ExternalActor externalActor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalActor, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(externalActor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(externalActor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(externalActor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(externalActor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(externalActor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(externalActor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(externalActor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(externalActor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIdentifier_identifierIsUnique(externalActor, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStore(Store store, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(store, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIdentifier_identifierIsUnique(store, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateData(Data data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(data, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(data, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(data, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(data, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(data, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(data, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(data, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(data, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(data, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIdentifier_identifierIsUnique(data, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(port, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(port, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(port, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(port, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(port, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(port, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(port, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(port, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(port, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIdentifier_identifierIsUnique(port, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefiningReference(RefiningReference refiningReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(refiningReference, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(refiningReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(refiningReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(refiningReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(refiningReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(refiningReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(refiningReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(refiningReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(refiningReference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIdentifier_identifierIsUnique(refiningReference, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MetamodelValidator
