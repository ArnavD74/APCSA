import java.util.Scanner;

public class Main {

	public static void toBinary(int num) {
		
		String total = "";
		
		while (num != 0) {
			
			total += Integer.toString(num % 2);
			num /= 2;
			
		}

		String end = "";
		
		for (int i = (total.length() - 1); i >= 0; i--)
			end = end + total.charAt(i);
		
		System.out.println(end);

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter integer");
		
		Main.toBinary(in.nextInt());

	}

}
