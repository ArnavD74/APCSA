import java.util.ArrayList;

public class Main {

	private static ArrayList<String> arr;

	public static int numWordsOfLength(int len) {

		int counter = 0;

		for (int i = 0; i < arr.size(); i++) {

			if ((arr.get(i)).length() == len) {
				counter++;
			}
		}
		
		return counter;
	}

	public static void removeWordsOfLength(int len) {

		for (int i = arr.size() - 1; i >= 0; i--) {

			if ((arr.get(i)).length() == len) {

				arr.remove(i);
			}
		}
	}
}