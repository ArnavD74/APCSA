import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void changeIt(int[] arr, int index, int newValue) {
		arr[index] += newValue;
	}

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int[] myArray = new int[4];
		changeIt(myArray, 1, 5);
		
		System.out.println(Arrays.toString(myArray));
		
	}
}
