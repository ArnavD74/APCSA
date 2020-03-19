import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter input");
		int input = in.nextInt();

		
		System.out.println(FactorGenerator.nextFactor(input));
		
	}

}
