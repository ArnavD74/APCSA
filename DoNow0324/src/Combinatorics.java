public class Combinatorics {

	public static int factorial(int n) {
		int result = 0;
		if (n == 1)
			result = 1;
		else if (n > 1)
			result = n * factorial(n - 1);
		return result;
	}

	public static void numCombinations(int n, int r) {
		int result;
		if (r > n)
			result = 0;
		else
			result = (factorial(n)) / ((factorial(r)) * factorial(n - r));
		System.out.println("There are " + result + " ways of choosing " + r + " items from " + n + " choices.");
	}

	public static void main(String[] args) {
		numCombinations(2, 4);
		numCombinations(5, 3);
	}

}