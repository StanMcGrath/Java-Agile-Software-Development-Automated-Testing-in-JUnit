package ie.gmit.dip;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;

public class BelowAgeTestClass {

	public static InsuranceProgram insuranceProgram;

	// setUp method instantiates class once before all tests.
	@BeforeAll
	public static void setUpBelowAge() {
		insuranceProgram = new InsuranceProgram();
	}

	// test method below ensures the logic of belowAge method produces the desired
	// result.
	@Test
	public void testBelowAge() {
		assertEquals(600, insuranceProgram.belowAge());
	}

}
