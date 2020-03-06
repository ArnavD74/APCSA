
public class NumericQuestion extends Question {

	private double answer;

	private static final double EPSILON = 0.01;

	public NumericQuestion(String answerText) {

	}

	public void setAnswer(double correctResponse) {

		this.answer = correctResponse;

	}

	public void checkAnswer(double correctResponse) {

	}

}
