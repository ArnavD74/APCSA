import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string.");
		String value = in.nextLine();

		if (value.length() % 2 == 0) { // if it is even

			int mid = value.length() / 2;

			String firsthalf = value.substring(0, mid);

			String lasthalf = value.substring(mid, value.length());

//			System.out.println("firsthalf = " + firsthalf);
//			System.out.println("lasthalf = " + lasthalf);

			if (firsthalf.equals(lasthalf))
				System.out.println("first and second half same");

			else
				System.out.println("first and second half different");

		}

		else if (value.length() % 2 == 1) {

			String firsthalf1 = value.substring(0, ((int) ((value.length() / 2) + 0.5)));

			String lasthalf1 = value.substring((int) (((value.length() / 2) - 0.5)) + 2, value.length());

//			System.out.println("firsthalf1 = " + firsthalf1);
//			System.out.println("lasthalf1 = " + lasthalf1);

			if (firsthalf1.equals(lasthalf1))
				System.out.println("first and second half same");

			else
				System.out.println("first and second half different");

		}

	}

}
