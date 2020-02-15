import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter the number of rows/columns.");

		int size = in.nextInt();

		System.out.println("Please input all of the elements in order.");

		int[][] array = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				array[i][j] = in.nextInt();
			}
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		int checker = 0;

		for (int i = 0; i < size; i++) {

			checker += array[0][i];

		}

		int topRow = 0;
		int bottomRow = 0;
		int leftColumn = 0;
		int rightColumn = 0;
		int diagLR = 0;
		int diagRL = 0;

		for (int i = 0; i < size; i++) {
			topRow += array[0][i];
			bottomRow += array[size - 1][i];
			leftColumn += array[i][0];
			rightColumn += array[i][size - 1];
			diagLR += array[i][i];
			diagRL += array[size - 1 - i][size - 1 - i];
		}

		System.out.println("Checker: " + checker);
		System.out.println("Top row: " + topRow);
		System.out.println("Bottom row: " + bottomRow);
		System.out.println("Left column: " + leftColumn);
		System.out.println("Right column: " + rightColumn);
		System.out.println("Left-Right Diag: " + diagLR);
		System.out.println("Right-Left Diag: " + diagRL);

		if (checker == topRow && checker == bottomRow && checker == leftColumn && checker == rightColumn && checker == diagLR && checker == diagRL) {
			System.out.println("You have a perfect square.");
		}

		else
			System.out.println("Sorry, not a perfect square.");

				
	}

}
