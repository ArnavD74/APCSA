import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Please enter an integer between 1000 and 999999:");
		Scanner input = new Scanner(System.in);
		String value = input.nextLine();

		String fixedvalue = "";

		for (int i = 1; i <= value.length(); ++i) {
			char pos = value.charAt(value.length() - i);
				if (i % 3 == 1 && i > 1) {
					fixedvalue = "," + fixedvalue;
				}
				fixedvalue = pos + fixedvalue;

		}
		
		System.out.println(fixedvalue);

	}

}
