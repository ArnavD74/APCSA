import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter the length of the sequence.");
		int input = in.nextInt();

		int num1 = 0;
		int num2 = 1;
				
		for (int i = 1; i <= input; ++i) {
			System.out.print(num1 + " ");
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}

	}

}
