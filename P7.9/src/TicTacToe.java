import java.util.Scanner;

public class TicTacToe {

	public static int rows = 3;
	public static int columns = 3;
	public static String[][] array = new String[rows][columns];
	public static String player1;
	public static String player2;
	public static String free = "·";
	public static winner winner = null;

	public enum winner {
		player1, player2, none;
	}

	@SuppressWarnings("static-access")
	public static winner checkScore(String[][] array) {

		winner = winner.none;

		if (array[0][0].equals(array[1][1]) && array[1][1].equals(array[2][2])) { // diag1 L-R
			if (array[0][0].equals("O"))
				winner = winner.player1;
			else if (array[0][0].equals("X"))
				winner = winner.player2;
		}
		if (array[2][0].equals(array[1][1]) && array[1][1].equals(array[0][2])) { // diag2 R-L
			if (array[2][0].equals("O"))
				winner = winner.player1;
			else if (array[2][0].equals("X"))
				winner = winner.player2;
		}
		if (array[0][0].equals(array[0][1]) && array[0][1].equals(array[0][2])) {
			if (array[0][0].equals("O"))
				winner = winner.player1;
			else if (array[0][0].equals("X"))
				winner = winner.player2;
		}
		if (array[1][0].equals(array[1][1]) && array[1][1].equals(array[1][2])) {
			if (array[1][0].equals("O"))
				winner = winner.player1;
			else if (array[1][0].equals("X"))
				winner = winner.player2;
		}
		if (array[2][0].equals(array[2][1]) && array[2][1].equals(array[2][2])) {
			if (array[2][0].equals("O"))
				winner = winner.player1;
			else if (array[2][0].equals("X"))
				winner = winner.player2;
		}
		if (array[0][0].equals(array[1][0]) && array[1][0].equals(array[2][0])) {
			if (array[0][0].equals("O"))
				winner = winner.player1;
			else if (array[0][0].equals("X"))
				winner = winner.player2;
		}
		if (array[0][1].equals(array[1][1]) && array[1][1].equals(array[2][1])) {
			if (array[0][1].equals("O"))
				winner = winner.player1;
			else if (array[0][1].equals("X"))
				winner = winner.player2;
		}
		if (array[0][2].equals(array[1][2]) && array[1][2].equals(array[2][2])) {
			if (array[0][2].equals("O"))
				winner = winner.player1;
			else if (array[0][2].equals("X"))
				winner = winner.player2;
		}

		return winner;

	}

	public static void inBounds(int turn, String opponent) {
		if (turn < 0 || turn > rows - 1 || turn > columns - 1) {
			System.out.println(("Your input is invalid. " + opponent + " wins."));
			System.exit(0);
		}
	}

	public static void printScore(String[][] array) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
	}

	@SuppressWarnings("static-access")
	public static boolean checkWinner(String[][] array) {

		if (winner == winner.player1) {
			System.out.println(player1 + " wins!");
			return true;
		} else if (winner == winner.player2) {
			System.out.println(player2 + " wins!");
			return true;
		} else
			return false;
	}

	public static void initialize(Scanner in) {

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = free;
			}
		}

		System.out.println("Welcome to Tic-Tac-Toe.");
		System.out.println("\"" + free + "\" represents a free space.");
		System.out.println("If you do not take a free space, you lose.");

		System.out.println("\nWhat is player 1's name?");
		player1 = in.nextLine();

		System.out.println("\nWhat is player 2's name?");
		player2 = in.nextLine();
	}

	public static void turn(String currentTurn, Scanner in) {

		String player = " ";
		String opponent = " ";
		if (currentTurn.equals("O")) {
			player = player1;
			opponent = player2;
		} else if (currentTurn.equals("X")) {
			player = player2;
			opponent = player1;
		}

		System.out.println("\n" + player + ", make your turn. You are " + currentTurn
				+ ". \nPlease enter the coordinate's X value. (0-2)");

		int turnX = in.nextInt();
		inBounds(turnX, opponent);
		System.out.println("Now enter the coordinate's Y value. (0-2)");
		int turnY = in.nextInt();
		inBounds(turnY, opponent);

		if (array[turnX][turnY].equals(free))
			array[turnX][turnY] = currentTurn;

		else {
			System.out.println("That spot is taken. You lose.");
			System.out.println(opponent + " is the winner!");
			System.exit(0);
		}

		System.out.println(checkWinner(array));
		
		if (checkWinner(array) == true)
			System.exit(0);
		printScore(array);
	}

	public static void playGame(Scanner in) {
		String currentTurn = " ";

		for (int i = 0; i < rows * columns; i++) {
			if (i % 2 == 0)
				currentTurn = "O";
			else
				currentTurn = "X";
			turn(currentTurn, in);
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		initialize(in);
		playGame(in);
		System.out.println("Tie Game!");

	}
}