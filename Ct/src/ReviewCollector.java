import java.util.ArrayList;

public class ReviewCollector {

	private ArrayList<ProductReview> reviewList;
	private ArrayList<String> productList;

	public ReviewCollector() {
		reviewList = new ArrayList<ProductReview>();
		productList = new ArrayList<String>();
	}

	public void addReview(ProductReview prodReview) {
		reviewList.add(prodReview);
		boolean var = false;

		int index = 0;
		boolean check = true;

		while (var == false && check == true) {

			for (int i = 0; i < productList.size(); i++) {

				if (index == productList.size()) {
					check = false;
				}
			}

			if (productList.get(index).equals(prodReview.getName())) {
				var = true;
			}

			index++;
		}

		if (var == false)
			productList.add(prodReview.getName());
	}

	public int getNumGoodReviews(String prodName) {
		int counter = 0;
		for (int i = 0; i < reviewList.size(); i++) {
			if ((reviewList).get(i).getName().equals(prodName)) {
				String review = reviewList.get(i).getReview();

				for (int j = 0; j < review.length() - 4; j++) {
					if (review.substring(j, j + 4).equals("best")) {
						counter++;
					}
				}
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		ReviewCollector r = new ReviewCollector();
		r.addReview(new ProductReview("chocolate", "chocolate is the best"));
		r.addReview(new ProductReview("chocolate", "chocolate is the yum"));
		r.addReview(new ProductReview("pancake", "pancakes are the best"));

		System.out.println(r.getNumGoodReviews("chocolate"));

	}

}