package ie.gmit.dip;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InsuranceProgram {

	static Scanner input = new Scanner(System.in);
	static int basicInsurance = 500;
	static int surcharge = 100; // under 25 years
	static int age;
	static int accidents;
	static Boolean bool = true;

	// main method:

	public static void main(String[] args) {

		enterAge();

	}

	// enterAgeMethod:

	public static int enterAge() throws InputMismatchException {
		while (bool == true) {

			System.out.print("Enter your age: ");
			try {
				age = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Please try again with a valid number (integer).");
				bool = false;
				throw new InputMismatchException();
			}

			if (age < 0) {
				System.out.println("We don't offer insurance to persons under 0 years of age! Sorry about that!");
			}

			if (age >= 0 && age < 25) {
				belowAge();
				accidentsInput();
			}

			if (age >= 25) {
				aboveAge();
				accidentsInput();
			}

			input.close();
			break;
		}

		return age;

	}

	// below age method:

	public static int belowAge() {
		basicInsurance += surcharge;
		System.out.println("Additional surcharge " + surcharge);
		System.out.print("\nHow many accidents did you have? ");
		return basicInsurance;

	}

	// above age method:

	public static String aboveAge() {
		String a = "No additional surcharge";
		System.out.println(a);
		String b = "\nHow many accidents did you have? ";
		System.out.print(b);
		return a + b;
	}

	// accidents input method

	public static int accidentsInput() throws InputMismatchException {

		while (bool == true) {
			try {
				accidents = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Please try again with a valid number (integer).");
				bool = false;
				throw new InputMismatchException();

			}

			accidentsChecker(accidents);
			accidents6OrGreater();
			break;
		}
		return accidents;

	}

	// accidents 6 or greater method

	public static String accidents6OrGreater() {
		String noInsurance = "No Insurance";
		if (accidents >= 6)
			System.out.println(noInsurance);
		bool = false;
		return noInsurance;
	}

	// accidents checker method

	public static String accidentsChecker(int accidents) {
		String caseString = null;

		if (accidents < 0) {
			System.out.println("You silly guy! You can not have less than 0 accidents!");
			System.out.println("Please try again with a valid number of accidents.");
			bool = false;
		}

		if (accidents == 0) {
			caseString = "No surcharge";
			System.out.println(caseString);
			System.out.println("Total amount to pay: " + basicInsurance);
			bool = false;
		}
		if (accidents == 1) {
			caseString = surchargeGiver(50);
			System.out.println(caseString);
			bool = false;
		}
		if (accidents == 2) {
			caseString = surchargeGiver(125);
			System.out.println(caseString);
			bool = false;
		}
		if (accidents == 3) {
			caseString = surchargeGiver(225);
			System.out.println(caseString);
			bool = false;
		}
		if (accidents == 4) {
			caseString = surchargeGiver(375);
			System.out.println(caseString);
			bool = false;
		}
		if (accidents == 5) {
			caseString = surchargeGiver(575);
			System.out.println(caseString);
			bool = false;
		}

		return caseString;
	}

	// surcharge giver method

	public static String surchargeGiver(int charge) {

		return ("Additional surcharge for accident: " + charge + " \ntotal amount to pay: "
				+ (basicInsurance + charge));
	}

}