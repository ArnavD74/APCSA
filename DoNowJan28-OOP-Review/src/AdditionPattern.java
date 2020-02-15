import java.util.ArrayList;

public class AdditionPattern {

	// generates a number pattern
	private ArrayList<Integer> arr = new ArrayList<Integer>();
	private int initialVar;
	private int step;

	public AdditionPattern(int start, int valueAdded) {

		arr.add(start);

		this.initialVar = start;
		this.step = valueAdded;

	}

	public void currentNumber() {
		// System.out.println(arr);
		System.out.println(arr.get(arr.size() - 1));
	}

	public void next() {
		arr.add(step + arr.get(arr.size() - 1));
	}

	public void prev() {

		if (arr.get(arr.size() - 1) - step < initialVar) {

		}

		else
			arr.add(arr.get(arr.size() - 1) - step);

	}

	public static void main(String[] args) {

		AdditionPattern plus3 = new AdditionPattern(2, 3);

		plus3.currentNumber();

		plus3.next();
		plus3.currentNumber();
		plus3.next();
		plus3.next();
		plus3.currentNumber();
		plus3.prev();
		plus3.prev();
		plus3.prev();
		plus3.currentNumber();
		plus3.prev();
		plus3.currentNumber();

	}

}
