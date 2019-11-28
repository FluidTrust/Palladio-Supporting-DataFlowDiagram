/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Data;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramFactory;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.ExternalActor;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Port;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.RefiningReference;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Store;

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
            DataFlowDiagramFactory theDataFlowDiagramFactory = (DataFlowDiagramFactory)EPackage.Registry.INSTANCE.getEFactory(DataFlowDiagramPackage.eNS_URI);
            if (theDataFlowDiagramFactory != null) {
                return theDataFlowDiagramFactory;
            }
        }
        catch (Exception exception) {
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
            case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM: return createDataFlowDiagram();
            case DataFlowDiagramPackage.EXTERNAL_ACTOR: return createExternalActor();
            case DataFlowDiagramPackage.STORE: return createStore();
            case DataFlowDiagramPackage.PROCESS: return createProcess();
            case DataFlowDiagramPackage.PORT: return createPort();
            case DataFlowDiagramPackage.REFINING_REFERENCE: return createRefiningReference();
            case DataFlowDiagramPackage.DATA_FLOW: return createDataFlow();
            case DataFlowDiagramPackage.DATA: return createData();
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
	public ExternalActor createExternalActor() {
        ExternalActorImpl externalActor = new ExternalActorImpl();
        return externalActor;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Store createStore() {
        StoreImpl store = new StoreImpl();
        return store;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process createProcess() {
        ProcessImpl process = new ProcessImpl();
        return process;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Port createPort() {
        PortImpl port = new PortImpl();
        return port;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RefiningReference createRefiningReference() {
        RefiningReferenceImpl refiningReference = new RefiningReferenceImpl();
        return refiningReference;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DataFlow createDataFlow() {
        DataFlowImpl dataFlow = new DataFlowImpl();
        return dataFlow;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Data createData() {
        DataImpl data = new DataImpl();
        return data;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DataFlowDiagramPackage getDataFlowDiagramPackage() {
        return (DataFlowDiagramPackage)getEPackage();
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
