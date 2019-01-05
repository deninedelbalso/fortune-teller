
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Answer my questions and your fortune awaits.....");

		System.out.println("Please enter your first name:");
		String firstName = input.next();

		System.out.println("Please enter your last name:");
		String lastName = input.next();

		System.out.println("How old are you?");
		int age = input.nextInt();

		System.out.println("Please enter your birthday month as a number");
		int birthdayMonth = input.nextInt();

		System.out.println("What is your favorite ROYGBIV color?");
		System.out.println("Enter HELP if you need the ROYGBIV colors.");
		String favoriteColor = input.next();

		if (favoriteColor.equalsIgnoreCase("help")) {
			System.out.println("R = Red, O = Orange, Y = Yellow, G = Green, B = Blue, I = Indigo, V = Violet");
			favoriteColor = input.next();
		}

		System.out.println("Please enter how many siblings you have:");
		int siblings = input.nextInt();

		// Value of conditions

		String firstNameCap = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
		String lastNameCap = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

		int retireYears = 0;
		if ((age % 2) == 0) {
			retireYears = 25;
		} else {
			retireYears = 2;
		}

		String vacaHome = "determineHome";
		while (siblings < 0) {
			System.out.println("Oops. The number of siblings must be a positive number. Try again.");
			siblings = input.nextInt();
		}
		if (siblings == 0) {
			vacaHome = "Akron, Ohio";
		} else if (siblings == 1) {
			vacaHome = "Kelly's Island";
		} else if (siblings == 2) {
			vacaHome = "Outer Banks";
		} else if (siblings == 3) {
			vacaHome = "Key West";
		} else {
			vacaHome = "Hawaii";
		}

		String trans = "determineTrans";

		if (favColor.equalsIgnoreCase("red")) {
			trans = "horse & buggy";
		} else if (favColor.equalsIgnoreCase("orange")) {
			trans = "space ship";
		} else if (favColor.equalsIgnoreCase("yellow")) {
			trans = "canoe";
		} else if (favColor.equalsIgnoreCase("green")) {
			trans = "submarine";
		} else if (favColor.equalsIgnoreCase("blue")) {
			trans = "sled dog";
		} else if (favColor.equalsIgnoreCase("indigo")) {
			trans = "dolphin";
		} else if (favColor.equalsIgnoreCase("violet")) {
			trans = "Mercedes";
		} else {
			trans = "walking all the way";
		}

		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
		double bankBal = 0.00;
		if (birthMonth <= 4) {
			bankBal = 10000.00;
		} else if (birthMonth <= 8) {
			bankBal = 99.99;
		} else if (birthMonth <= 12) {
			bankBal = 1000000.00;
		} else {
			bankBal = 0.00;
		}

		System.out.println("Here is your fortune:");
		System.out.println(firstNameCap + " " + lastNameCap + " will retire in " + retireYears + " years, with " + currency.format(bankBal) + " in the bank, a vacation home in " + vacaHome
				+ " and travel by " + trans + "!");
		input.close();
	}

