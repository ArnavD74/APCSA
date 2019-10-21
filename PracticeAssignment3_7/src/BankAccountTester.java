/**
 * Tests the savings account class.
 */
public class BankAccountTester {
	public static void main(String[] args) {
		
		BankAccount arnavSavings = new BankAccount();
		arnavSavings.deposit(1000);
		arnavSavings.withdraw(500);
		arnavSavings.withdraw(400);
		double arnavbalance = arnavSavings.getBalance();
		System.out.println("Balance:" + arnavbalance);
		System.out.println("Expected result: 100.0");
		
	}
}