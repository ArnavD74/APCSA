import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a set of floating-point values, and enter \"Q\" when you are complete.");


		double smallest = 99999999;
		double largest = -99999999;
		double input;
		double total = 0;
		int counter = 0;

		do {
			input = in.nextDouble();

			if (input < smallest)
				smallest = input;

			if (input > largest)
				largest = input;
			
			total = total + input;
			counter++;
			

		} while (in.hasNextDouble());
		
		double average = total / counter;
		double range = largest - smallest;
		
		System.out.println("Smallest: " + smallest);
		System.out.println("Largest: " + largest);
		System.out.println("Average: " + average);
		System.out.println("Range: " + range);


	}
}