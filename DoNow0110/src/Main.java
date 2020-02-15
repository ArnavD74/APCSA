import java.util.Arrays;

public class Main {
	
	
	public static int getBalance(String[] users, int element) {
		
		int balance = Integer.parseInt(users[element]);
		
		return balance;
	}
	
	public static void setBalance(String[] input, int element, String balance) {
		
		input[element] = balance;
		
	}
	
	public static int findHighest(String[] input) {
		
		int currentHighest = 50;
		
		int[] balances = new int[4];
		
		balances[0] = Integer.parseInt(input[1]);
		balances[1] = Integer.parseInt(input[3]);
		balances[2] = Integer.parseInt(input[5]);
		balances[3] = Integer.parseInt(input[7]);
		//balances[4] = Integer.parseInt(input[9]);
		
		for (int i = 0; i < balances.length - 1; i++) {
			
			if ((balances[i]) > (balances[i+1])) {
				
				currentHighest = balances[i];
				
			}
			

			return currentHighest;
					
		}
		return 500;
		
		
	}

	public static void main(String[] args) {	
		
		String[] users = new String[10];
		
		Bankaccount[] bankaccount = new Bankaccount[10];
		
		users[0] = "John"; 
		users[1] = "123";
		users[2] = "Mary";
		users[3] = "456";
		users[4] = "456";
		users[5] = "456";
		users[6] = "456";
		users[7] = "456";
		users[8] = "456";
		users[9] = "456";


		
		findHighest(users);
		
		bankaccount[0] = new Bankaccount("Mary");
		
		System.out.println(findHighest(users));
		
	}
	
}
