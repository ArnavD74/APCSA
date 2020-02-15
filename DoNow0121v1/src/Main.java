import java.util.Arrays;

public class Main {

	public static boolean isSelfDivisor(int number) {
		int currNumber = number;
		int digit = 0;
		while (currNumber > 0) {
			digit = currNumber % 10;
			if (digit == 0)
				return false;
			if (number % digit != 0)
				return false;
			currNumber = currNumber / 10;
		}
		return true;
	}

	public static int[] firstNumSelfDivisors(int start, int num) {

		int[] arr = new int[num];

		System.out.println("Start: " + start);

		int i = 0;

		while (i < num) {
			if (isSelfDivisor(start)) {
				arr[i] = start;
				i++;
			}
			start++;
		}

		return arr;

	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(firstNumSelfDivisors(22, 5)));

	}

}
