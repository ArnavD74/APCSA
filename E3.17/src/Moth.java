
public class Moth {

	private double location;

	public Moth(double location) {
		this.location = location;
	}

	public void moveToLight(double light) {
		location = location + (light - location) / 2;
	}

	public double getPosition() {
		return location;
	}
}