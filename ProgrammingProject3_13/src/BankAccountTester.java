public class BankAccountTester {
	public static void main(String[] args) {

		BankAccount account = new BankAccount(0, 30, 0.10, 0.10);
		account.rapidDeposit(75, 500);
		account.rapidWithdraw(75, 200);
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.printf("Average fee per transaction = $%.2f\n", (account.depositRate + account.withdrawRate) / 2);
		// System.out.println("Debug: Withdraws: " + account.withdrawTally + ",
		// Deposits: " + account.depositTally);
		// System.out.println("");

		System.out.printf("Fee before free allotment: $%.2f\n", account.getFees());

		double fee1 = account.getFees();

		double totalFee = account.deductMonthlyCharge(10, 10);
		// System.out.println("Debug: Withdraws: " + account.withdrawTally + ",
		// Deposits: " + account.depositTally);

		double newFee = fee1 - totalFee;

		System.out.printf("New Fee: $%.2f\n", newFee);
		// System.out.println("");
		System.out.printf("Money Saved: $%.2f\n", totalFee);

	}
}