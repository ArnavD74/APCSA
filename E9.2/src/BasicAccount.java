
public class BasicAccount extends BankAccount {

	public BasicAccount(String name, int balance) {
		super(name, balance);

	}

	public void withdraw(int amount) {

		if (amount > balance) {
			balance = 0;
			System.out.println("Error: amount exceeds balance");
		}

		else {
			this.balance -= amount;
			System.out.println("Successfully withdrew $" + amount);
		}
	}

	public static void main(String[] args) {

		BankAccount b1 = new BasicAccount("Bob", 100);

		System.out.println(b1);

		b1.withdraw(90);

		b1.deposit(50);

		b1.withdraw(120);

	}

}
