import java.util.Random;

public class Main {

	public static boolean substringFound(String phrase, String key, int index) {

		String part = phrase.substring(index, index + key.length());
		return part.equals(key);

	}

	public static void main(String[] args) {

		System.out.println(substringFound("Horse", "Horse", 0));

	}

}
