import java.util.ArrayList;

public class BabysitterService {

	private ArrayList<Babysitter> sitterList = new ArrayList<Babysitter>();

	public void addNewSitters(String[] names) {

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < sitterList.size(); j++) {
				if (names[i].equals(sitterList.get(j).getName())) {
					// no action
				} else {
					Babysitter test = new Babysitter(names[i], 0);
					sitterList.add(test);
				}
			}
		}
	}

	public ArrayList<Babysitter> affordableSitters(double budget, int numChildren, int hours) {
		ArrayList<Babysitter> temp = new ArrayList<Babysitter>();
		double rate;
		for (int i = 0; i < sitterList.size(); i++) {
			if (sitterList.get(i).getYears() == 0) {
				rate = 2;
			}

			else if (sitterList.get(i).getYears() < 5) {
				rate = 2 + numChildren;
			}

			else {
				rate = 6;
			}

			if (rate > 6) {
				rate = 6;
			}
			if (budget > numChildren * hours * rate) {
				temp.add(sitterList.get(i));
			}
		}

		return temp;
	}

	public static void main(String[] args) {

	}

}
