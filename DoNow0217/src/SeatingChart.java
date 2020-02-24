import java.util.ArrayList;

public class SeatingChart {

	private static Student[][] seats;
	public static int rows;
	public static int columns;

	public SeatingChart(ArrayList<Student> studentList, int rows, int columns) {

		this.rows = rows;
		this.columns = columns;

		seats = new Student[rows][columns];

		int count = 0;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				seats[i][j] = studentList.get(count);
				count++;
			}
		}
	}

	public static int removeAbsentStudents(int allowedAbsences) {

		int count = 0;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				if (seats[i][j] != null) {

					if (seats[i][j].getAbsenceCount() >= allowedAbsences && seats[i][j] != null) {
						seats[i][j] = null;
						count++;
					}
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {

		ArrayList<Student> roster = new ArrayList<Student>();

		roster.add(new Student("Karen", 3));
		roster.add(new Student("Liz", 1));
		roster.add(new Student("Paul", 4));
		roster.add(new Student("Lester", 1));
		roster.add(new Student("Henry", 5));
		roster.add(new Student("Renee", 9));
		roster.add(new Student("Glen", 2));
		roster.add(new Student("Fran", 6));
		roster.add(new Student("David", 1));
		roster.add(new Student("Danny", 3));
		roster.add(null);
		roster.add(null);

		for (int i = 0; i < roster.size(); i++) {
			if (roster.get(i) != null) {
				System.out.print(roster.get(i).getName() + " ");
				System.out.print(roster.get(i).getAbsenceCount());
				System.out.println();
			}
		}

		System.out.println();

		SeatingChart introCS = new SeatingChart(roster, 3, 4);

		System.out.println();
		System.out.println("Removing students with 4 or more absences...");
		System.out.println("Number of students removed: " + removeAbsentStudents(4));
		System.out.println();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (seats[i][j] != null) {
					System.out.println(seats[i][j].getName() + ", " + seats[i][j].getAbsenceCount());
				}
			}
		}
	}
}