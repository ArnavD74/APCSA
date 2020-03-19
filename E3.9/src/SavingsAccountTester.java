public class SavingsAccountTester {
	public static void main(String[] args) {
		

		SavingsAccount arnavSavings = new SavingsAccount();
		arnavSavings.deposit(1000);
		arnavSavings.addInterest(30);
		double arnavbalance = arnavSavings.getBalance();
		arnavSavings.addInterest();
		System.out.println("Balance:" + arnavbalance);
		System.out.println("Expected Balance: 1300.0");
		
	}
}