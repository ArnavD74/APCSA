import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random r = new Random();
		int[] array1 = new int[10];

		for (int i = 0; i < 10; i++) {

			array1[i] = r.nextInt(100);

		}

		int[] arrayEvenIndex = new int[5];

		for (int i = 0; i < 5; i++) {

			arrayEvenIndex[i] = array1[(i * 2)];

		}

		System.out.println("Initial array: " + Arrays.toString(array1));
		System.out.println("Values at even indexes: " + Arrays.toString(arrayEvenIndex));

		int[] arrayEvens = new int[10];
		int count = -1;

		for (int i = 0; i < array1.length; i++) {

			if (array1[i] % 2 == 0) {
				count++;
				arrayEvens[count] = array1[i];

			}

		}

		System.out.println("All even values: " + Arrays.toString(arrayEvens));

		int[] reverse = new int[10];

		int counter = 10;
		for (int i = 0; i < 10; i++) {
			reverse[counter - 1] = array1[i];
			counter--;
		}

		System.out.println("Reverse: " + Arrays.toString(reverse));

		int[] firstLast = new int[2];

		firstLast[0] = array1[0];

		firstLast[1] = array1[array1.length - 1];

		System.out.println("First and last: " + Arrays.toString(firstLast));

	}

}
