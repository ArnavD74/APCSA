import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
        Random r = new Random();
		System.out.println("Play this lottery it will make you rich!");
		System.out.println("");
		System.out.println(r.nextInt(49) + 1 + ",");
        System.out.println(r.nextInt(49) + 1 + ",");
        System.out.println(r.nextInt(49) + 1 + ",");
        System.out.println(r.nextInt(49) + 1 + ",");
        System.out.println(r.nextInt(49) + 1 + ",");
        System.out.println(r.nextInt(49) + 1 + ",");
        System.out.println(r.nextInt(49) + 1 + ".");
		
	}
	
}
