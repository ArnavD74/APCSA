import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {

		int[][] array1 = { { 2, 1 }, { 3, 5 } };
		int[][] array2 = { { -2, 3 }, { 4, -1 } };
		int a1l = array1.length;
		int a2l = array2[0].length;

		System.out.println(Arrays.deepToString(array1));
		System.out.println("Multiplied by ");
		System.out.println(Arrays.deepToString(array2));

		System.out.println();

		int[][] product = new int[a1l][a2l];

		for (int i = 0; i < a1l; i++) {

			for (int j = 0; j < a2l; j++) {

				for (int k = 0; k < a1l; k++) {

					product[i][j] = product[i][j] + array1[i][k] * array2[k][j];
				}
			}
		}

//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < columns; j++) {
//				System.out.print(sum[i][j] + " ");
//			}
//		}
		System.out.println("Equals: ");
		System.out.println(Arrays.deepToString(product));

	}

}
