import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Plase enter an integer representing the current temperature in Fahrenheit");
		Scanner in = new Scanner(System.in);
		double t = in.nextDouble();
		double c = (t - 32) * (5 / 9);

		//int resistance = 33192;
		//int beta = 3310;
		
        t = t + 457.87;
        double resistance = 33192;
        double beta = 3310;
        double t0 = 313.15;
        double R0 = resistance *Math.exp(((beta/t)-(beta/t0)));
        double R2 = 156300;
        double R3 = R2;
        double R4 = R2;
        double L = R2/(R0+R2);
        double R = R4/(R3+R4);
        
        if (L < R) {
            System.out.print("Alarm is ringing");
        }
        else {
            System.out.print("Alarm is not ringing");
        }


	}

}
