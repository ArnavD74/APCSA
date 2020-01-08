import java.util.Scanner;

public class Main {

	public static String stringX(String input) {

//		String newInput = "";
//		String xinput = "";
//		
//		if (input.substring(0, 1).equalsIgnoreCase("x"))
//			newInput = input.substring(1, input.length());
//		
//		if (input.substring(input.length() - 1, input.length()).equalsIgnoreCase("x"))
//			newInput = input.substring(0, input.length() - 1);
//		
//		for (int x = 0; x <= newInput.length() - 1; x++) {
//			
//			if (newInput.substring(x , x+1).equalsIgnoreCase("x"))
//				xinput = newInput.substring(0, x) + newInput.substring(x+1, newInput.length());
//			
//		}
//		
//		if (input.substring(input.length() - 1, input.length()).equalsIgnoreCase("x"))
//			xinput += "x";
//		
//		return xinput;

		String temp = "";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != 'x' || i == 0 || i == input.length() - 1) {
				temp += input.charAt(i);
			}
		}
		return temp;

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter string A");
		String input = in.nextLine();

		// System.out.println("New string: " + Main.stringX(input));
		System.out.println("New string: " + Main.stringX(input));

	}

}
