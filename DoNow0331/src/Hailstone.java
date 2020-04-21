import java.util.ArrayList;

public class Hailstone {

	public static int hailstoneLength(int n) {

		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(n);

		if (n <= 1) {
			return array.size();
		}

		else {

			while (n != 1) {

				if (n % 2 == 0) {
					n = n / 2;
					array.add(n);
				}

				else if (n % 2 != 0) {
					n = 3 * n + 1;
					array.add(n);
				}

			}

			return array.size();
		}

	}

	public static boolean isLongSeq(int n) {

		int length = hailstoneLength(n);
		if (length > n) {
			return true;
		}

		else
			return false;

	}

	public static double propLong(int n) {

		double counter = 0.0;

		for (int i = 1; i < n; i++) {

			if (isLongSeq(i) == true) {
				counter++;
			}

		}

		return counter / n;

	}

	public static void main(String[] args) {

		System.out.println(propLong(10));
	}

}
