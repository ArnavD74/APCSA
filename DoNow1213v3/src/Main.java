import java.util.Scanner;

public class Main {

	public static int last2(String input) {

		String last = input.substring(input.length() - 2, input.length());
		int counter = 0;

		String newInput = input.substring(0, input.length() - 2);

		for (int i = 0; i < input.length() - 1; i++) {

			if (input.substring(i, i + 2).equals(last)) {
				counter++;
			}

		}

		return counter - 1;

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		String input = in.nextLine();

		System.out.println("Repeats: " + Main.last2(input));

	}

}
