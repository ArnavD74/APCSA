import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] array = new int[10];

		int total = 0;

		System.out.print("Enter exactly 10 integers: ");

		for (int i = 0; i < array.length - 1; i++) {

			array[i] = in.nextInt();

			if (i % 2 != 0) {

				array[i] = -array[i];

			}

			total = total + array[i];
		}

		System.out.println("Total: " + total);

	}
}
