import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter max number: ");
		int input = in.nextInt();

		String end = " ";
		boolean prime;
		
		for (int sequence = 2; sequence <= input; sequence++) {
			
			prime = true;

			for (int i = 2; i <= sequence / 2; i++) {

				if (sequence % i == 0 || sequence == 0)
					prime = false;
			}
			
			


			if (prime == true) {
				end = (sequence + ", ");
				System.out.print(end);

//				if (end.charAt(end.length() - 1) == ',') {
//					
//					end = end.substring(0, end.length() - 1);
//					System.out.println(end);
//				}
				
			}	
		}

	}

}
