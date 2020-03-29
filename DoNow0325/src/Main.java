import java.util.ArrayList;

public class Main {

	// Factorial Recursive
	public static int factorial(int x) {
		if (x == 0)
			return 1;
		else
			return x * factorial(x - 1);
	}

	// Factorial Iterative
	public static int factorial2(int x) {
		int j = 1, i;
		for (i = 2; i <= x; i++)
			j = j * i;
		return j;
	}

	// Total Sum Recursive
	public static int sum(ArrayList<Integer> x) {
		if (x.size() == 1)
			return x.get(0);
		else {
			int n = x.get(0);
			x.remove(0);
			return n + sum(x);
		}
	}

	// total Sum Iterative
	public static int sum2(int x) {
		int count;
		int total = 0;
		for (count = 0; count <= x; count++)
			total = total + count;
		return total;
	}

	// Power Recursive
	public static int power(int x, int y) {
		if (y == 1)
			return x;
		else
			return x * power(x, y - 1);
	}

	// Power Iterative
	public static int power2(int x, int y) {
		int result = 1;
		for (int i = 0; i < y; i++)
			result *= x;
		return result;
	}

	// Fibonacci Recursive
	public static int fibonacci(int x) {

		if (x <= 1)
			return x;
		else {
			return fibonacci(x - 1) + fibonacci(x - 2);
		}
	}

	// Fibonacci Iterative
	public static int fibonacci2(int n) {
		int x = 0, y = 1, temp = 1;
		for (int i = 0; i < n; i++) {
			x = y;
			y = temp;
			temp = x + y;
		}
		return x;

	}

	public static void main(String[] args) {
		System.out.println("10! recursively is " + factorial(10));
		System.out.println("10! iteratively is " + factorial2(10));

		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(4);
		x.add(5);
		System.out.println("1+2+3+4+5 recursively is " + sum(x));
		System.out.println("1+2+3+4+5 iteratively is " + sum2(5));
		

		System.out.println("2^3 is recursively " + power(2, 3));
		System.out.println("2^3 is iteratively " + power2(2, 3));
		// fibonacci
		System.out.println("The 10th term of the Fibonacci sequence recursively is " + fibonacci(10));
		System.out.println("The 10th term of the Fibonacci sequence iteratively is " + fibonacci2(10));

	}

}