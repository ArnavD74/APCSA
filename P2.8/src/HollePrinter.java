
public class HollePrinter {

	public static void main(String[] args) {
		
		String world = ("Hello, World!");
		
		world = world.replace("e", "X");
		world = world.replace("o", "e");
		world = world.replace("X", "o");

		
		System.out.println(world);


		
	}
	
}
