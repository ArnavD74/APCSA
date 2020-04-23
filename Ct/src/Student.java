public class Student

{

	private String name;

	private int age;

	public Student(String n, int a)

	{

		name = n;

		age = a;

	}

	public boolean isOlderThan5()

	{

		if (age > 5)

		{

			return true;

		}

	}

}