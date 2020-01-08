import java.util.Scanner;

//"Harry" becomes "yrraH" (reverse string)
public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string.");

		String input = in.nextLine();

		System.out.println("Your string is: " + input);

		String newinput = " ";

		for (int i = input.length() - 1; i >= 0; i--) {
			newinput += input.charAt(i);
			//System.out.println(i);
		}

		System.out.println("Your new String: " + newinput);

	}

}
