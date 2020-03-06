
public class BasicAccount extends BankAccount {

	public BasicAccount(String name, int balance) {
		super(name, balance);

	}

	public void withdraw(int amount) {

		if (amount > balance) {
			this.balance -= amount;
			this.balance -= 30;
			System.out.println("Error: amount exceeds balance. $30 fee added.");
		}

		else {
			this.balance -= amount;
			System.out.println("Successfully withdrew $" + amount + " with no fee.");
		}
	}

	public static void main(String[] args) {

		BankAccount b1 = new BasicAccount("Bob", 100);

		System.out.println(b1);

		b1.withdraw(90);

		b1.deposit(50);

		b1.withdraw(120);
		
		System.out.println(b1);

	}

}
