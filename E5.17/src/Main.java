import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a floating-point integer.");
		float value1 = in.nextFloat();

		System.out.println("Please enter a floating-point integer.");
		float value2 = in.nextFloat();

		System.out.println("Please enter a floating-point integer.");
		float value3 = in.nextFloat();

		if (value1 > value2 && value1 > value3)
			System.out.println( value1 + " is largest");

		else if (value2 > value1 && value2 > value3)
			System.out.println( value2 + " is largest");
		
		else if (value3 > value1 && value3 > value2)
			System.out.println( value3 + " is largest");

		else
			System.out.println("null");

	}

}
