import java.util.Arrays;

public class Problem1 {

	public static void main(String[] args) {

		int[][] array = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int rows = 5;
		int columns = 5;

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
