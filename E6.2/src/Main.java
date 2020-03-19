import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
//		String input1 = in.nextLine();
//		int oddCount = 0;
//		int evenCount = 0;
//		
//		
//		for (int i=0; i<=input1.length() - 1; i++) {
//			
//			String x = input1.substring(i, i+1);
//			
//			if (Integer.parseInt(x) % 2 == 0) {
//				evenCount = evenCount + 1;
//			}
//			
//			else if (Integer.parseInt(x) % 2 != 0) {
//				oddCount = oddCount + 1;
//			}
//			
//		}
//		
//		
//		System.out.println("There are " + oddCount + " odd numbers and " + evenCount + " even numbers.");
//		
//		
//		//part d
		
		String inputd = in.nextLine();
		String x = "";
		
		for (int i = 0; i < inputd.length(); i++) {
			int nextposition = 0;
			int currentposition = (int) (inputd.charAt(i));
			if(i<inputd.length()-1) {
				nextposition = (int) (inputd.charAt(i + 1));
			}	
			
			if (currentposition == nextposition) {
				x = x + currentposition;
			}
			
			else x = x + 0;
			
		}
		
		System.out.println(x);
	}
	
	
}
