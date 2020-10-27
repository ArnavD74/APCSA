import java.util.*;

public class ConnectFour {

	/**
	 * @author Arnav Dashaputra
	 * @version 1.0
	 * @since 2020-06-06
	 * 
	 *         If the game is not displaying dots in a grid correctly, please set
	 *         change the commenting defining the public static string dot.
	 */

	public static boolean displaysCorrectly = true;
	
	public static String dot = "•";
	//public static String dot = " ";

	public static void newGame(String[][] game) {
		for (int row = 0; row < game.length; row++)
			for (int column = 0; column < game[0].length; column++)
				if (displaysCorrectly == true) {
					game[row][column] = dot;
				} else if (displaysCorrectly == false) {
					game[row][column] = " ";
				}
	}

	public static void generate(String[][] game) {
		System.out.println(" 1 2 3 4 5 6 7");
		System.out.println("_______________");
		for (int row = 0; row < game.length; row++) {
			System.out.print("|");
			for (int column = 0; column < game[0].length; column++) {
				System.out.print(game[row][column]);
				System.out.print("|");
			}
			System.out.println();
			System.out.println("̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅");
		}
		System.out.println();
	}

	public static boolean checkEntry(int column, String[][] game) {
		if (column < 0 || column > game[0].length)
			return false;
		if (game[0][column] != dot)
			return false;
		return true;
	}

	public static boolean checkWinner(String player, String[][] game) {
		// L/R Across
		for (int row = 0; row < game.length; row++) {
			for (int column = 0; column < game[0].length - 3; column++) {
				if (game[row][column] == player && game[row][column + 1] == player && game[row][column + 2] == player
						&& game[row][column + 3] == player) {
					return true;
				}
			}
		}
		// U/D Vertical
		for (int row = 0; row < game.length - 3; row++) {
			for (int column = 0; column < game[0].length; column++) {
				if (game[row][column] == player && game[row + 1][column] == player && game[row + 2][column] == player
						&& game[row + 3][column] == player) {
					return true;
				}
			}
		}
		// L/R Diag
		for (int row = 3; row < game.length; row++) {
			for (int column = 0; column < game[0].length - 3; column++) {
				if (game[row][column] == player && game[row - 1][column + 1] == player
						&& game[row - 2][column + 2] == player && game[row - 3][column + 3] == player) {
					return true;
				}
			}
		}
		// R/L Diag
		for (int row = 0; row < game.length - 3; row++) {
			for (int column = 0; column < game[0].length - 3; column++) {
				if (game[row][column] == player && game[row + 1][column + 1] == player
						&& game[row + 2][column + 2] == player && game[row + 3][column + 3] == player) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int rows = 6;
		int columns = 7;
		int turn = 1;
		String player = "X";
		String playerNumber = "Player 1";
		boolean isWinner = false;
		String[][] game = new String[rows][columns];
		newGame(game);
		while (isWinner == false && turn <= rows * columns) {
			boolean validPlay;
			int play;
			do {
				generate(game);
				System.out.println(playerNumber + ", please enter a column, from 1 to " + columns + ".");
				play = in.nextInt() - 1;
				validPlay = checkEntry(play, game);
			} while (validPlay == false);

			for (int row = game.length - 1; row >= 0; row--) {
				if (game[row][play] == dot) {
					game[row][play] = player;
					break;
				}
			}

			isWinner = checkWinner(player, game);

			if (player == "X") {
				player = "O";
				playerNumber = "Player 2";
			} else {
				player = "X";
				playerNumber = "Player 1";
			}

			turn++;
		}
		generate(game);

		if (isWinner) {
			if (player == "X") {
				System.out.println("The winner is: Player 2 ");
			} else {
				System.out.println("The winner is: Player 1");
			}
		} else {
			System.out.println("Tie!");
		}

	}
}