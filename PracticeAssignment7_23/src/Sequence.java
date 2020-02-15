import java.util.ArrayList;

public class Sequence {
	private ArrayList<Integer> values;

	public Sequence() {
		values = new ArrayList<Integer>();
	}

	public void add(int n) {
		values.add(n);
	}

	public String toString() {
		return values.toString();
	}

	public void append(Sequence other) {

		ArrayList<Integer> values = this.values;

		Sequence temp = new Sequence();

	}

	public static void main(String[] args) {

		Sequence a = new Sequence();
		Sequence b = new Sequence();

		a.add(1);
		a.add(2);
		a.add(3);
		b.add(4);
		b.add(5);
		b.add(6);

		a.append(b);

		System.out.println(a);
	}
}
