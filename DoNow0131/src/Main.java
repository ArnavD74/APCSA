import java.util.ArrayList;

public class Main {


	public static ArrayList<Integer> mystery(int n) {
		ArrayList<Integer> seq = new ArrayList<Integer>();
		for (int k = 1; k <= n; k++) {
			seq.add(new Integer(k * k + 3));
		}
		return seq;
	}

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		System.out.println(mystery(6));

	}

}
