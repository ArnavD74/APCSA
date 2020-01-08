//		Scanner in = new Scanner(System.in);
//		System.out.println("Please enter the desired combination");
//		String answer = in.nextLine(); //6666
//		
//		System.out.println("Please enter the current combination");
//		String current = in.nextLine(); //4444
//		
//		for (int i = 0; i <= 3; i++) {
//			
//			String cPos = current.substring(i, i+1);
//			int currentPos = Integer.parseInt(cPos);
//			System.out.println(currentPos);


import java.util.*;

public class Main {

	public static void main(String[] args) {

		System.out.println("Please enter an integer followed by a space four times.");
		
		int[] lock = { 5, 7, 1, 4 };
		int[] input = new int[4];

		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			input[i] = in.nextInt();
		}
		

//		String answer = in.nextLine(); //6666
//		
//		System.out.println("Please enter the current combination");
//		String current = in.nextLine(); //4444
//		
//		for (int i = 0; i <= 3; i++) {
//			
//			String cPos = current.substring(i, i+1);
//			int currentPos = Integer.parseInt(cPos);
//			System.out.println(currentPos);

		int correct = 0;
		int up = 0;
		int down = 0;

		for (int i = 0; i < 4; i++) {
			if (lock[i] == input[i])
				correct++;
			
			else if (lock[i] > input[i]) {

				up = Math.abs(lock[i] - input[i]);
				down = Math.abs(((9 - lock[i]) + input[i]) % 10);
				if (up == down)
					System.out.println("Ring " + (i + 1) + ": Twist up or down " + down + " times");
				else
					System.out.println("Ring " + (i + 1) + ": Twist " + (up > down ? "down " : "up ")
							+ Math.min(up, down) + " times");

			} else {
				down = Math.abs(lock[i] - input[i]);
				up = Math.abs(((9
						- input[i]) + lock[i]) % 10);

				if (up == down)
					System.out.println("Ring " + (i + 1) + ": Twist up or down " + down + " times");
				else
					System.out.println("Ring " + (i + 1) + ": Twist " + (up > down ? "down " : "up ")
							+ Math.min(up, down) + " times");
			}

		}
		if (correct == 4)
			System.out.println("Lock Opened");

	}
}
