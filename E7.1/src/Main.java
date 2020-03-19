import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] array1 = new int[10];

		for (int i = 0; i < 10; i++) {

			array1[i] = i + 1;

		}

		System.out.println(Arrays.toString(array1));

		int[] array2 = new int[11];

		for (int i = 0; i < 11; i++) {

			array2[i] = 2 * i;

		}

		System.out.println(Arrays.toString(array2));

	}

}
