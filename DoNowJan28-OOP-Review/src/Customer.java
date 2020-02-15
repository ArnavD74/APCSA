
public class Customer {
	
	private static int nextAccNum = 1; //given
	private String name;			   //given
	private int currAccNum;			   //given

	public Customer(String n) {		   //given
		this.name = n;
		this.currAccNum = nextAccNum;
		nextAccNum++;
	}

	public void billNotice(double amountdue) { //return a string representing a bill notice when passed a double value representing an amount due.
		System.out.println(name + ", " + "Account number " + currAccNum + ", " + "please pay: $" + amountdue);
	}

	public int nextAccountNumber() { //returns the value of the next account number that will be assigned
		return nextAccNum;
	}

	public void updateName(String newName) { //Write a correct implementation of the updateName method that avoids the error in the student’s implementation.
		this.name = newName;
		System.out.println("Account is under: " + name);
	}

	public static void main(String[] args) {
		Customer customer1 = new Customer("Rohit");
		customer1.billNotice(60);
		System.out.println("Next account: " + customer1.nextAccountNumber());
		customer1.updateName("Rohit A");
		System.out.println();
		Customer customer2 = new Customer("Thomas");
		customer2.billNotice(100);
		System.out.println("Next account: " + customer2.nextAccountNumber());
		customer2.updateName("Thomas C");
		System.out.println();
		Customer customer3 = new Customer("Arnav");
		customer3.billNotice(50.50);
		System.out.println("Next account: " + customer3.nextAccountNumber());
		customer3.updateName("Arnav D");
		System.out.println();
		Customer customer4 = new Customer("Sanj");
		customer4.billNotice(125.521);
		System.out.println("Next account: " + customer4.nextAccountNumber());
		customer4.updateName("Sanjna C");
	}

}
