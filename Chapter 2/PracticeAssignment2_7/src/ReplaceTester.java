
public class ReplaceTester {

	public static void main(String[] args) {
		
		String state = ("Mississippi");
		System.out.println("The original string is: " + state);
		
	    state = state.replace('i', '!'); 
	    state = state.replace('s', '$'); 

		System.out.println("The new string is: " + state);

		
	}
	
}
