public class BankAccount {
	private String name;
	private int balance;

	public BankAccount(String firstName, int input) {
		this.name = firstName;
		this.balance = input;
	}

	public int getValue() {
		return balance;
	}

	public String getName() {
		return name;
	}

}
