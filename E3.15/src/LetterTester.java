
public class LetterTester {

	public static void main(String[] args) {
		Letter letter = new Letter("Mary", "John");
		letter.addLine("I'm sorry we must be apart.");
		letter.addLine("I wish you all the best.");
		System.out.print(letter.getText());

	}

}
