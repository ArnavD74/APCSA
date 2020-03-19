
public class Balloon {

	private double pi = Math.PI;
	public double radius = 0;

	public void balloon() {
		radius = 0;
	}

	public void inflate(double multiplier) {

		radius = radius + multiplier;

	}

	public String getVolume() {

		double volume = ((4 / 3) * pi * radius * radius * radius);
		String msg = ("Volume = " + volume);
		return msg;
	}

}
