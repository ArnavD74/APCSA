
public class ProductPrinter {

	public static void main(String[] args) {
		
		Product p = new Product("Toaster", 29.95);
		System.out.println("Product - " + p.getName());
		System.out.printf("Price - $%.2f\n", p.getPrice());
		System.out.printf("Sale Price - $%.2f\n", p.reduceprice(5.00));
		
		Product c = new Product("Computer", 535.5);
		System.out.println("Product - " + c.getName());
		System.out.printf("Price - $%.2f\n", c.getPrice());
		System.out.printf("Sale Price - $%.2f\n", c.reduceprice(30.7));
	}
	
}
