import java.util.ArrayList;

public class Stats {

	private ArrayList<ScoreInfo> scoreList;

	public Stats() {

		scoreList = new ArrayList<ScoreInfo>();

	}

	public Stats(ArrayList<ScoreInfo> tempScores) {
		scoreList = tempScores;
	}

	public boolean record(int score) {

		for (int i = 0; i < scoreList.size(); i++) {

			if (scoreList.get(i).getScore() == score) {
				scoreList.get(i).increment();
				return true;
			}

			else {
				ScoreInfo newScore = new ScoreInfo(score);
				scoreList.add(newScore);
				return false;
			}

		}

		return false;

	}

	public void recordScores(int[] stuScores) {

		for (int i = 0; i < stuScores.length; i++) {
			record(stuScores[i]);
		}

	}

	public ArrayList<ScoreInfo> getScoreList() {

		return scoreList;

	}

	public static void main(String[] args) {
		ScoreInfo a1 = new ScoreInfo(1);
		ScoreInfo a2 = new ScoreInfo(1);
		ScoreInfo a3 = new ScoreInfo(1);

		ArrayList<ScoreInfo> list = new ArrayList<ScoreInfo>();
		list.add(a1);

		Stats stats = new Stats(list);
		stats.record(12);
		stats.record(15);
		stats.record(97);

		int[] scor = { 13, 18, 19, 17, 16 };
		stats.recordScores(scor);

		System.out.println("Expected: {12 15 97 13 18 19 17 16 }");
		System.out.print("Actual:   {");

		list.remove(0);

		list = stats.getScoreList();
		for (int i = 0; i < list.size(); i++) {

			System.out.print(list.get(i).getScore() + " ");

		}

		System.out.print("}");
	}

}
