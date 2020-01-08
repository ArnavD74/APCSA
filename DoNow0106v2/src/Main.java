import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random r = new Random();
		int[] array = new int[10];
		
		for (int i = 0; i < 10; i++) {

			array[i] = r.nextInt(100);

		}
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print((i != 9) ? (array[i] + ", ") : (array[i]));
		}
		
	}
	
}
