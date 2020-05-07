import java.util.ArrayList;

public class u7 {

	public static boolean inCommon(ArrayList<Integer> a, ArrayList<Integer> b)

	{

		for (int i = 0; i < a.size(); i++)

		{

			for(int j = b.size() - 1; j > 0; j--) // Line 5

			{

				if (a.get(i).equals(b.get(j)))

				{

					return true;

				}

			}

		}

		return false;

	}

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList();
		ArrayList<Integer> b = new ArrayList();

		a.add(10);
		a.add(20);
		a.add(30);

		b.add(40);
		b.add(50);
		b.add(10);

		System.out.println(inCommon(a, b));

	}

}
