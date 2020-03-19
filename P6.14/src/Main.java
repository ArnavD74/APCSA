import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int current = 0;

		while (current < 100) {

			System.out.print("Enter the number of people in your party entering. For a party to leave, use a negative number.");
			int party = in.nextInt();

			current = current + party;

			if (current > 100) {
				System.out.println("Your party passes the maximum occupancy.");
				current = current - party;
			}

			else
				System.out.println("There are now " + current + " occupants in the bar");

		}

		System.out.println("The bar is at maximum capacity");

	}
}