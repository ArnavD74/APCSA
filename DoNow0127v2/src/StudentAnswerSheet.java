import java.util.ArrayList;
import java.util.Arrays;

public class StudentAnswerSheet {

	private ArrayList<String> answers; // list of Student answers
	String name;

	public StudentAnswerSheet(String nm, ArrayList<String> ans) {
		name = nm;
		answers = new ArrayList<String>();
		for (String a : ans)
			answers.add(a);
	}

	public double getScore(ArrayList<String> key) {
		double totalScore = 0;
		for (int i = 0; i < key.size(); i++) {

			if (answers.get(i).equals(key.get(i))) {
				totalScore++;
			}

			else if (answers.get(i).equals("?")) {
				// nothing
			}

			else {
				totalScore -= 0.25;
			}
		}
		return totalScore;

	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		ArrayList<String> key = new ArrayList<String>(
				Arrays.asList(new String[] { "A", "C", "D", "E", "B", "C", "E", "B", "B", "C" }));

		ArrayList<String> answers1 = new ArrayList<String>(
				Arrays.asList(new String[] { "A", "B", "D", "E", "A", "C", "?", "B", "D", "C" }));
		StudentAnswerSheet s1 = new StudentAnswerSheet("S1", answers1);
		System.out.println("Your score for s1 is: " + s1.getScore(key) + " and should be 5.25");

		ArrayList<String> answers2 = new ArrayList<String>(
				Arrays.asList(new String[] { "A", "?", "D", "E", "A", "C", "?", "B", "D", "C" }));
		StudentAnswerSheet s2 = new StudentAnswerSheet("S2", answers2);
		System.out.println("Your score for s2 is: " + s2.getScore(key) + " and should be 5.5");

		ArrayList<String> answers3 = new ArrayList<String>(
				Arrays.asList(new String[] { "A", "?", "D", "E", "A", "C", "E", "B", "D", "C" }));
		StudentAnswerSheet s3 = new StudentAnswerSheet("S3", answers3);
		System.out.println("Your score for s3 is: " + s3.getScore(key) + " and should be 6.5");

		ArrayList<String> answers4 = new ArrayList<String>(
				Arrays.asList(new String[] { "A", "C", "D", "E", "A", "C", "E", "B", "D", "C" }));
		StudentAnswerSheet s4 = new StudentAnswerSheet("S4", answers4);
		System.out.println("Your score for s4 is: " + s4.getScore(key) + " and should be 7.5");

	}

}
