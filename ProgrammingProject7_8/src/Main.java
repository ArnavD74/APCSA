import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[][] array = { { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
				{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
				{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
				{ 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 }, { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
				{ 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };

		int rows = array.length;
		int columns = array[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Would you like to buy a seat? (S) or a price (P)?");

		Scanner in = new Scanner(System.in);

		int userChoice = 0;

		if (in.nextLine().equals("S")) {

			System.out.println("What row is your seat in? Your bounds are: " + 0 + " to " + array.length);
			int userRow = in.nextInt();
			System.out.println("What column is your seat in?  Your bounds are: " + 0 + " to " + array[0].length);
			int userColumn = in.nextInt();

			array[userRow][userColumn] = 0;

			System.out.println("Seat purchased.");

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}

		}

		else if (in.nextLine().equals("P")) {

			System.out.println("What price?");

			int userPrice = in.nextInt();

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {

					if (array[i][j] == userPrice) {
						array[i][j] = 00;
						System.out.println("Seat Purchased");
						int j2 = j + 1;
						int i2 = i + 1;
						System.out.println("Your seat is at: (" + j2 + ", " + i2 + ").");
						for (int k = 0; k < rows; k++) {
							for (int l = 0; l < columns; l++) {
								System.out.print(array[k][l] + " ");
							}
							System.out.println();
						}
						System.exit(0);
					}

					else
						System.out.println("Finding seat ...");
				}
			}

			System.out.println("Sorry, no seats found at that price.");

		}

		else
			System.out.println("Wrong input");

	}

}
