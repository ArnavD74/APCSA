
public class FactorGenerator {
	
	private static boolean hasMore = false;

	public static int nextFactor(int input) {

		for (int i = 2; i < input; i++) {
			while (input % i == 0) {
				System.out.println(i + " ");
				input = input / i;
			}
		}

		return input;
	}

	public static int hasMoreFactors(int input) {

		
	for (int i = 0; i < input; i++ ) {	
		
		
	}
		
		return input;
	}

}
