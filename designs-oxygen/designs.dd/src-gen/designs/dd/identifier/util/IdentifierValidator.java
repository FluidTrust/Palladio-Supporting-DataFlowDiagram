/**
 */
package designs.dd.identifier.util;

import designs.dd.identifier.*;

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
 * @see designs.dd.identifier.IdentifierPackage
 * @generated
 */
public class IdentifierValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final IdentifierValidator INSTANCE = new IdentifierValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "designs.dd.identifier";

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
	public IdentifierValidator() {
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
		return IdentifierPackage.eINSTANCE;
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
		case IdentifierPackage.IDENTIFIER:
			return validateIdentifier((Identifier) value, diagnostics, context);
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
	 * The cached validation expression for the identifierIsUnique constraint of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String IDENTIFIER__IDENTIFIER_IS_UNIQUE__EEXPRESSION = "Identifier.allInstances()->isUnique(p: Identifier | p.id)";

	/**
	 * Validates the identifierIsUnique constraint of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifier_identifierIsUnique(Identifier identifier, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(IdentifierPackage.Literals.IDENTIFIER, identifier, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL", "identifierIsUnique",
				IDENTIFIER__IDENTIFIER_IS_UNIQUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
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

} //IdentifierValidator
