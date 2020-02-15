import java.util.ArrayList;
import java.util.List;

public class Main {
	
	private static List<Integer> nums = new ArrayList<Integer>();


	public static void numQuest() {
		
		nums.add(0);
		nums.add(0);
		nums.add(4);
		nums.add(2);
		nums.add(5);
		nums.add(0);
		nums.add(3);
		
		int k = 0;
		Integer zero = new Integer(0);
		
		while (k < nums.size()) {
			if (nums.get(k).equals(zero))
				nums.remove(k);
			
			else k++;
		}
	}
	
	public static void main(String[] args) {
		
		numQuest();
		System.out.println(nums);
		
	}
	
}
