import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a target price");
		
		int target = in.nextInt();
		
		System.out.println("Please enter values. You will be notified when your target is reached.");
		
		while (in.hasNextInt() && in.nextInt() < target)
			System.out.println("not reached");
	
		System.out.println("Your target has been reached.");
		
	}
	
}
