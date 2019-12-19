/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Data;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataTest.class);
	}

	/**
	 * Constructs a new Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Data getFixture() {
		return (Data)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataFlowDiagramFactory.eINSTANCE.createData());
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

} //DataTest
