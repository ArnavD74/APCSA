import java.util.ArrayList;
import java.util.Arrays;

public class u6 {

	public static void mystery(ArrayList<Integer> nums) {
		for (int k = 0; k < nums.size(); k++) {
			if (nums.get(k).intValue() == 0) {
				nums.remove(k);
			}
		}
	}

	public static void main(String[] args) {
		int count = 0;

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(0);

		nums.add(0);

		nums.add(4);

		nums.add(2);

		nums.add(5);

		nums.add(0);

		nums.add(3);

		nums.add(0);

		mystery(nums);
		
		System.out.println(nums);
	}

}
