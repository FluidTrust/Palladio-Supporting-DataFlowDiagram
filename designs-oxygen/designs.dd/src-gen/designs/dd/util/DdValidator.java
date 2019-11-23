/**
 */
package designs.dd.util;

import designs.dd.*;

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
 * @see designs.dd.DdPackage
 * @generated
 */
public class DdValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DdValidator INSTANCE = new DdValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "designs.dd";

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
	public DdValidator() {
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
		return DdPackage.eINSTANCE;
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
		case DdPackage.DATA_TYPE:
			return validateDataType((DataType) value, diagnostics, context);
		case DdPackage.COMPOSITE_DATA_TYPE:
			return validateCompositeDataType((CompositeDataType) value, diagnostics, context);
		case DdPackage.COLLECTION_DATA_TYPE:
			return validateCollectionDataType((CollectionDataType) value, diagnostics, context);
		case DdPackage.PRIMITIVE_DATA_TYPE:
			return validatePrimitiveDataType((PrimitiveDataType) value, diagnostics, context);
		case DdPackage.ENTRY:
			return validateEntry((Entry) value, diagnostics, context);
		case DdPackage.IDENTIFIER:
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
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataType, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(dataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIdentifier_identifierIsUnique(dataType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeDataType(CompositeDataType compositeDataType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compositeDataType, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(compositeDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(compositeDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(compositeDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(compositeDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(compositeDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(compositeDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(compositeDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(compositeDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIdentifier_identifierIsUnique(compositeDataType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionDataType(CollectionDataType collectionDataType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(collectionDataType, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(collectionDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(collectionDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(collectionDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(collectionDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(collectionDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(collectionDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(collectionDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(collectionDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIdentifier_identifierIsUnique(collectionDataType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveDataType(PrimitiveDataType primitiveDataType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(primitiveDataType, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(primitiveDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(primitiveDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(primitiveDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(primitiveDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(primitiveDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(primitiveDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(primitiveDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(primitiveDataType, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIdentifier_identifierIsUnique(primitiveDataType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntry(Entry entry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entry, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(entry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(entry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(entry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(entry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(entry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(entry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(entry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(entry, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIdentifier_identifierIsUnique(entry, diagnostics, context);
		return result;
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
		return validate(DdPackage.Literals.IDENTIFIER, identifier, diagnostics, context,
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

} //DdValidator
