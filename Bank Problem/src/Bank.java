import java.util.ArrayList;

public class Bank {
	
	private ArrayList<BankAccount> accounts; //given

	public Bank() { //bank without any bankaccounts, given
		accounts = new ArrayList<BankAccount>();
	}

	public void addAccount(BankAccount a) { //adds an account to the bank, given
		accounts.add(a);
	}

	public double getTotalBalance() { //gets the sum of the balances of all accounts in this bank.
		double total = 0;
		for (BankAccount a : accounts) {
			total = total + a.getBalance();
		}
		return total;
	}

	public int countBalancesAtLeast(double atLeast) {//counts the number of bank accounts whose balance is at least a given value
		int counter = 0;
		for (BankAccount a : accounts) {
			if (a.getBalance() >= atLeast) {
				counter++;
			}
		}
		
		return counter;
	}

	public BankAccount find(int accountNumber) {//finds a bank account with a given number

		for (BankAccount a : accounts) {
			if (a.getAccountNumber() == accountNumber) {
				return a;
			}
		}
		return null;
	}

	public BankAccount getMaximum() {//gets bank account with largest balance
		BankAccount max = accounts.get(0);
		double maximum = 0;
		for (BankAccount a : accounts) {
			
			//double maximum = 0;
			
			if (a.getBalance() >= maximum) {
				maximum = a.getBalance();
				max  = a;
			}
		}
		return max;
	}

	public BankAccount getMinimum() {
		BankAccount min = accounts.get(0);
		double maximum = Integer.MAX_VALUE;
		double minumum = 0;
		for (BankAccount a : accounts) {
			
			//double minumum = 0;
			
			if (a.getBalance() <= minumum) {
				minumum = a.getBalance();
				min = a;
			}
		}
		return min;
	}

}