//"harry" prints "Vowels: 2" (vowel counter)
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string.");
		
		String input = in.nextLine();
		
		System.out.println("Your string is: " + input);

		int counter = 0;
		
		for (int i = 0; i < input.length(); i++) {
			
			
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u' || input.charAt(i) == 'y') {
				counter++;
			}
			
		}
		
		System.out.println("Number of vowels: " + counter);

		
	}
	
}
