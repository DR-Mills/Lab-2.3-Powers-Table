/*
Taks: What will the application do?
* Prompt the user to enter an integer.
* Display a table of squares and cubes from 1 to the value entered.
* Ask if the user wants to continue.

Build Specifications
1. Assume that the user will enter valid data.
2. Only continue if the user agrees to.
*/

import java.util.Scanner;
import java.text.NumberFormat;

public class MultiplicationAndPowersTable {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		boolean keepGoing = true;

		System.out.println(
				"Why learn math when a computer can do it for you?!");

		while (keepGoing) {
			System.out.print("\nPlease enter an integer to see a squared and cubed table: ");
			int userInt = scnr.nextInt();

			System.out.printf("%n%-9s%-10s%-9s%n", "Number", "Squared", "Cubed");
			System.out.printf("%-9s%-10s%-9s%n", "======", "=======", "=====");

			for (int i = 1; i <= userInt; i++) {
				System.out.printf("%-9d%-10d%-9d%n", i, getSquared(i), getCubed(i));
			}
				System.out.print("\nContinue? (y/n): ");
				String userContinue = scnr.next();
				
				keepGoing = userContinue.equalsIgnoreCase("y");
		}

	}

	private static int getSquared(int i) {
		return i * i;
	}

	private static int getCubed(int i) {
		return i * i * i;
	}
}