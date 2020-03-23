
public class Main {

	public static boolean isLatin(int[][] square) {
		
		if (!containsDuplicates(square[0])) { //if the array contains duplicates
			
			for (int i = 0; i < square.length; i++) {
				
				if (!hasAllValues(square[0], square[i])) { //test if the values of row 0 appear in all columns once
					return false;
				}
				
				else if (!hasAllValues(square[0], getColumn(square, i))) {
					return false;
				}
			}
			
			return true;
		}
	}

	
	
	
	
	private static int[] getColumn(int[][] square, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private static boolean hasAllValues(int[] is, int[] is2) {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean containsDuplicates(int[] is) {
		// TODO Auto-generated method stub
		return false;
	}

}
