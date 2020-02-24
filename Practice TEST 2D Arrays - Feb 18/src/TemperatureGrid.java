
public class TemperatureGrid {

	private static int ROWS = 5;
	private static int COLUMNS = 6;
	private static double[][] temps = new double[ROWS][COLUMNS];

	private static double computeTemp(int row, int column) {

		double sum = 0.0;

		double up = 0;
		double down = 0;
		double left = 0;
		double right = 0;

		if (row == 0 || column == 0 || row == ROWS || column == COLUMNS) {

			return temps[row][column];
		}

		else {

			if (row > 0) {
				up = temps[row - 1][column];
			}

			else
				up = 0;

			if (row < ROWS) {
				down = temps[row + 1][column];
			}

			else
				down = 0;

			if (column > 0) {
				left = temps[row][column - 1];
			}

			else
				left = 0;

			if (column < COLUMNS) {
				right = temps[row][column + 1];
			}

			else
				right = 0;

			sum = (up + down + left + right) / 4;
			return sum;

		}

	}

	//
	public static boolean updateAllTemps(double tolerance) {

		double[][] newTemps = new double[ROWS][COLUMNS];

		for (int i = 0; i < ROWS - 1; i++) {
			for (int j = 0; j < COLUMNS - 1; j++) {

				newTemps[i][j] = computeTemp(i, j);

			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(newTemps[i][j] + " ");
			}

			System.out.println();
		}
		
		int count = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {

				if (tolerance <= Math.abs(temps[i][j] - newTemps[i][j])) {

					count++;

				}

			}
		}

		if (count <= 0) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {

		temps[0][0] = 95.5;
		temps[0][1] = 100.0;
		temps[0][2] = 100.0;
		temps[0][3] = 100.0;
		temps[0][4] = 100.0;
		temps[0][5] = 110.3;

		temps[1][0] = 0.0;
		temps[1][1] = 50.0;
		temps[1][2] = 50.0;
		temps[1][3] = 50.0;
		temps[1][4] = 50.0;
		temps[1][5] = 0.0;

		temps[2][0] = 0.0;
		temps[2][1] = 40.0;
		temps[2][2] = 40.0;
		temps[2][3] = 40.0;
		temps[2][4] = 40.0;
		temps[2][5] = 0.0;

		temps[3][0] = 0.0;
		temps[3][1] = 20.0;
		temps[3][2] = 20.0;
		temps[3][3] = 20.0;
		temps[3][4] = 20.0;
		temps[3][5] = 0.0;

		temps[4][0] = 0.0;
		temps[4][1] = 0.0;
		temps[4][2] = 0.0;
		temps[4][3] = 0.0;
		temps[4][4] = 0.0;
		temps[4][5] = 0.0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(temps[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println(computeTemp(2, 3));
		System.out.println(computeTemp(1, 1));
		System.out.println(computeTemp(0, 2));
		System.out.println(computeTemp(1, 3));
		System.out.println();

		System.out.println(updateAllTemps(0.01));

	}

}
