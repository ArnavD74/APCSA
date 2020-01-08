public class Main {

	public static void main(String[] args) {

		String numb = "";

		for (int i = 0; i < 10; i++) {

			for (int x = 0; x < 3; x++)
				numb += i;
		}

		for (int x = 0; x < 3; x++)
			System.out.println(numb);

	}

}
