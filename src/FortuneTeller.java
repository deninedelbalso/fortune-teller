
import java.util.Scanner;
NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Hello, what is your first name?");
		String firstName = input.nextLine();

		System.out.println("What is your last name?");
		String lastName = input.nextLine();

		System.out.println("How old are you?");
		int age = input.nextInt();

		System.out.println("What month were you born (number of month)?");
		int birthMonth = input.nextInt();

		System.out.println("What is your favorite ROYGBIV color (type HELP if you don't know what ROYGBIV stands for)?");
		String favColor = input.nextLine();

		if (favColor.equalsIgnoreCase("help")) {
			System.out.println("ROYGBIV = RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET");
			favColor = input.nextLine();
		}
		
		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();

		
		
		String retirementAge = "0";
		if (age % 2 == 0) {
			retirementAge = "20 years";
		} else {
			retirementAge = "5 years";
		}

		String vacationHome;
		if (siblings == 0) {
			vacationHome = "Miami, Florida";
		} else if (siblings == 1) {
			vacationHome = "Djibouti";
		} else if (siblings == 2) {
			vacationHome = "Greece";
		} else if (siblings == 3) {
			vacationHome = "Arizona";
		} else if (siblings == 4) {
			vacationHome = "Brazil";
		} else {
			vacationHome = "Cleveland, Ohio!";
		}

		String transportation;
		if (favColor.equalsIgnoreCase("red")) {
			transportation = "Jeep";
		} else if (favColor.equalsIgnoreCase("orange")) {
			transportation = "School Bus";
		} else if (favColor.equalsIgnoreCase("yellow")) {
			transportation = "RV";
		} else if (favColor.equalsIgnoreCase("green")) {
			transportation = "Harley";
		} else if (favColor.equalsIgnoreCase("blue")) {
			transportation = "BMW";
		} else if (favColor.equalsIgnoreCase("indigo")) {
			transportation = "Mini Cooper";
		} else {
			transportation = "tall cat";
		}

		String balance;
		if (birthMonth <= 4) {
			balance = "$100,000";
		} else if (birthMonth >= 5) {
			balance = "$5,500,000";
		} else if (birthMonth <= 12) {
			balance = "$1,000,000";
		} else {
			balance = "$0.00";
		}

		System.out.println(firstName + " " + lastName + "'s" + " fortune predicts...you will retire in " + retirementAge + " with " + currency.format(balance)
				+ " in the bank, a vacation home in " + vacationHome + ", and travel by " + transportation + "!");
	}
}
