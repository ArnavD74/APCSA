import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	private static int[] swapFirstAndLast(int[] array) {

		int firstElement;
		int lastElement;

		firstElement = array[0];
		lastElement = array[array.length - 1];

		array[array.length - 1] = firstElement;
		array[0] = lastElement;

		return array;

	}

	private static int[] shiftRight(int[] array) {

		int lastElement = array[array.length - 1];
		int firstElement = array[0];

		array[0] = lastElement;

		for (int i = array.length - 2; i >= 0; i--) {

			array[i + 1] = array[i];
		}

		array[0] = lastElement;
		array[1] = firstElement;

		return array;

	}

	private static int[] evenZero(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] % 2 == 0) {
				array[i] = 0;
			}

		}

		return array;

	}

	private static int[] replaceWithNeighbors(int[] array) {

		int[] ret = new int[array.length];

		for (int i = 0; i < array.length; ++i) {

			if (i == 0 || i == array.length - 1) {

				ret[i] = array[i];

			}

			else {

				ret[i] = Math.max(array[i - 1], array[i + 1]);
			}
		}

		return ret;

	}

	public static int[] removeMiddleElement(int[] array) {

		int length = array.length;

		int middleArray[];
		if (length % 2 == 0) {

			middleArray = new int[length - 2];

			for (int i = 0; i < (middleArray.length / 2); i++) {
				middleArray[i] = array[i];
			}

			for (int i = (middleArray.length / 2); i < middleArray.length; i++) {
				middleArray[i] = array[i + 2];
			}

		}

		else {

			middleArray = new int[length - 1];

			for (int i = 0; i < (middleArray.length / 2); i++) {
				middleArray[i] = array[i];

			}

			for (int i = (middleArray.length / 2); i < middleArray.length; i++) {
				middleArray[i] = array[i + 1];
			}

		}

		return middleArray;
	}

	public static int[] evenToFront(int[] array) {
		int temp = 0;
		int loopC = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {

				for (int j = i; j > loopC; j--) {

					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}

				loopC++;
			}
		}
		return array;
	}

	public static int secondLargest(int[] array) {

		int largest = 0;
		int target = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] > largest) {
				target = largest;
				largest = array[i];

			}

			else if (array[i] > target) {
				target = array[i];

			}

			else
				target = 0;
		}

		return target;

	}

	public static boolean sorted(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}

		return true;

	}

	public static boolean duplicates(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] == array[i + 1]) {

				return true;
			}
		}

		return false;
	}

	public static boolean anyDuplicates(int[] array) {

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length; j++) {

				if (i != j && array[i] == array[j]) {

					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {

		Random r = new Random();
		Scanner in = new Scanner(System.in);

		System.out.println("Would you like to use simple or random values? Enter 0 for simple, 1 for random.");

		int response = in.nextInt();

		int[] originalArray = new int[11];

		if (response == 0) {
			for (int i = 0; i < 11; i++) {
				originalArray[i] = i;
			}
		}

		else if (response == 1) {
			for (int i = 0; i < 11; i++) {
				originalArray[i] = r.nextInt(100);
			}
		}

		else {
			System.out.println("Please enter 0 or 1 and re-run the program.");
			System.exit(0);
		}

		System.out.println("Original array:                         " + Arrays.toString(originalArray));

		int[] swapArray = originalArray.clone();
		System.out.println("Swap first and last:                    " + Arrays.toString(swapFirstAndLast(swapArray)));

		int[] shiftArray = originalArray.clone();
		System.out.println("Shift right:                            " + Arrays.toString(shiftRight(shiftArray)));

		int[] evenZero = originalArray.clone();
		System.out.println("Even to zero:                           " + Arrays.toString(evenZero(evenZero)));

		int[] neighbor = originalArray.clone();
		System.out.println("Neighbor replace:                       " + Arrays.toString(replaceWithNeighbors(neighbor)));

		int[] middleElement = originalArray.clone();
		System.out.println("Remove middle element:                  " + Arrays.toString(removeMiddleElement(middleElement)));

		int[] evenToFront = originalArray.clone();
		System.out.println("Move even to front:                     " + Arrays.toString(evenToFront(evenToFront)));

		int[] secondLargest = originalArray.clone();
		System.out.println("Second greatest value:                  " + (secondLargest(secondLargest)));

		int[] sorted = originalArray.clone();
		System.out.println("Is array sorted low-to-high:            " + (sorted(sorted)));

		int[] duplicates = originalArray.clone();
		System.out.println("Does array have neighbor duplicates:    " + (duplicates(duplicates)));

		int[] anyDuplicates = originalArray.clone();
		System.out.println("Does array have any duplicates:         " + (anyDuplicates(anyDuplicates)));

	}

}
