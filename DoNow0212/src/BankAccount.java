
public class BankAccount {
	
	private String name;
	private int accountNumber;
	private int balance;

	public BankAccount(String name, int accountNumber, int balance) {
		
		this.name = name;
		this.balance = balance;
		this.accountNumber = accountNumber;
		
	}
		
	public String getName() {
		return name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	
}
