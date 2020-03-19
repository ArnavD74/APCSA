import java.util.Random;


public class Main {

	public static void main(String[] args) {
		
	Random rand = new Random();
	
	int x = rand.nextInt();		
	
	if (x < 0)
		System.out.println(x + " is negative");
	
	if (x == 0)
		System.out.println(x + " is zero");

	if (x > 0)
		System.out.println(x + " is positive");

	
	}
	
}
