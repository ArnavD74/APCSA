import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a floating-point integer.");
		float value1 = in.nextFloat();

		System.out.println("Please enter a floating-point integer.");
		float value2 = in.nextFloat();

		value1 = (Math.round(value1 * 1000))/1000; //converts float to integer
		value2 = (Math.round(value2 * 1000))/1000;

		if (value1 == value2)
			System.out.println("They are the same up to two decimal places.");
		else
			System.out.println("They are different.");
	}

}
