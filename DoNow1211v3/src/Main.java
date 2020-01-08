
public class Main {

	public static void main(String[] args) {

		int first = 1;
		int second = 1;

		System.out.print(first + " " + second + " ");
		for (int i = 0; i < 5; i++) {

			first += second; // 2
			second += first;

			System.out.print(first + " ");
			System.out.print(second + " ");

		}

	}

}
