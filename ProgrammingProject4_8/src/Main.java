import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("Please enter a phone number");
		Scanner input = new Scanner(System.in);
		String value = input.nextLine();
		System.out
				.println("(" + value.substring(0, 3) + ")" + " " + value.substring(3, 6) + "-" + value.substring(6, 10));

	}

}