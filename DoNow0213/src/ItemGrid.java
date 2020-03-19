public class ItemGrid {

	private static int rows = 3;
	private static int columns = 4;
	private static Item[][] grid = new Item[rows][columns];

	public static boolean isValid(int xPos, int yPos) {

		return xPos >= 0 && yPos >= 0 && xPos < rows && yPos < columns;

	}

	public static String mostValuableNeighbor(int r, int c) {

		Item highest = grid[r][c];

		for (int currentC = c - 1; currentC <= c + 1; currentC++) {

			if (isValid(r, currentC)) {

				if (grid[r][currentC].getValue() > highest.getValue()) {

					highest = grid[r][currentC];
				}
			}
		}

		return highest.getName();
	}

	public static double findAverage() {

		double total = 0;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				total += grid[i][j].getValue();
			}
		}

		total /= rows * columns;
		return total;

	}

	public static void main(String[] args) {

		Item item1 = new Item("acorn", 7);
		Item item2 = new Item("book", 10);
		Item item3 = new Item("carrot", 8);
		Item item4 = new Item("desk", 9);
		Item item5 = new Item("egg", 5);
		Item item6 = new Item("flag", 8);
		Item item7 = new Item("globe", 8);
		Item item8 = new Item("harp", 9);
		Item item9 = new Item("island", 7);
		Item item10 = new Item("jacket", 19);
		Item item11 = new Item("kale", 8);
		Item item12 = new Item("lunch", 16);
		grid[0][0] = item1;
		grid[0][1] = item2;
		grid[0][2] = item3;
		grid[0][3] = item4;
		grid[1][0] = item5;
		grid[1][1] = item6;
		grid[1][2] = item7;
		grid[1][3] = item8;
		grid[2][0] = item9;
		grid[2][1] = item10;
		grid[2][2] = item11;
		grid[2][3] = item12;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(grid[i][j].getName() + "=");
				System.out.print(grid[i][j].getValue() + " ");
			}
			System.out.println();
			System.out.println();
		}

		System.out.println("0,2 should be book and is: " + mostValuableNeighbor(0, 2));
		System.out.println("1,1 should be flag and is: " + mostValuableNeighbor(1, 1));
		System.out.println("2,0 should be jacket and is: " + mostValuableNeighbor(2, 0));
		System.out.println("2,3 should be lunch and is: " + mostValuableNeighbor(2, 3));

		System.out.println("Average: " + findAverage());

	}

}