/**
 */
package org.palladiosimulator.dataflow.dictionary.DataDictionary.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionaryFactory;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.Entry;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntryTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntryTest.class);
	}

	/**
	 * Constructs a new Entry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Entry getFixture() {
		return (Entry)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataDictionaryFactory.eINSTANCE.createEntry());
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

} //EntryTest
