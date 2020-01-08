
import java.util.Scanner;

public class Main {

	public static void showTwos(int input) {
		
		while (input % 2 == 0) {

			input = input / 2;
			System.out.print("2 * ");

		}
		
		System.out.print(input);
	}

	public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter integer");
        showTwos(in.nextInt());

    }
}
