/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramFactory;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.ExternalActor;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>External Actor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalActorTest extends ComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExternalActorTest.class);
	}

	/**
	 * Constructs a new External Actor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalActorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this External Actor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExternalActor getFixture() {
		return (ExternalActor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataFlowDiagramFactory.eINSTANCE.createExternalActor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ExternalActorTest
