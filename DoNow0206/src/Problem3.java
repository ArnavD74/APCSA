import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {

		int[][] array1 = { { 1, 2 }, { 3, 4 } };
		int[][] array2 = { { 5, 6 }, { 7, 8 } };

		int rows = 2;
		int columns = 2;

		System.out.println(Arrays.deepToString(array1));
		System.out.println("Added to ");
		System.out.println(Arrays.deepToString(array2));

		System.out.println();

		int[][] sum = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sum[i][j] = array1[i][j] + array2[i][j];
			}
		}

//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < columns; j++) {
//				System.out.print(sum[i][j] + " ");
//			}
//		}
		System.out.println("Equals: ");
		System.out.println(Arrays.deepToString(sum));

	}

}
