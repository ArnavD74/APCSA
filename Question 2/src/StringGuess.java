
public class StringGuess {

	private static String guess;

	public static String getGuess() {
		return guess;
	}

//	public static double checkGuesses(String phrase, int num) {
//		int posCount = 0;
//		for (int i = 0; i < phrase.length(); i++) {
//			for (int j = 0; j < phrase.length(); j++) {
//				String key = phrase.substring(i, j);
//				if (getGuess().equals(key)) {
//					posCount++;
//				}
//			}
//		}
//		return posCount / num;
//	}
	
	public static double checkGuesses(String phrase, int num) {
		
		num = (int)(Math.random()*100)-1;
		
		int posCount = 0;
		
		for (int i = 0; i < phrase.length(); i++) {
			for (int j = 0; j < phrase.length(); j++) {
				String key = phrase.substring(i, j);
				if (getGuess().equals(key)) {
					posCount++;
				}
			}
		}
		return posCount / num;
	}

	
	public static void main(String[] args) {
		
		System.out.println((int) (Math.random()*100));
		
	}
	
}
