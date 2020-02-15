import java.util.ArrayList;

public class Student {

	private String name;
	private int age;
	private int height;

	public Student(String studentName, int studentAge, int studentHeight) {

		this.name = studentName;
		this.age = studentAge;
		this.height = studentHeight;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getHeight() {
		return height;
	}

}
