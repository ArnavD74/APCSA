
public class ScoreInfo {

	private int score;
	private int numStudents;

	public ScoreInfo(int aScore) {
		score = aScore;
		numStudents = 1;
	}

	public boolean record(int score) {
		for (int i = 0; i < scoreList.size(); i++) {
			if (scoreList.get(i).getScore() == score) {
				scoreList.get(i).increment();
				return false;
			} 
			
			else if (score < scoreList.get(i).getScore()) {
				scoreList.add(i, new ScoreInfo(score));
				return true;
			}
			
		}
		
		scoreList.add(new ScoreInfo(score));
		return true;
	}

	public void recordScores(int[] stuScores) {
		for (int i = 0; i < stuScores.length; i++) {
			int score = stuScores[i];
			record(score);
		}
	}

}
