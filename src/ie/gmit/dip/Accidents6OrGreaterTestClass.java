package ie.gmit.dip;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;


public class Accidents6OrGreaterTestClass {

	public static InsuranceProgram insuranceProgram;

	// setUp method instantiates class before each test.
	@BeforeEach
	public void setUp6OrGreater() {
		insuranceProgram = new InsuranceProgram();
	}

	/*
	 * test method below ensures that the output of accidents6OrGreater function is
	 * correct.
	 */
	@Test
	public void test6OrGreater() {
		assertEquals(insuranceProgram.accidents6OrGreater(), "No Insurance");
	}

}