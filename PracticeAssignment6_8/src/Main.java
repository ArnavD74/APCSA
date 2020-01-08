import java.util.Scanner;

//"Harry" becomes H, a, r, r, y, on separate lines
public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string.");

		String input = in.nextLine();

		for (int i = 0; i < input.length(); i++) {
			System.out.print("\n" + input.charAt(i));
		}

	}

}
