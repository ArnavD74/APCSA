
public class BankAccount {

	public String name;
	public double balance;

	public BankAccount(String name, double balance) {

		this.name = name;
		this.balance = balance;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", balance=" + balance + "]";
	}

}
