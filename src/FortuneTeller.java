
import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Hello, what is your first name?");
		String firstName = input.next();

		System.out.println("What is your last name?");
		String lastName = input.next();

		System.out.println("How old are you?");
		int age = input.nextInt();

		System.out.println("What month were you born (number of month)?");
		int birthMonth = input.nextInt();

		input.nextLine();

		System.out.println("What is your favorite ROYGBIV color? (If you do not know what ROYGBIV means, type HELP.)");

		String favColor = input.nextLine();

		if (favColor.equalsIgnoreCase("help")) {
			System.out.println("You can pick from the colors: RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET");
			favColor = input.nextLine();

		}
		System.out.println("Awesome! How many siblings do you have?");
		int siblings = input.nextInt();

		String retirementAge = "0";

		if (age % 2 == 0) {
			retirementAge = "20 years";

		} else {
			retirementAge = "5 years";
		}

		String vacationHome;

		if (siblings == 0) {
			vacationHome = "Naples, Florida";

		} else if (siblings == 1) {
			vacationHome = "Cancun, Mexico";

		} else if (siblings == 2) {
			vacationHome = "Pierre, South Dakota";

		} else if (siblings == 3) {
			vacationHome = "Paris, France";

		} else if (siblings > 3) {
			vacationHome = "Miami, Florida";

		} else {
			vacationHome = "hmmm...check how many siblings you have again!";
		}

		String transportation;

		if (favColor.equalsIgnoreCase("red")) {
			transportation = "Tesla";

		} else if (favColor.equalsIgnoreCase("orange")) {
			transportation = "walking";

		} else if (favColor.equalsIgnoreCase("yellow")) {
			transportation = "mini-van";

		} else if (favColor.equalsIgnoreCase("green")) {
			transportation = "bicycle";

		} else if (favColor.equalsIgnoreCase("blue")) {
			transportation = "motorcycle";

		} else if (favColor.equalsIgnoreCase("indigo")) {
			transportation = "public bus";

		} else {
			transportation = "horse";
		}

		String balance;

		if (birthMonth >= 1 && birthMonth <= 4) {
			balance = "$300,000";

		} else if (birthMonth >= 5 && birthMonth <= 8) {
			balance = "$2,500,000";

		} else if (birthMonth >= 9 && birthMonth <= 12) {
			balance = "$42.00";

		} else {
			balance = "$0.00";

		}

		System.out.println(firstName + " " + lastName + "," + " your fortune tells me..." + "you will retire in " + retirementAge + " with " + balance
				+ " in the bank, a vacation home in " + vacationHome + ", and travel by " + transportation + "!");
	}
}
