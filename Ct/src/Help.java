public class Help

{

	private int h;

	public Help(int newH)

	{

		h = newH;

	}

	public int getH()

	{

		return h;

	}
	
	public static void main(String[] args) {
		
		Help h1 = new Help(5);

		int x = h1.getH();

		System.out.println(x);
		
	}

}