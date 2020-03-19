import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int init = 100;
		int counter = 0;

		while (init > 0) {

			System.out.print("Enter the number of tickets desired (no more than 4): ");
			
			int i = in.nextInt();

			if (i <= 4 && i > 0) {
				
				counter++;
				init = init - i;
				System.out.println("Tickets remaining " + init);
				
			} 
			
			else
				System.out.println("Error, please enter from 1 to 4.");

		}
		
		System.out.println("0 tickets remaining. Total number of purchasers: " + counter);
	}
}
