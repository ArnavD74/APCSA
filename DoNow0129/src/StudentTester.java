import java.util.ArrayList;

public class StudentTester {

	public static String lowestHeight(ArrayList<Student> stu) {

		int counter = stu.get(0).getHeight();
		String temp = " ";

		for (int i = 0; i < stu.size(); i++) {

			if (stu.get(i).getHeight() < counter) {

			}

			else
				temp = stu.get(i).getName();

		}

		return temp;

	}

	public static int studentInClass(ArrayList<Student> stu, String name) {

		int counter = 0;

		for (int i = 0; i < stu.size(); i++) {

			if (stu.get(i).getName().equals(name)) {

				counter++;

			}

		}

		return counter;

	}

	public static void main(String[] args) {

		ArrayList<Student> stu = new ArrayList<Student>();
		Student s1 = new Student("Rohit", 20, 71);
		Student s2 = new Student("Thomas", 40, 52);
		Student s3 = new Student("Arnav", 60, 63);
		Student s4 = new Student("Sanjna", 50, 32);
		Student s5 = new Student("Ruchitha", 30, 85);
		Student s6 = new Student("Justin", 10, 40);
		Student s7 = new Student("Rohit", 45, 55);

		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		stu.add(s4);
		stu.add(s5);
		stu.add(s6);
		stu.add(s7);

//		System.out.println("Name = " + stu.get(0).getName());
//		System.out.println("Age = " + stu.get(0).getAge());
//		System.out.println("Height = " + stu.get(0).getHeight());

		System.out.println(lowestHeight(stu));

		System.out.println("Number of students named Rohit: " + studentInClass(stu, "Rohit"));

	}

}
