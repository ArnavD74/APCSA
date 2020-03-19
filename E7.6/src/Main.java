import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random r = new Random();
		int[] array = new int[10];

		System.out.print("Array: ");

		for (int i = 0; i < 10; i++) {

			array[i] = r.nextInt(100);
			System.out.print(array[i] + ", ");

		}

		System.out.println();
		System.out.print("Reversed: ");

		for (int i = 9; i > -1; i--) {
			System.out.print(array[i] + ", ");
		}
	}
}
