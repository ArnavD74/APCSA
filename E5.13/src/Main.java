import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter a letter grade.");
		String grade = in.nextLine();
		String addition = " ";
		double addition1 = 0;

		if (grade.length() > 1)
			addition = grade.substring(1, 2);
		else {
			addition = "0";
			addition1 = 0;
		}

		grade = grade.substring(0, 1);

		if (grade.equals("A"))
			grade = "3.7";

		if (grade.equals("B"))
			grade = "3.0";

		if (grade.equals("C"))
			grade = "2.3";

		if (grade.equals("D"))
			grade = "1.5";

		if (grade.equals("F")) {
			grade = "0";
			System.out.print("Your grade is: ");
			System.out.printf("%1.1f", + Double.parseDouble(grade));
			System.exit(0);
		}

		if (addition.equals("+")) {

			addition = "0.3";
			addition1 = Double.parseDouble(addition);
			System.out.print("Your grade is: ");
			System.out.printf("%.1f", (Double.parseDouble(grade) + addition1));

		}

		else if (addition.equals("-")) {

			addition = "0.3";
			addition1 = Double.parseDouble(addition);
			System.out.print("Your grade is: ");
			System.out.printf("%.1f", (Double.parseDouble(grade) - addition1));

		}

		else {
			System.out.print("Your grade is: ");
			System.out.printf("%.1f", Double.parseDouble(grade));

		}
	}
}
