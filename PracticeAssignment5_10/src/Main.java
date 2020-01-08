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

		System.out.println("Please enter a number.");
		int value4 = in.nextInt();

		System.out.println("Your numbers: " + value1 + " " + value2 + " " + value3 + " " + value4);
		 
		if ((value1 == value2 && value3 == value4) || (value1 == value3 && value2 == value4)
				|| (value1 == value4 && value2 == value3))
			System.out.println("two pairs");
		else
			System.out.println("not two pairs");

	}

}
