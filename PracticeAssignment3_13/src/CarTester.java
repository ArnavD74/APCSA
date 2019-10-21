
public class CarTester {

	public static void main(String[] args) {

		Car jeep = new Car(50); //initialize car with 50 Miles per gallon
		jeep.addGas(100); //add 100 gallons to tank
		System.out.println(jeep.getGasInTank());
		jeep.drive(40); //drive 40 miles
		System.out.println(jeep.getGasInTank());

	}

}
