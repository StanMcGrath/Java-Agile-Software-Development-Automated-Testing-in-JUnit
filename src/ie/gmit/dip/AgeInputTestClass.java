package ie.gmit.dip;

import static org.junit.Assert.assertThrows;
import java.util.InputMismatchException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;

public class AgeInputTestClass {

	public static InsuranceProgram insuranceProgram;
	public int ageTest;

	// setUp method instantiates class once before all tests.
	@BeforeAll
	public static void setUpAgeInput() {
		insuranceProgram = new InsuranceProgram();
	}

	// ensures scanner is closed after tests.
	@AfterAll
	public static void closeScanner() {
		insuranceProgram.input.close();
	}

	/*
	 * the below exception test makes sure that when a non-integer value is input to
	 * the age variable, an exception is thrown. Follow [AGE INPUT TEST] prompts in
	 * console to test. Not included in test suite- TestRunner fails to throw
	 * the desired errors. See README. Can be run manually, and passes.
	 */
	@Test
	public void exceptionTestAgeInput() {

		assertThrows(InputMismatchException.class, () -> {
			System.out.println("[AGE INPUT TEST]: Enter an age as a non-integer value (i.e. 'twenty')");
			ageTest = insuranceProgram.enterAge();

		});

	}

}
