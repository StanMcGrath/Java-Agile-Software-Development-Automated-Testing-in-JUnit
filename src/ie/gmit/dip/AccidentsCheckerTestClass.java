package ie.gmit.dip;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AccidentsCheckerTestClass {

	public static InsuranceProgram insuranceProgram;

	// setUp method instantiates class once before all tests.
	@BeforeAll
	public static void setUpAccidentsChecker() {
		insuranceProgram = new InsuranceProgram();
	}
	
	/*
	 * parameterized test method below ensures that accidentsChecker method produces
	 * desired results in every possible case. Not included in test suite - @Parameterized
	 * test not recognized as a runnable method. See README. Can be launched manually, and 
	 * passes.
	 */
	
	@ParameterizedTest
	@Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
	@CsvSource({ "1, 50", "2, 125", "3, 225", "4, 375", "5, 575" })
	public void parameterizedTest(int accidents, int surcharge) {
		String strActualResult = insuranceProgram.accidentsChecker(accidents);
		assertEquals(
				("Additional surcharge for accident: " + surcharge + " \ntotal amount to pay: " + (500 + surcharge)),
				strActualResult);
	}

}
