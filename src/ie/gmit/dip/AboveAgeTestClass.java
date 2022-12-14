package ie.gmit.dip;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;

public class AboveAgeTestClass {

	public static InsuranceProgram insuranceProgram;

	// setUp method instantiates class before each test.
	@BeforeEach
	public void SetUp() {
		insuranceProgram = new InsuranceProgram();
	}

	// test method below ensures that the output of aboveAge method is correct.
	@Test
	public void testAboveAge() {
		assertEquals(InsuranceProgram.aboveAge(), "No additional surcharge" + "\nHow many accidents did you have? ");
	}

}
