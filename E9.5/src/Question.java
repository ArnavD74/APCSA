
public class Question {
	private String text;
	private String answer;

	public Question(String string) {
		text = "";
		answer = "";
	}

	public void setText(String questionText) {
		text = questionText;
	}

	public void setAnswer(String correctResponse) {
		answer = correctResponse;
	}

	public boolean checkAnswer(String response) {
		return response.equals(answer);
	}

	public String getText() {
		return text;
	}

	public String getAnswer() {
		return answer;
	}

	public void display() {
		System.out.println(text);
	}
}
