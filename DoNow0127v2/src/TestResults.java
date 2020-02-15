import java.util.ArrayList;

public class TestResults {
	private ArrayList<StudentAnswerSheet> sheets;

	public TestResults(ArrayList<StudentAnswerSheet> shs) {
		sheets = new ArrayList<StudentAnswerSheet>();
		for (StudentAnswerSheet s : shs)
			sheets.add(s);
	}

	public String highestScoringStudent(ArrayList<String> key) {
		StudentAnswerSheet highestSheet = sheets.get(0);
		for (int i = 1; i < sheets.size(); i++) {
			if (highestSheet.getScore(key) < sheets.get(i).getScore(key)) {
				highestSheet = sheets.get(i);
			}
		}
		return highestSheet.getName();
	}
}
