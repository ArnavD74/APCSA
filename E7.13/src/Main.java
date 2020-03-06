import java.util.Random;

public class Main {

	public static void main(String[] args) {

		// int r;

		Random random = new Random();

		int[] array = new int[100];
		int[] graph = new int[10];

		for (int i = 0; i < array.length; i++) {

			int r = random.nextInt(100);
			array[i] = r;

			if (r >= 0 && r <= 10) {
				graph[0]++;
			}

			else if (r >= 11 && r <= 20) {
				graph[1]++;
			}

			else if (r >= 21 && r <= 30) {
				graph[2]++;
			}

			else if (r >= 31 && r <= 40) {
				graph[3]++;
			}

			else if (r >= 41 && r <= 50) {
				graph[4]++;
			}

			else if (r >= 51 && r <= 60) {
				graph[5]++;
			}

			else if (r >= 61 && r <= 70) {
				graph[6]++;
			}

			else if (r >= 71 && r <= 80) {
				graph[7]++;
			}

			else if (r >= 81 && r <= 90) {
				graph[8]++;
			}

			else if (r >= 91 && r <= 100) {
				graph[9]++;
			}

		}

		System.out.print("  0-10: ");
		for (int x = 0; x < graph[0] / 5; x++) {
			System.out.print(" *");
		}

		System.out.println();

		for (int i = 1; i < 9; i++) {

			System.out.print(" ");
			System.out.print((i * 10 + 1) + "-" + (10 * (i + 1)) + ": ");

			for (int x = 0; x < graph[i] / 5; x++) {
				System.out.print(" *");
			}

			System.out.println();

		}

		System.out.print(" 91-100:");
		for (int x = 0; x < graph[0] / 5; x++) {
			System.out.print(" *");
		}

	}

}