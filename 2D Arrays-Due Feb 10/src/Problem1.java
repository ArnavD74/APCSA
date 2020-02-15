import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		int[][] array = new int[3][3];

		Scanner in = new Scanner(System.in);

		int counter = 0;

		for (int row = 0; row < array.length; row++) {

			for (int i = 0; i < array.length; i++) {

				System.out.println("Enter next array element:");
				array[i][row] = in.nextInt();
				counter += array[i][row];

			}

		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println("Sum of all elements: " + counter);
	}
}
