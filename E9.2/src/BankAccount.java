
public class BankAccount {

	public String name;
	public int balance;

	public BankAccount(String name, int balance) {

		this.name = name;
		this.balance = balance;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {
		this.balance += amount;
	}

	public void withdraw(int amount) {
		this.balance -= amount;
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", balance=" + balance + "]";
	}

}
