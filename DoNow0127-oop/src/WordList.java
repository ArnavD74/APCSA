
//jan 27 open ended problem 1a/1b
import java.util.ArrayList;

public class WordList {

	private static ArrayList myList;

	public WordList(ArrayList<String> animals) {

		this.myList = animals;

	}

	public static int numWordsOfLength(int len) {

		int counter = 0;

		for (int i = 0; i < myList.size(); i++) {

			if (((String) myList.get(i)).length() == len) {
				counter++;
			}

		}

		return counter;
	}

	public static void removeWordsOfLength(int len) {

		for (int i = 0; i < myList.size(); i++) {

			if (((String) myList.get(i)).length() == len) {
				myList.remove(i);
			}

		}

		if (((String) myList.get(myList.size() - 1)).length() == len) {
			myList.remove(myList.size() - 1);
		}

	}

	public static void main(String[] args) {

		ArrayList<String> animals = new ArrayList<String>();

		animals.add("cat");
		animals.add("mouse");
		animals.add("frog");
		animals.add("dog");
		animals.add("dog");

		WordList list = new WordList(animals);
		System.out.println("Total number of elements with length 4: " + numWordsOfLength(4));
		System.out.println("Total number of elements with length 3: " + numWordsOfLength(3));

		removeWordsOfLength(3);
		System.out.println("Elements after removed all elements with length 3: " + animals);
	}
}
