import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("Please enter the first time: ");
		Scanner time1 = new Scanner(System.in);
		int t1 = time1.nextInt();

		System.out.println("Please enter the second time: ");
		Scanner time2 = new Scanner(System.in);
		int t2 = time2.nextInt();

		int h1 = t1 / 100; //hours
		int h2 = t2 / 100;
		int m1 = t1 % 100; //minutes
		int m2 = t2 % 100;

		System.out.println((h2-h1)+" hours "+(m2-m1)+" minutes ");

	}

}
