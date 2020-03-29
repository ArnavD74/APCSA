public class Customer {

	private String name;
	private int idNum;

	public Customer(String name, int idNum) {
		this.name = name;
		this.idNum = idNum;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return idNum;
	}

	public int compareCustomer(Customer C) { //part A
		int check = name.compareTo(C.getName());
		if (check != 0)
			return check;
		else {
			if (C.getId() < getId())
				return C.getId() - getId();
			else
				return getId() - C.getId();
		}
	}

	public static void prefixMerge(Customer[] list1, Customer[] list2, Customer[] result) { //part B
		int counter1 = 0, counter2 = 0;

		for (int i = 0; i < result.length; i++) {
			int check = list1[counter1].compareCustomer(list2[counter2]);
			if (check < 0) {
				result[i] = list1[counter1];
				counter1++;
			} 
			
			else if (check > 0) {
				result[i] = list2[counter2];
				counter2++;
			} 
			
			else if (check == 0) {
				result[i] = list1[counter1];
				counter1++;
				counter2++;
			}
		}
	}
}