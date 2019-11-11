
public class Product {

	private double price;
	private String product;

	public Product(String product, double price) {
		this.product = product;
		this.price = price;
	}

	public String getName() {
		return product;
	}

	public double getPrice() {
		return price;
	}

	public double reduceprice(double discount) {
		price = price - discount;
		return price;
	}
}
