import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter an integer.");
		int value = in.nextInt();

		if (value >= 0)
			System.out.println("Number of digits: " + (Integer.toString(value)).length());

		else {

			value = Math.abs(value);
			System.out.println("Number of digits: " + (Integer.toString(value)).length());
		}

	}

}
