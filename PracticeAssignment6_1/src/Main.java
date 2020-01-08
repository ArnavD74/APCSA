
public class Main {

	public static void main(String[] args) {

		int x = 0;

		for (int i = 2; i <= 100; i++) {
			i++;
			x = x + i;

		}

		// System.out.println(x);

		int counterb = 0;

		for (int y = 1; y <= 100; y++) {

			counterb = (int) (counterb + Math.pow(y, 2));

		}

		int counterc = 0;

		for (int z = 0; z <= 20; z++) {

			counterc = (int) (counterc + Math.pow(2, z));
		}

		int counterd = 0;
		int f = 22; // user input A
		int g = 53; // user input B
		for (int w = f; w <= g; w++)

			if (w % 2 != 0) {
				counterd = counterd + w;
			}

			else
				counterd = counterd + 0;

		int countere = 0;
		String h = "12345"; // user input A

		for (int r = 0; r <= h.length(); r++) {

			if (Integer.parseInt(h.substring(r, r + 1)) % 2 != 0) {
				countere = countere + Integer.parseInt(h.substring(r, r + 1));
			}

		}

	}

}
