public class TestClass

{

	public static int addItUp(int m, int n)

	{

		int sum = 0;

		for (int j = m; j <= n; j++)

		{

			sum += j;

		}

		return sum;

	}
	
	public static void main(String[] args) {
		
		
		System.out.println(addItUp(-5, 2));
		
	}

}