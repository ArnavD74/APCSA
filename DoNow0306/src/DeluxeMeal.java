
public class DeluxeMeal extends Meal {

	public String sideDish;
	public String drink;

	
	public DeluxeMeal(String entree, String sideDish, String drink, double cost) {
		super(entree, cost);
		this.sideDish = sideDish;
		this.drink = drink;
		this.cost+=3;
	}

	@Override
	public String toString() {
		return ("deluxe " + entree + " meal, $" + cost);
	}

	public static void main(String[] args) {

		Meal burger = new Meal("hamburger", 7.99);
		DeluxeMeal burritoCombo = new DeluxeMeal("burrito", "chips", "lemonade", 7.49);

		System.out.println(burger);
		System.out.println(burritoCombo);

	}

}
