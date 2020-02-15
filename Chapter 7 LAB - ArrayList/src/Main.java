import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// problem 1

		ArrayList<String> names = new ArrayList<>();

		// part A

		names.add("Alice");
		names.add("Bob");
		names.add("Connie");
		names.add("David");
		names.add("Edward");
		names.add("Fran");
		names.add("Gomez");
		names.add("Harry");

		System.out.println(names);

		// part B

		System.out.println(names.get(0));
		System.out.println(names.get(names.size() - 1));

		// part C

		System.out.println(names.size());

		// part D

		System.out.println(names.get(names.size() - 1));

		// part E

		names.set(0, "Alice B. Toklas");

		System.out.println(names);

		// part F

		names.add(4, "Doug");

		System.out.println(names);

		// part G

		for (String i : names)
			System.out.println(i);

		// part H

		ArrayList<String> names2 = new ArrayList<>(names);

		System.out.println(names2);

		// part I

		names.remove(0);
		System.out.println(names);
		System.out.println(names2);

		// problem 2

		ArrayList<String> problem2 = new ArrayList<>();

		problem2.add("Thomas");
		problem2.add("Rohit");
		problem2.add("Arnav");
		problem2.add("Sanjna");
		problem2.add("Ruchitha");

		System.out.println(problem2);

		problem2.remove(problem2.size() - 1);
		problem2.set(1, "Larry");

		System.out.println(problem2);

		// problem 3

		ArrayList<String> names1 = new ArrayList<String>();

		String[] friends = { "Sam", "Jessica", "Mark", "Alexis" };

		for (int i = 0; i <= friends.length - 1; i++) {

			names1.add(friends[i]);

		}

		System.out.println(names1);

		// problem 4 section 1

		ArrayList<Integer> values = new ArrayList<Integer>();
		int[] nums = { 1, 5, 7, 9, -2, 3, 2 };

		for (int i = 0; i < nums.length; i++) {
			values.add(nums[i]);
		}

		System.out.println("Expected Result:\t 1, 7, -2, 2,");
		System.out.print("Your Result:\t\t ");
		printEvenIndex(values);

		System.out.println();

		// problem 5

		ArrayList<Integer> problem5 = new ArrayList<Integer>();
		int[] nums5 = { 1, 44, 7, 9, -16, 3 };

		for (int i : nums5)
			problem5.add(i);

		System.out.println("Expected Result:\t [1, 44, 7, 9, -16, 3]");
		System.out.println("Your Result:\t\t " + problem5);

		// problem 6 section 1

		ArrayList<Integer> values6 = new ArrayList<Integer>();
		int[] nums6 = { -2, 34, -11, 9, -6, 3 };

		for (int i = 0; i < nums6.length; i++) {

			values6.add(nums6[i]);

		}

		System.out.println("Expected Result:\t -19");
		System.out.print("Your Result:\t\t ");
		System.out.println(sumNegValues(values6));

		// problem 7 section 1

		ArrayList<String> values7 = new ArrayList<String>();
		String[] words7 = { "bathtub", "fish", "computer", "cat", "foo" };

		for (int i = 0; i < words7.length; i++) {

			values7.add(words7[i]);

		}
		removeLongStrings(values7);

		System.out.println("Expected Result:\t [fish, cat, foo]");
		System.out.println("Your Result:\t\t " + values7);

		// problem 8 section 1

		ArrayList<String> values8 = new ArrayList<String>();
		String[] words8 = { "singapore", "cattle", "metropolitan", "turnstile" };

		for (int i = 0; i < words8.length; i++) {

			values8.add(words8[i]);

		}

		System.out.println("Expected Result:\t metropolitan");
		System.out.print("Your Result:\t\t ");
		System.out.println(findLongest(values8));

	}

	// problem 4 section 2

	public static void printEvenIndex(ArrayList<Integer> list) {

		for (int i = 0; i < list.size(); i++) {

			if (i % 2 == 0) {

				System.out.println(list.get(i) + ", ");

			}
		}
	}

	// problem 6 section 2

	public static int sumNegValues(ArrayList<Integer> list) {

		int counter = 0;
		for (int i = 0; i < list.size() - 1; i++) {

			if (list.get(i) < 0) {
				counter = counter - list.get(i);
			}

		}

		counter = 0 - counter;
		return counter;

	}

	// problem 7 section 2

	public static void removeLongStrings(ArrayList<String> list) {

		for (int i = 0; i < list.size() - 1; i++) {

			if (list.get(i).length() > 4) {
				list.remove(i);
			}
		}

	}

	// problem 8 section 2

	public static String findLongest(ArrayList<String> list) {

		int max = list.get(0).length();

		String counter = "";

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).length() > max) {

				counter = list.get(i);
			}

		}

		return counter;

	}

}
