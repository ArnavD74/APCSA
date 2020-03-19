import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter 10 numbers");

		int[] array1 = new int[10];

		for (int i = 0; i < 10; i++) {

			array1[i] = in.nextInt();

		}

		System.out.println(Arrays.toString(array1));

	}

}
