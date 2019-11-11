
public class BugTester {

	public static void main(String[] args) {
		Bug b = new Bug(10);
		b.move();
		b.move();
		b.turn("turn");
		b.move();
		System.out.println(b.getPosition());
	}

}
