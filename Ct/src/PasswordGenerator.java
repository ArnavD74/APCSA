import java.util.Random;

public class PasswordGenerator {
	private int length;
	private String prefix;
	public static int counter;

	public PasswordGenerator(int length, String prefix) {
		this.length = length;
		this.prefix = prefix;
	}

	public PasswordGenerator(int length) {
		this.length = length;
		prefix = "A";
	}

	public String pwGen() {
		Random r = new Random();
		String password = prefix + ".";

		for (int i = 0; i < length; i++)
			password += Integer.toString(r.nextInt(10));
		counter++;
		return password;
	}

	public int getCount() {
		return counter;
	}

	public static void main(String[] args) {
		PasswordGenerator generator = new PasswordGenerator(4, "chs");
		System.out.println(generator.getCount());
		System.out.println(generator.pwGen());
		System.out.println(generator.pwGen());
		System.out.println(generator.getCount());

		PasswordGenerator generator2 = new PasswordGenerator(6);
		System.out.println(generator2.getCount());
		System.out.println(generator2.pwGen());
		System.out.println(generator2.getCount());
		System.out.println(generator.getCount());
	}

}