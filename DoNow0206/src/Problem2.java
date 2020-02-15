import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
//		int[][] array = new int[5][5];
		int[][] array = { { 16, 3, 2, 13 }, { 5, 10, 11, 8 }, { 9, 6, 7, 12 }, { 4, 15, 14, 1 } };
		int sum1 = 0;

//		for (int row = 0; row < array.length; row++) {
//			for (int col = 0; col < array[row].length; col++) {
//				System.out.println("enter the elements for the Matrix");
//				array[row][col] = in.nextInt();
//			}
//			System.out.println();
//		}

		int checker = (array[0][0] + array[0][1] + array[0][2] + array[0][3]);
		System.out.println(checker);
//		System.out.println(Arrays.deepToString(array));
//		System.out.println();

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[0].length; j++) {
				sum1 = 0;
				sum1 += array[i][j];
			}
		}

		System.out.println(sum1);

//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < columns; j++) {
//				System.out.print(array[i][j] + " ");
//			}
//			// System.out.println();
//		}
	}

}
