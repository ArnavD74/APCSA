import java.util.Random;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
	Random rand = new Random();
	
	float x = rand.nextFloat();		
	
	Scanner in = new Scanner(System.in);
	System.out.println("Large (L) or Small (S) ?");

	String choice = in.nextLine();
	
	if (choice.equals("L")) {
		while (x >= 1000000) {
			x = x * 10;
		}

		//System.out.println(x);
	}
	
	if (x < 0)
		System.out.println(x + " is negative");
	
	if (x == 0)
		System.out.println(x + " is zero");

	if (x > 0)
		System.out.println(x + " is positive");
	
	if (Math.abs(x) < 1 && Math.abs(x) > 0)
		System.out.println(x + " is small");
	
	if (Math.abs(x) > 1000000)
		System.out.println(x + " is small");

	
	}
	
}
