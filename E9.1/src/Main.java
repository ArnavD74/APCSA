
public class Main {

	public static void main(String[] args) {

		Student s1 = new Student("Bob", 1990, "Computer Science");
		Student s2 = new Student("Tom", 1985, "Computer Engineering");

		Instructor i1 = new Instructor("Jeff", 1965, 100000);
		Instructor i2 = new Instructor("Paul", 1960, 150000);

		Manager m1 = new Manager("Sam", 50000, "IT");
		Manager m2 = new Manager("Dan", 75000, "Finance");

		Employee e1 = new Employee("Tony", 25000);
		Employee e2 = new Employee("Rohit", 10000);

		Executive ee1 = new Executive("Rob", 500000, "Finance", 5000);
		Executive ee2 = new Executive("Larry", 400000, "Finance", 10000);

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(i1);
		System.out.println(i2);

		System.out.println(m1);
		System.out.println(m2);

		System.out.println(e1);
		System.out.println(e2);

		System.out.println(ee1);
		System.out.println(ee2);
	}

}
