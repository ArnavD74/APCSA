public class Customer

{

	private static int nextAccNum = 1;

	private String name;

	private int currAccNum;

	public Customer(String n)

	{

		name = n;

		currAccNum = nextAccNum;

		nextAccNum++;

	}

	public static String bill(String name, int accountNum, double amount) {

		String amountString = String.valueOf(amount);
		String amountTester = "";
		for (int i = 0; i < amountString.length(); i++) {
			if (amountString.charAt(i) == '.') {
				if (amountString.charAt(i + 1) != '0') {
					amountString += 0;
					amountTester = amountString.substring(i, amountString.length() - 1);
				}

				if (amountTester.length() >= 3) {
					amountString = amountString.substring(0, amountString.length() - 1);
				}

			}
		}

		return (name + ", account number " + accountNum + ", please pay $" + amountString);
	}

	public static int nextAccount() {

		return nextAccNum;

	}

	public void updateName(String name)

	{

		this.name = name;

	}

	public static void main(String[] args) {

		System.out.println(bill("Jeremiah", 3, 50.50));

	}

}