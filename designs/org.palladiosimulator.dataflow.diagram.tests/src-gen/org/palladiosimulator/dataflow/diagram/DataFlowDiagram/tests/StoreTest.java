/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramFactory;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Store;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StoreTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StoreTest.class);
	}

	/**
	 * Constructs a new Store test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Store test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Store getFixture() {
		return (Store)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataFlowDiagramFactory.eINSTANCE.createStore());
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

} //StoreTest
