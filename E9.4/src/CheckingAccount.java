
public class CheckingAccount extends BankAccount {

	private double Overdrafts = 0;

	public CheckingAccount(String name, double balance) {

		super(name, balance);

	}

	public void withdraw(double amount) {

		final int INITIAL_FEE = 20;
		final int WITHDRAWAL_FEE = 30;

		if (amount > balance) {
			balance -= amount;
			Overdrafts++;
		}

		else if (balance > amount) {
			balance -= amount;
		}

		if (Overdrafts == 1) {
			super.withdraw(INITIAL_FEE);
		}

		else if (Overdrafts > 1) {
			super.withdraw(WITHDRAWAL_FEE);
		}

	}

	public static void main(String[] args) {

		BankAccount b1 = new CheckingAccount("Bob", 100);
		System.out.println(b1);

		b1.withdraw(50); // 100 - 50 = 50

		b1.withdraw(60); // 50 - 60 = -10 - 20 = -30
		
		b1.withdraw(10); //-30 - 10 = -40 - 30 = -70

		System.out.println(b1);

	}

}
