import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] array = new int[10];

		array[0] = 17;

		array[array.length - 1] = 29;

		for (int i = 1; i < array.length - 1; i++) {

			array[i] = -1;

		}

		for (int i = 0; i < array.length; i++) {

			array[i] += 1;

		}
		
		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);
		}

		for (int i = 0; i < array.length; i++) {

			System.out.print((i != 9) ? (array[i] + ", ") : (array[i]));
		}

		// System.out.println(Arrays.toString(array));
	}

}
