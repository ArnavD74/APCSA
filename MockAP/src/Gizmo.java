public class Gizmo {

	private String name;
	private boolean isElectronic;
	private double price;

	public Gizmo(String name, boolean isElectronic) {
		this.name = name;
		this.isElectronic = isElectronic;
	}
	
	public Gizmo(String name, boolean isElectronic, double price) {
		this.name = name;
		this.isElectronic = isElectronic;
		this.price = price;
	}

	public String getMaker() {
		return name;
	}

	public boolean isElectronic() {
		return isElectronic;
	}
	
	public double getPrice() {
		return price;
	}

	//public boolean equals(Object other) {
	// }

}