/**
 */
package petrinet.tests;

import petrinet.PetrinetElement;
import petrinet.n7.petrinetFactory;
import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetrinetElementTest extends TestCase {

	/**
	 * The fixture for this petrinet Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetrinetElement fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PetrinetElementTest.class);
	}

	/**
	 * Constructs a new petrinet Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetElementTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this petrinet Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PetrinetElement fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this petrinet Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetrinetElement getFixture() {
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
		setFixture(petrinetFactory.eINSTANCE.createPetrinetElement());
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

} //PetrinetElementTest
