public class SavingsAccount {
	private double balance;
	private double interestRate;


	public SavingsAccount() { //new account, zero balance
		balance = 0;
		interestRate = 0;
	}

	public SavingsAccount(double initialBalance, double rate) { //new account, with set balance
		balance = initialBalance;
		interestRate = rate;
	}


	public void deposit(double amount) { //deposits
		double newBalance = balance + amount;
		balance = newBalance;
	}

	public void withdraw(double amount) { //withdraws
		double newBalance = balance - amount;
		balance = newBalance;
	}


	public double getBalance() { //gets balance
		return balance;
	}

	public void addInterest() { //adds interest
		double interest = balance * interestRate / 100;
		balance = balance + interest;
	}
	
	
	public void addInterest(double rate) {
		double interest = balance * rate / 100;
		balance = balance + interest;
	}
}
