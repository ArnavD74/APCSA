import java.util.Random;

public class GameSpinner {
	private int sectors;
	private int count = 0;
	private int spin = 0;

	public GameSpinner(int sectors) {
		this.sectors = sectors;
	}

	public int currentRun() {
		return count;
	}

	public int spin() {
		Random r = new Random();
		int random = (int) (r.nextInt((sectors - 1) + 1) + 1);
		if (random == spin)
			count++;
		else
			count = 1;
		spin = random;
		return random;
	}

	public static void main(String[] args) {
		GameSpinner g = new GameSpinner(4);
		System.out.println("Run: " + g.currentRun());
		System.out.println("Spin: " + g.spin());
		System.out.println("Run: " + g.currentRun());
		System.out.println("Spin: " + g.spin());
		System.out.println("Run: " + g.currentRun());
		System.out.println("Spin: " + g.spin());
		System.out.println("Run: " + g.currentRun());
		System.out.println("Spin: " + g.spin());
		System.out.println("Run: " + g.currentRun());
		System.out.println("Spin: " + g.spin());
		System.out.println("Spin: " + g.spin());
		System.out.println("Spin: " + g.spin());
		System.out.println("Run: " + g.currentRun());
	}

}