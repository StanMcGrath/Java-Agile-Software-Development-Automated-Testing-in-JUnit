package ie.gmit.dip;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;

public class SurchargeGiverTestClass {

	public static InsuranceProgram insuranceProgram;

	// setUp method instantiates class once before all tests.
	@BeforeAll
	public static void setUpSurCharge() {
		insuranceProgram = new InsuranceProgram();
	}

	/*
	 * test methods below ensure that surCharge method produces the desired outcome
	 * in every possible case.
	 */
	@Test
	public void testSurcharge50() {
		String strActualResult = (insuranceProgram.surchargeGiver(50));
		System.out.println(strActualResult);
		assertEquals(strActualResult, ("Additional surcharge for accident: " + 50 + " \ntotal amount to pay: " + (550)));
	}

	@Test
	public void testSurcharge125() {
		String strActualResult = insuranceProgram.surchargeGiver(125);
		System.out.println(strActualResult);
		assertEquals(("Additional surcharge for accident: " + 125 + " \ntotal amount to pay: " + (625)),
				strActualResult);
	}

	@Test
	public void testSurcharge225() {
		String strActualResult = insuranceProgram.surchargeGiver(225);
		assertEquals(("Additional surcharge for accident: " + 225 + " \ntotal amount to pay: " + (725)),
				strActualResult);
	}

	@Test
	public void testSurcharge375() {
		String strActualResult = insuranceProgram.surchargeGiver(375);
		assertEquals(("Additional surcharge for accident: " + 375 + " \ntotal amount to pay: " + (875)),
				strActualResult);
	}

	@Test
	public void testSurcharge575() {
		String strActualResult = insuranceProgram.surchargeGiver(575);
		assertEquals(("Additional surcharge for accident: " + 575 + " \ntotal amount to pay: " + (1075)),
				strActualResult);
	}

}