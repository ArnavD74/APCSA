import java.util.Arrays;
import java.util.Random;

public class Main {

	static int counter(int array[]) {

		int counter = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] == 2) {
				counter++;
			}

		}

		return counter;

	}

	public static void main(String[] args) {

		int[] array = new int[52];
		Arrays.fill(array, 0);

		//Random r = new Random();

		for (int i = 0; i < 51; i++) {
			array[(int) (50 * Math.random())]++;
		}

		System.out.println(Arrays.toString(array));

		for (int element = 0; element < 51; element++) {
			if (array[element] > 0) {
				System.out.println("Number of occurrences of " + element + ": " + array[element]);
			}
		}

		System.out.println("Repeated elements: " + counter(array));

	}

}