/**
 * Tests the savings account class.
 */
public class BankAccountTester {
	public static void main(String[] args) {
		

		
		BankAccount momsSavings = new BankAccount(1000, 0);
		momsSavings.addInterest(10);
		double momsBalance = momsSavings.getBalance();
		System.out.println("Balance:" + momsBalance);
		System.out.println("Expected result: 1100.0");
		
	}
}