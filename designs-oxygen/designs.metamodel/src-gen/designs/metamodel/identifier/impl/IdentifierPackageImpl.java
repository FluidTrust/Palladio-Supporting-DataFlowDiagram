/**
 */
package designs.metamodel.identifier.impl;

import designs.metamodel.MetamodelPackage;

import designs.metamodel.dd.DdPackage;

import designs.metamodel.dd.impl.DdPackageImpl;

import designs.metamodel.identifier.Identifier;
import designs.metamodel.identifier.IdentifierFactory;
import designs.metamodel.identifier.IdentifierPackage;

import designs.metamodel.identifier.util.IdentifierValidator;

import designs.metamodel.impl.MetamodelPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdentifierPackageImpl extends EPackageImpl implements IdentifierPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see designs.metamodel.identifier.IdentifierPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IdentifierPackageImpl() {
		super(eNS_URI, IdentifierFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IdentifierPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IdentifierPackage init() {
		if (isInited)
			return (IdentifierPackage) EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);

		// Obtain or create and register package
		IdentifierPackageImpl theIdentifierPackage = (IdentifierPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof IdentifierPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new IdentifierPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MetamodelPackageImpl theMetamodelPackage = (MetamodelPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(MetamodelPackage.eNS_URI) instanceof MetamodelPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(MetamodelPackage.eNS_URI)
						: MetamodelPackage.eINSTANCE);
		DdPackageImpl theDdPackage = (DdPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(DdPackage.eNS_URI) instanceof DdPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(DdPackage.eNS_URI)
						: DdPackage.eINSTANCE);

		// Create package meta-data objects
		theIdentifierPackage.createPackageContents();
		theMetamodelPackage.createPackageContents();
		theDdPackage.createPackageContents();

		// Initialize created meta-data
		theIdentifierPackage.initializePackageContents();
		theMetamodelPackage.initializePackageContents();
		theDdPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theIdentifierPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return IdentifierValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theIdentifierPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IdentifierPackage.eNS_URI, theIdentifierPackage);
		return theIdentifierPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifier() {
		return identifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifier_Id() {
		return (EAttribute) identifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierFactory getIdentifierFactory() {
		return (IdentifierFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		identifierEClass = createEClass(IDENTIFIER);
		createEAttribute(identifierEClass, IDENTIFIER__ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(identifierEClass, Identifier.class, "Identifier", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifier_Id(), ecorePackage.getEString(), "id", null, 1, 1, Identifier.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL", "settingDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL" });
		addAnnotation(identifierEClass, source, new String[] { "constraints", "identifierIsUnique" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
		addAnnotation(identifierEClass, source,
				new String[] { "identifierIsUnique", "Identifier.allInstances()->isUnique(p: Identifier | p.id)" });
	}

} //IdentifierPackageImpl
