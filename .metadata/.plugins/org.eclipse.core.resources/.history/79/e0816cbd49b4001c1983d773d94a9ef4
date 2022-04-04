import java.util.Scanner;

public class MultiplicationAndPowersTable {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean userContinue = true;

		System.out.println("Welcome to the handy-dandy multiplication and powers table. Why learn math when a computer can do it for you?!");

		while (userContinue) {
			System.out.print("Please enter an integer: ");
			int userInt = scnr.nextInt();

			System.out.printf("%n%-9s%-10s%-9s%n", "Number", "Squared", "Cubed");
			System.out.printf("%-9s%-10s%-9s%n", "======", "=======", "=====");

			for (int i = 1; i <= userInt; i++) {
				System.out.printf("%-9d%-10d%-9d%n", i, i * i, i * i * i);
			
				System.out.print("/nContinue? (y/n): ");
				userContinue = scnr.next();
			}
		}

	}
}