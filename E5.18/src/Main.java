import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string.");
		String value1 = in.nextLine();

		System.out.println("Please enter a string.");
		String value2 = in.nextLine();

		System.out.println("Please enter a string.");
		String value3 = in.nextLine();

		if (value1.compareTo(value2) < 0 && value1.compareTo(value3) < 0)
			System.out.println( value1 + " is alphabetically first");

		else if (value2.compareTo(value1) < 0 && value2.compareTo(value3) < 0)
			System.out.println( value2 + " is alphabetically first");
		
		else if (value3.compareTo(value1) < 0 && value1.compareTo(value2) < 0)
			System.out.println( value3 + " is alphabetically first");

		else
			System.out.println("Repeated values entered. Please try again.");

	}

}
