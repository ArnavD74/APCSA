import java.util.Scanner;

public class Main {

	public static String altPairs(String input) {
		String newInput = "";
		for (int i = 0; i <= input.length(); i = i + 4) {

			newInput = newInput + input.charAt(i);

			if (i + 1 <= input.length())
				newInput = newInput + input.charAt(i + 1);

		}

		return newInput;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		String input = in.nextLine();

		System.out.println(altPairs(input));
	}
}
