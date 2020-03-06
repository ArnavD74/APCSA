
public class Executive extends Manager {

	private int bonus;

	public Executive(String name, int salary, String department, int bonus) {
		
		super(name, salary, department);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Executive [bonus=" + bonus + "]";
	}

}
