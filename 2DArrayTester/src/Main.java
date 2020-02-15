import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[][] array = new int[3][3];
		int rows = 3;
		int columns = 3;

		array[0][0] = 1;
		array[0][1] = 2;
		array[0][2] = 3;
		array[1][0] = 4;
		array[1][1] = 5;
		array[1][2] = 6;
		array[2][0] = 7;
		array[2][1] = 8;
		array[2][2] = 9;

		System.out.println(Arrays.deepToString(array));
		System.out.println();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + " ");
			}
			// System.out.println();
		}

	}

}
