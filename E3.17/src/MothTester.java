
public class MothTester {

	public static void main(String[] args) {
		Moth m = new Moth(10);
		m.moveToLight(0);
		System.out.println(m.getPosition());
		System.out.println("Expected: 5.0");
		m.moveToLight(10);
		System.out.println(m.getPosition());
		System.out.println("Expected: 7.5");
		m.moveToLight(0);
		System.out.println(m.getPosition());
		System.out.println("Expected: 3.75");
	}

}
