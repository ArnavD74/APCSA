import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter an integer");
		int input = in.nextInt();

		int number = input % 2;

		while (input != 0) {
			System.out.println(number);
			input = input / 2;
			number = input % 2;

		}

	}

}
