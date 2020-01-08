import java.util.Arrays;
import java.util.Random;

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

		int temp = array[array.length - 1];

		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}
		array[0] = temp;

		int firstElement = array[0];
		int secondElement = array[1];

		array[0] = secondElement;
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

	public static void main(String[] args) {

		int[] originalArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Random r = new Random();

//		for (int i = 0; i < 10; i++) {
//			originalArray[i] = r.nextInt(100);
//		}

		System.out.println("Original array:      " + Arrays.toString(originalArray));
		
		System.out.println(Arrays.toString(originalArray));

		
		int[] swapArray = new int[10];
		swapArray = originalArray;
		System.out.println("Swap first and last: " + Arrays.toString(swapFirstAndLast(swapArray)));
		
		System.out.println(Arrays.toString(originalArray));

		
		int[] shiftArray = new int[10];
		shiftArray = originalArray;
		System.out.println("Shift right:         " + Arrays.toString(shiftRight(shiftArray)));
		
		System.out.println(Arrays.toString(originalArray));
		
		int[] evenZero = new int[10];
		evenZero = originalArray;
		System.out.println("Even to zero:        " + Arrays.toString(evenZero(evenZero)));

	}

}
