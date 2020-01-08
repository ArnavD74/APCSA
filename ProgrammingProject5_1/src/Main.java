import java.util.Scanner;

public class Main {

	public static String getSeason(int m, int d) {

		String month = " ";
		String season = " ";

		if (m == 1 || m == 2 || m == 3)
			season = "Winter";
		else if (m == 4 || m == 5 || m == 6)
			season = "Spring";
		else if (m == 7 || m == 8 || m == 9)
			season = "Summer";
		else if (m == 10 || m == 11 || m == 12)
			season = "Fall";

		if ((m % 3 == 0) && d >= 21) {

			if (season.equals("Winter")) {
				season = "Spring";
			}

			else if (season.equals("Spring")) {
				season = "Summer";
			}

			else if (season.equals("Summer")) {
				season = "Fall";
			}

			else
				season = "Winter";
		}

		return season;

	}

	public static void main(String[] args) {
		System.out.println(Math.pow(3, Math.sqrt(2)));

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a month.");
		int m = in.nextInt();

		System.out.println("Please enter a day.");
		int d = in.nextInt();

		System.out.println(getSeason(m, d));

	}

}
