/**
 */
package DataDictionary.tests;

import DataDictionary.DataDictionary;
import DataDictionary.DataDictionaryFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Dictionary</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataDictionaryTest extends TestCase {

	/**
	 * The fixture for this Data Dictionary test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataDictionary fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataDictionaryTest.class);
	}

	/**
	 * Constructs a new Data Dictionary test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDictionaryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Data Dictionary test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DataDictionary fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Data Dictionary test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataDictionary getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataDictionaryFactory.eINSTANCE.createDataDictionary());
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

} //DataDictionaryTest
