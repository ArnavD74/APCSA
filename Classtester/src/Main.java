import java.util.Random;

public class Main {

	public static void printNums(int value, int numRounds) {
				
		Random r = new Random();
		int random = r.nextInt(10);
		
		for (int i = 0; i <= numRounds; i++) {
			
			while (random != value) {
				
				random = r.nextInt(10);
				System.out.print(random);

			}
			
			random = r.nextInt(10);
			System.out.println();
		}
	}

	public static void main(String[] args) {

		printNums(5, 4);

	}

}
