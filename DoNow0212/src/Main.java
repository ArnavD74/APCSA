import java.util.ArrayList;

public class Main {

	public static int rows = 3;
	public static int columns = 2;
	public static BankAccount[][] array = new BankAccount[rows][columns];

	public static String getAccount(int accountNumber) {

		String name = "No account found";

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				if (array[i][j].getAccountNumber() == accountNumber) {
					return array[i][j].getName();
				}

			}
		}

		return name;

	}

	public static String highestBalance() {

		String name = "Error";
		int counter = array[0][0].getBalance();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (array[i][j].getBalance() > counter) {
					name = array[i][j].getName();
					return name;
				}
			}
		}

		return name;

	}

	public static ArrayList<BankAccount> depositHigherThan(int value) {

		ArrayList<BankAccount> greater = new ArrayList<>();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (array[i][j].getBalance() > value) {
					greater.add(array[i][j]);
				}
			}
		}

		return greater;

	}

	public static void main(String[] args) {

		BankAccount user1 = new BankAccount("Tom", 1, 50);
		BankAccount user2 = new BankAccount("Rohit", 2, 400);
		BankAccount user3 = new BankAccount("Arnav", 3, 350);
		BankAccount user4 = new BankAccount("Sanj", 4, 100);
		BankAccount user5 = new BankAccount("Ruchitha", 5, 275);
		BankAccount user6 = new BankAccount("Justin", 6, 300);

		array[0][0] = user1;
		array[0][1] = user2;
		array[1][0] = user3;
		array[1][1] = user4;
		array[2][0] = user5;
		array[2][1] = user6;

		System.out.println("Bank account number 1: " + getAccount(1));
		System.out.println("Bank account number 2: " + getAccount(2));
		System.out.println("Bank account number 3: " + getAccount(3));
		System.out.println("Bank account number 4: " + getAccount(4));
		System.out.println("Bank account number 5: " + getAccount(5));
		System.out.println("Bank account number 6: " + getAccount(6));
		System.out.println("Bank account number 7: " + getAccount(7));

		System.out.println();
		System.out.println("Bank account with highest balance: " + highestBalance());

		System.out.println();

		System.out.println("Bank account holders with a balance of over 200: ");
		for (int i = 0; i < depositHigherThan(200).size(); i++) {
			System.out.println(depositHigherThan(200).get(i).getName());
		}

	}

}
