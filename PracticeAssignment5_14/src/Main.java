import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter a number grade, 0 to 4.");
		Double grade = in.nextDouble();
		String lettergrade = " ";

		if (grade <= 4 && grade >= 3.7) {
			lettergrade = "A+";
		}
		
		else if (grade < 3.7 && grade >= 3.4) {
			lettergrade = "A";
		}
		
		else if (grade < 3.4 && grade >= 3.1) {
			lettergrade = "A-";
		}
		
		else if (grade < 3.1 && grade >= 2.7) {
			lettergrade = "B+";
		}
		
		else if (grade < 2.7 && grade >= 2.4) {
			lettergrade = "B";
		}
		
		else if (grade < 2.4 && grade >= 2.1) {
			lettergrade = "B-";
		}
		
		else if (grade < 2.1 && grade >= 1.7) {
			lettergrade = "C+";
		}
		
		else if (grade < 1.7 && grade >= 1.4) {
			lettergrade = "C";
		}
		
		else if (grade < 1.4 && grade >= 1.0) {
			lettergrade = "C-";
		}
		
		else if (grade < 1.0 && grade >= 0.7) {
			lettergrade = "D+";
		}
		
		else if (grade < 0.7 && grade >= 0.4) {
			lettergrade = "D";
		}
		
		else if (grade < 0.4 && grade >= 0.1) {
			lettergrade = "D-";
		}
		
		else {
			lettergrade = "F";
			
		}
		
		
		System.out.println("Your grade is: " + lettergrade);
		
		
	}
}
