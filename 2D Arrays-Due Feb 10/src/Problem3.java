import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner in = new Scanner(System.in);

		System.out.println("How many rows would you like the array to be?");

		int rows = in.nextInt();

		System.out.println("How many columns would you like the array to be?");

		int columns = in.nextInt();

		int[][] array = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = r.nextInt(10);
			}
		}

		for (int i = 0; i < rows; i++) {
			array[i][0] = -1;
			array[i][columns - 1] = -1;
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
