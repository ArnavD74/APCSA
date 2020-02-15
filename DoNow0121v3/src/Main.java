import java.util.Scanner;

public class Main {

	private static int[] elevation = { 100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};

	public static boolean isLevel(int min, int max) {

		for (int i = 0; i < elevation.length - 1; i++) {

			if (elevation[i] > max)
				max = elevation[i];

			else if (elevation[i] < min)
				min = elevation[i];
		}

		return (max - min <= 10);
	}

	public static boolean isDifficult() { // anything greater than 30 is difficult

		int counter = 0;

		for (int i = 0; i < elevation.length - 1; i++) {

			if (Math.abs(elevation[i] - elevation[i + 1]) >= 30)
				counter++;
		}

		if (counter >= 3)
			return true;

		else
			return false;
	}

	public static void main(String[] args) {

		if (isLevel(7, 10) == true) {
			System.out.println("Trail is level");
		}

		else if (isLevel(7, 10) == false) {
			System.out.println("Trail is not level");
		}

		else
			System.out.println("Level error");

		if (isDifficult() == true) {
			System.out.println("Trail is difficult");
		}

		else if (isDifficult() == false) {
			System.out.println("Trail is not difficult");
		}

		else
			System.out.println("Difficult error");
	}
}
