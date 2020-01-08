import java.util.Scanner;

//prints all possible substrings of a string (rum: r, u, m, ru, um, rum)
public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string.");
		String input = in.nextLine();

		for (int length = 1; length <= input.length(); length++) {
			
			for (int i = 0; i < input.length() - length + 1; i++) {
				
				System.out.println(input.substring(i, i + length));
			}
		}

	}

}
