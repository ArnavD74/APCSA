import java.util.Scanner;

public class Main {
	private static double total = 0;
	private static double largest = 0;
	static double smallest = 10 * Math.pow(10, 100);

	public static void add(double num) {
		total += num;
	}

	public static double getAverage(double num) {
		int count = 0;
		while (num > 0) {
			count++;
		}
		double average = total / count;
		return average;
	}

	public static double getSmallest(double num) {
		if (num <= smallest) {
			smallest = num;
		}
		return smallest;
	}

	public static double getLargest(double num) {
		if (num >= largest) {
			largest = num;
		}
		return largest;
	}

	public static double getRange() {
		double range = largest - smallest;
		return range;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String num = "0";

		System.out.println("Enter a set of floating numbers below, enter \"N\" when finished:");
		while (input.next() != "N") {
			num += input.nextDouble() + " ";
		}



//		System.out.println(getAverage(num));
//		System.out.println(getSmallest(num));
//		System.out.println(getLargest(num));
		System.out.println(getRange());
	}
}