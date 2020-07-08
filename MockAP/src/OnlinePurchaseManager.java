import java.util.ArrayList;

public class OnlinePurchaseManager {

	private static ArrayList<Gizmo> purchases = new ArrayList<Gizmo>();

	public int countElectronicsByMaker(String maker) {
		int counter = 0;
		for (int i = 0; i < purchases.size(); i++) {
			if (purchases.get(i).getMaker().contentEquals(maker) && purchases.get(i).isElectronic() == true) {
				counter++;
			}
		}
		return counter;
	}

	public boolean hasAdjacentEqualPair() {
		boolean checker = false;
		for (int i = 0; i < purchases.size() - 1; i++) {
			if (purchases.get(i).getMaker().contentEquals(purchases.get(i + 1).getMaker())
					&& purchases.get(i).isElectronic() == purchases.get(i + 1).isElectronic()) {
				checker = true;
				i = purchases.size();
			}
		}
		return checker;
	}

	public Gizmo getCheapestGizmoByMaker() {

		Gizmo cheapestGizmoCounter = purchases.get(0);

		for (int i = 0; i < purchases.size(); i++) {
			if (purchases.get(i).getPrice() > purchases.get(i + 1).getPrice()) {
				cheapestGizmoCounter = purchases.get(i + 1);
			}
		}

		return cheapestGizmoCounter;

	}

	public static void main(String[] args) {

		Gizmo a = new Gizmo("ABC", true);
		Gizmo b = new Gizmo("ABC", false);
		Gizmo c = new Gizmo("XYZ", true);
		Gizmo d = new Gizmo("lmnop", false);
		Gizmo e = new Gizmo("ABC", true);
		Gizmo f = new Gizmo("ABC", false);

		OnlinePurchaseManager.purchases.add(a);
		OnlinePurchaseManager.purchases.add(b);
		OnlinePurchaseManager.purchases.add(c);
		OnlinePurchaseManager.purchases.add(d);
		OnlinePurchaseManager.purchases.add(e);
		OnlinePurchaseManager.purchases.add(f);

		System.out.println(countElectronicsByMaker("XYZ"));
		System.out.println(hasAdjacentEqualPair());

	}

}