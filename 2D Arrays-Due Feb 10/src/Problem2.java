import java.util.Scanner;

class Problem2 {
	public static void main(String[] args) {

		final int rows = 10;
		final int columns = 10;

		int[][] array = new int[rows][columns];

		for (int a = 0; a < rows; a++) {
			for (int b = 0; b < columns; b++) {
				if ((a + b) % 2 == 0) {
					array[a][b] = 1;
				} else {
					array[a][b] = 0;
				}
			}
		}

		for (int c = 0; c < rows; c++) {
			array[0][c] = 0;
			array[columns - 1][c] = 0;
		}

		int counter = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				counter += array[i][j];
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Sum: " + counter);
	}
}