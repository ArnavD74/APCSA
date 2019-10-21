
public class Car {

	private double gasInTank;
	private double fuelEfficiency;

	public Car(double mpg) {
		this.fuelEfficiency = mpg;
	}

	public double getGasInTank() {
		return this.gasInTank;
	}

	public void addGas(double addedGas) {
		gasInTank = gasInTank + addedGas;
	}

	public void drive(double distance) {
		gasInTank = gasInTank - (distance / fuelEfficiency);
	}

}
