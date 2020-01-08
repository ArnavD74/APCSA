import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int value1 = in.nextInt();

		System.out.println("Please enter a number.");
		int value2 = in.nextInt();

		System.out.println("Please enter a number.");
		int value3 = in.nextInt();

		if (value1 + 1 == value2 && value2 + 1 == value3)
			System.out.println("in order");

		else if (value1 - 1 == value2 && value2 - 1 == value3 && value3 + value2 == value1)
			System.out.println("all different");

		else
			System.out.println("neither");

	}

}
