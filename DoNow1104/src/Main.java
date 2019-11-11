import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("List Price:  ");
		double listPrice = in.nextDouble();
		System.out.println("Actual Price:  ");
		double actualPrice = in.nextDouble();

		if (actualPrice < (listPrice / 2)) {
			System.out.println("Great deal");
			Runtime.getRuntime().exit(0);
		}

		if (actualPrice <= ((listPrice / 100) * 80)) {
			System.out.println("Good deal");
			Runtime.getRuntime().exit(0);
		}

		if (actualPrice >= ((listPrice / 100) * 81)) {
			System.out.println("Okay deal");
			Runtime.getRuntime().exit(0);
		}

		if (actualPrice <= listPrice) {
			System.out.println("Bad deal");
			Runtime.getRuntime().exit(0);
		}

		else {
			System.out.println("Bad deal");
			Runtime.getRuntime().exit(0);
		}
	}

}