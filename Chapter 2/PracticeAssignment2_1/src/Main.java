
public class Main {

	public static void main(String[] args) {
		
		String state = ("Mississippi");
		int character = state.length();
		System.out.println("Length of " + state + " is " + character);
		
		state = state.replace("i", "ii");
		character = state.length();
		System.out.println("Length of " + state + " is " + character);
		
		state = state.replace("ss", "s");
		character = state.length();
		System.out.println("Length of " + state + " is " + character);
		
	}
	
}
