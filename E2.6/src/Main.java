import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) {
		
		BigInteger bigint = new BigInteger("10728200312345");
		int  power = 2;
		System.out.println("The big integer to the power of " + power + " is: " + bigint.pow(power));
		power = 4;
		System.out.println("The big integer to the power of " + power + " is: " + bigint.pow(power));
		power = 8;
		System.out.println("The big integer to the power of " + power + " is: " + bigint.pow(power));
		
	}

}
