import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("Please enter an integer from 1,000 to 999,999");
		Scanner input = new Scanner(System.in);
		String value = input.nextLine().replaceAll(",", "");
		System.out.println(value);

	}

}
