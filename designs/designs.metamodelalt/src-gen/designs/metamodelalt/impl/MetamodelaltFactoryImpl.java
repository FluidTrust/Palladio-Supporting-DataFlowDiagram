/**
 */
package designs.metamodelalt.impl;

import designs.metamodelalt.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodelaltFactoryImpl extends EFactoryImpl implements MetamodelaltFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetamodelaltFactory init() {
		try {
			MetamodelaltFactory theMetamodelaltFactory = (MetamodelaltFactory) EPackage.Registry.INSTANCE
					.getEFactory(MetamodelaltPackage.eNS_URI);
			if (theMetamodelaltFactory != null) {
				return theMetamodelaltFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetamodelaltFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelaltFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MetamodelaltPackage.DATA_FLOW_DIAGRAM:
			return createDataFlowDiagram();
		case MetamodelaltPackage.STORE:
			return createStore();
		case MetamodelaltPackage.TERMINATOR:
			return createTerminator();
		case MetamodelaltPackage.FUNCTION:
			return createFunction();
		case MetamodelaltPackage.DATA_FLOW:
			return createDataFlow();
		case MetamodelaltPackage.DATA:
			return createData();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFlowDiagram createDataFlowDiagram() {
		DataFlowDiagramImpl dataFlowDiagram = new DataFlowDiagramImpl();
		return dataFlowDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Store createStore() {
		StoreImpl store = new StoreImpl();
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Terminator createTerminator() {
		TerminatorImpl terminator = new TerminatorImpl();
		return terminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFlow createDataFlow() {
		DataFlowImpl dataFlow = new DataFlowImpl();
		return dataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetamodelaltPackage getMetamodelaltPackage() {
		return (MetamodelaltPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetamodelaltPackage getPackage() {
		return MetamodelaltPackage.eINSTANCE;
	}

} //MetamodelaltFactoryImpl
