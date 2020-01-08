import java.util.Scanner;

public class Main {

	public static int stringmatch(String a, String b) {

		int shorterString = 0;
		int counter = 0;

		if (a.length() > b.length())
			shorterString = a.length();

		else if (a.length() < b.length())
			shorterString = b.length();

		else if (a.length() == b.length())
			shorterString = a.length();

		for (int x = 0; x <= shorterString - 2; x++) {

			if (a.substring(x, x + 2).contentEquals(b.substring(x, x + 2))) {
				counter++;
			}

		}

		return counter;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter string A");
		String a = in.nextLine();
		System.out.println("Enter string B");
		String b = in.nextLine();

		System.out.println("Number of pairs: " + Main.stringmatch(a, b));
	}

}
