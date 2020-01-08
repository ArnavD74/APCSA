
public class printDesign {

	public static void main(String[] args) {

		for (int x = 1; x <= 9; x += 2) {
			for (int y = 0; y < (11 - x) / 2; y++)
				System.out.print("-");

			for (int y = 0; y < x; y++)
				System.out.print(x);

			for (int y = 0; y < (11 - x) / 2; y++)
				System.out.print("-");

			System.out.println();
		}

	}

}
