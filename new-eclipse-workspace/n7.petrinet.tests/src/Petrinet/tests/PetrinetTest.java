/**
 */
package petrinet.tests;

import petrinet.petrinet;
import petrinet.n7.petrinetFactory;
import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>petrinet</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetrinetTest extends TestCase {

	/**
	 * The fixture for this petrinet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected petrinet fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PetrinetTest.class);
	}

	/**
	 * Constructs a new petrinet test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this petrinet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(petrinet fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this petrinet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected petrinet getFixture() {
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
		setFixture(petrinetFactory.eINSTANCE.createPetrinet());
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

} //PetrinetTest
