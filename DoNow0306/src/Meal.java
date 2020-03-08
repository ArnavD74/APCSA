
public class Meal {

	public String entree;
	public double cost;

	public Meal(String entree, double cost) {

		this.entree = entree;
		this.cost = cost;

	}

	@Override
	public String toString() {
		return (entree + " meal, $" + cost);
	}

}
