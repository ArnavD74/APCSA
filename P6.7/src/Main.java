
//first i middle j last (String permuting)
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static String random(String input) {

		for (int i = 0; i < input.length(); i++) {

			// int x = ThreadLocalRandom.current().nextInt() * input.length() - 1;
			// int y = ThreadLocalRandom.current().nextInt() * input.length();

			int x = (int) (int) (Math.random() * input.length() - 1);
			int y = (int) (int) (Math.random() * input.length());

			if (y > x) {
				input = input.substring(0, x) + input.charAt(y) + input.substring(x + 1, y) + input.charAt(x) + input.substring(y + 1);
			}

			else
				i = i + 0;
		}
		return input;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter string.");

		System.out.println("New String: " + random(input.next()) + ".");
	}

}
