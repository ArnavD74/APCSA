import java.util.ArrayList;

public class MasterOrder {

	private static ArrayList<CookieOrder> orders;

	public MasterOrder() {
		orders = new ArrayList<CookieOrder>();
	}

	public void addOrder(CookieOrder theOrder) {
		orders.add(theOrder);
	}

	public int getTotalBoxes() {
		int total = 0;
		for (int i = 0; i < orders.size(); i++) {
			total += orders.get(i).getNumBoxes();
		}
		return total;
	}

	public int removeVariety(String cookieVar) {
		int counter = 0;
		for (int i = orders.size() - 1; i >= 0; i--) {
			if (orders.get(i).getVariety().equals(cookieVar)) {
				orders.remove(i);
				counter += orders.get(i).getNumBoxes();
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		boolean test1 = false;
		boolean test2 = false;

		MasterOrder order = new MasterOrder();

		if (order.getTotalBoxes() == 0) {
			test1 = true;
		}

		else {
			System.out.println("error 1");
		}

		order.addOrder(new CookieOrder("Raisin", 3));
		order.addOrder(new CookieOrder("Chocolate", 7));
		order.addOrder(new CookieOrder("Toffee", 1));


		if (order.getTotalBoxes() == 11) {
			test2 = true;
		}
		else
			System.out.println("error 2");

		if (test1 && test2)
			System.out.println("Completed");
		else
			System.out.println("error 12");

	}

}
