public class Main {

	public static String findHighest(int element, BankAccount[] bank) {

		int currentHighest = 0;
		String input = "";

		for (int i = 0; i < bank.length; i++) {

			int temp = bank[i].getValue();

			if (temp >= currentHighest) {

				input = bank[i].getName();

			}

		}

		return input;
	}

	public static void main(String[] args) {

		BankAccount[] bankAccount = new BankAccount[10];

		bankAccount[0] = new BankAccount("Kalyan", 100);
		bankAccount[1] = new BankAccount("Rohit", 200);
		bankAccount[2] = new BankAccount("Thomas", 300);
		bankAccount[3] = new BankAccount("Arnav", 999);
		bankAccount[4] = new BankAccount("Sanjna", 400);
		bankAccount[5] = new BankAccount("Ruchitha", 500);
		bankAccount[6] = new BankAccount("Justin", 600);
		bankAccount[7] = new BankAccount("Parthiv", 700);
		bankAccount[8] = new BankAccount("Bob", 800);
		bankAccount[9] = new BankAccount("Man", 900);

		System.out.println("Current highest value is: " + findHighest(0, bankAccount));

	}
}