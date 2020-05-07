import java.util.ArrayList;

public class ReviewCollector1 {

	private ArrayList<ProductReview> reviewList;
	private ArrayList<String> productList;

	public ReviewCollector1() {
		reviewList = new ArrayList<ProductReview>();
		productList = new ArrayList<String>();
	}

	public void addReview(ProductReview prodReview) {
		int counter = 0;
		reviewList.add(prodReview);

		for (String i : productList) {
			if (i.equals(prodReview.getName())) {
				counter++;
			}
		}

		if (counter == 0) {
			productList.add(prodReview.getName());
		}
	}

	public int getNumGoodReviews(String prodName) {
		int counter = 0;
		for (ProductReview i : reviewList) {
			if (i.getName().equals(prodName)) {
				for (int j = 0; j < i.getReview().length() - 4; j++) {
					if (i.getReview().substring(j, j + 4).equals("best")) {
						counter++;
					}
				}
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		ReviewCollector1 a = new ReviewCollector1();

		a.addReview(new ProductReview("apple", "best thing"));
		a.addReview(new ProductReview("icecream", "the best thing eva"));
		a.addReview(new ProductReview("pear", "yummy"));
		a.addReview(new ProductReview("orange", "bestest thing in the world"));
		a.addReview(new ProductReview("apple", "best thing"));

		System.out.println(a.getNumGoodReviews("apple"));

	}

}