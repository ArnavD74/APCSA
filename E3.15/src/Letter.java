
public class Letter {

	private String to;
	private String from;
	private String body = "";

	public Letter(String to, String from) {
		this.to = to;
		this.from = from;
	}

	public void addLine(String line) {
		body = body + line + "\n";
	}

	public String getText() {
		String text = "Dear " + to + ",\n\n" + body + "\nSincerely,\n" + from + ".";
		return text;

	}

}
