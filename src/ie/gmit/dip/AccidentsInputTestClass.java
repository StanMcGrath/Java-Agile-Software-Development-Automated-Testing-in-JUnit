package ie.gmit.dip;

import static org.junit.Assert.assertThrows;
import java.util.InputMismatchException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
import org.junit.Test;

public class AccidentsInputTestClass {

	public static InsuranceProgram insuranceProgram;
	public int accidentsTest;

	// setUp method instantiates class before each test.
	@BeforeEach
	public void setUpAccidentsInput() {
		insuranceProgram = new InsuranceProgram();
	}

	// ensures scanner is closed after each test.
	@AfterEach
	public void closeScanner() {
		insuranceProgram.input.close();
	}

	/*
	 * the below exception test makes sure that when a non-integer value is input to
	 * the accidents variable, an exception is thrown. Follow [ACCIDENTS INPUT TEST]
	 * prompts in console to test. Not included in test suite- TestRunner fails to throw
	 * the desired errors. See README. Can be run manually, and passes.
	 */

	// @Disabled
	@Test
	public void exceptionTestAccidentsInput() {

		assertThrows(InputMismatchException.class, () -> {
			System.out.println("[ACCIDENTS INPUT TEST]: Enter number of accidents as a non-integer value (i.e. 'five')");
			accidentsTest = insuranceProgram.accidentsInput();
		});

	}

}
