import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string.");
		String value = in.nextLine();

		char startpos = value.charAt(0);

		char endpos = value.charAt(value.length() - 1);

		if (startpos == endpos) {
			System.out.println("same");
		}

		else
			System.out.println("different");

	}

}
