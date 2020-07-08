import java.util.ArrayList;

public class ReviewCollector

{

	private ArrayList<ProductReview> reviewList = new ArrayList<ProductReview>();
	private ArrayList<String> productList = new ArrayList<String>();

	public ReviewCollector() {
		reviewList = new ArrayList<ProductReview>();
		productList = new ArrayList<String>();
	}

	public void addReview(ProductReview prodReview) {
		reviewList.add(prodReview);

		boolean exists = false;
		String productName = prodReview.getName();

		for (int i = 0; i < productList.size(); i++) {
			if (productList.get(i).equals(productName)) {
				exists = true;
			}
		}

		if (exists = false) {
			productList.add(productName);
		}

	}

	public int getNumGoodReviews(String prodName) {
		int counter = 0;
		for (int i = 0; i < prodName.length(); i++) {
			if (prodName.substring(i, i + 4).equals("best")) {
				counter++;
			}
		}
		return counter;

	}

}