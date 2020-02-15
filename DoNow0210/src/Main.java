import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static int findLargest(int[][] array) {

		int currentLargest = 0;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 2; j++) {

				if (array[i][j] > currentLargest) {
					currentLargest = array[i][j];
				}
			}
		}

		return currentLargest;
	}

	public static int findSum(int[][] array) {

		int sum = 0;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 2; j++) {

				sum += array[i][j];
			}
		}

		return sum;

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[][] array = new int[3][2];

		int rows = 3;
		int columns = 2;

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {

				System.out.println("enter next element");
				array[i][j] = in.nextInt();
			}

		}

		System.out.print("Your array: ");
		System.out.println(Arrays.deepToString(array));

		findLargest(array);

		System.out.println("Largest element: " + findLargest(array));
		System.out.println("Sum: " + findSum(array));

	}

}
