
public class Hailstone {

	public static int hailStoneLength(int n) {
		int counter = 1;
		int seq = n;
		if (seq == 1)
			counter = 1;
		while (seq != 1) {
			if (seq % 2 == 0) {
				seq = seq / 2;
				counter++;
			} else if (seq % 2 != 0) {
				seq = (3 * seq) + 1;
				counter++;
			}
		}
		return counter;
	}

	public static boolean isLongSeq(int n) {
		if (hailStoneLength(n) > n)
			return true;
		else
			return false;
	}

	public static double propLong(int n) {
		double counter = 0;
		for (int i = 1; i < n + 1; i++) {
			if (isLongSeq(i)) {
				counter++;
			}
		}
		return counter / n;
	}

	public static void main(String[] args) {

//		for (int i = 1; i < 8; i++) {
//			System.out.print("length of " + i + ": ");
//			System.out.println(hailStoneLength(i));
//			System.out.print("long of " + i + ": ");
//			System.out.println(isLongSeq(i));
//		}
		
		System.out.println(propLong(25));

	}

}
