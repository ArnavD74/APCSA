public class BankAccount {
	private double balance;
	private double interestRate;

	public double withdrawFee;
	public double depositFee;

	public double withdrawRate;
	public double depositRate;

	public int withdrawTally;
	public int depositTally;
	public double totalFee;
	
	public BankAccount() { // new account, zero balance
		balance = 0;
		interestRate = 0;
	}

	public BankAccount(double initialBalance, double rate, double depositRate, double withdrawRate) { // new account, with set balance
		balance = initialBalance;
		interestRate = rate;
		
		this.depositRate = depositRate;
		this.withdrawRate = withdrawRate;
		
	}

	public void deposit(double amount) { // deposits
		depositFee = depositFee + depositRate;
		depositTally++;
		double newBalance = balance + amount;
		balance = newBalance;
	}

	public void withdraw(double amount) { // withdraws
		withdrawFee = withdrawFee + withdrawRate;
		withdrawTally++;
		double newBalance = balance - amount;
		balance = newBalance;
	}

	public double getBalance() { // gets balance
		return balance;
	}

	public void addInterest() { // adds interest
		double interest = balance * interestRate / 100;
		balance = balance + interest;
	}

	public void addInterest(double rate) {
		double interest = balance * rate / 100;
		balance = balance + interest;
	}

	public double getFees() {
		
		double totalfee= (withdrawTally*withdrawFee) + (depositTally+depositFee);
		return totalfee;
	}
	
	
	public double deductMonthlyCharge(int freeDeposits, int freeWithdrawals) { // pass FD/FW

//		System.out.println("Withdraw rate = " + withdrawRate);
//		System.out.println("Deposit rate = " + depositRate);
//		System.out.println("W Tally = " + withdrawTally);
//		System.out.println("D Tally = " + depositTally);

		
		double totalWithdrawFee = withdrawRate * (withdrawTally - freeWithdrawals);
		double totalDepositFee = depositRate * (depositTally - freeDeposits);
		withdrawTally = 0;
		depositTally = 0;

		return totalWithdrawFee + totalDepositFee;
	}

	public void rapidDeposit(int rounds, int amount) {

		//for (int i = 0; i <= rounds; i++) {
			depositFee = depositFee + depositRate;
			depositTally++;
			double newBalance = balance + amount;
			balance = newBalance;
			if (rounds > 0) 
				rapidDeposit(rounds-1, amount); //alternate method
		//}
	}

	public void rapidWithdraw (int rounds, int amount) {
		
		for(int i=0; i <= rounds; i++) {
			withdrawFee = withdrawFee + withdrawRate;
			withdrawTally++;
			double newBalance = balance - amount;
			balance = newBalance;
		}
	}

}
