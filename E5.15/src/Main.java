import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Please enter the price of the item.");

		Scanner in = new Scanner(System.in);
		Double price = in.nextDouble();
		double tax = 0;
		String ptax = null;

		if (0 <= price && price <= 50000) {

			tax = price * 0.01;
			price = price + tax;
			ptax = "1%";

		}

		else if (50000 < price && price <= 75000) {

			tax = price * 0.02;
			price = price + tax;
			ptax = "2%";

		}

		else if (75000 < price && price <= 100000) {

			tax = price * 0.03;
			price = price + tax;
			ptax = "3%";

		}

		else if (100000 < price && price <= 250000) {

			tax = price * 0.04;
			price = price + tax;
			ptax = "4%";

		}

		else if (250000 < price && price <= 500000) {

			tax = price * 0.05;
			price = price + tax;
			ptax = "5%";

		}

		else {

			tax = price * 0.06;
			price = price + tax;
			ptax = "6%";

		}
		
		System.out.println("Your tax is: " + ptax + ".");
		System.out.print("Your total is: $");
		System.out.printf("%.2f", price);

	}

}
