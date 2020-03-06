
public class Instructor extends Person {

	private int salary;

	public Instructor(String name, int year, int salary) {

		super(name, year);
		this.salary = salary;

	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Instructor [salary=" + salary + "]";
	}

}
