/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataFlowDiagramFactoryImpl extends EFactoryImpl implements DataFlowDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataFlowDiagramFactory init() {
		try {
			DataFlowDiagramFactory theDataFlowDiagramFactory = (DataFlowDiagramFactory) EPackage.Registry.INSTANCE
					.getEFactory(DataFlowDiagramPackage.eNS_URI);
			if (theDataFlowDiagramFactory != null) {
				return theDataFlowDiagramFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataFlowDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowDiagramFactoryImpl() {
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
		case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM:
			return createDataFlowDiagram();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowDiagram createDataFlowDiagram() {
		DataFlowDiagramImpl dataFlowDiagram = new DataFlowDiagramImpl();
		return dataFlowDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowDiagramPackage getDataFlowDiagramPackage() {
		return (DataFlowDiagramPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataFlowDiagramPackage getPackage() {
		return DataFlowDiagramPackage.eINSTANCE;
	}

} //DataFlowDiagramFactoryImpl
