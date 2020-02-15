import java.util.Scanner;

public class TicTacToe {

	public static int rows = 3;
	public static int columns = 3;

	public static String inBounds(int turn) {

		String reply = " ";

		if (turn > 2 || turn < 0) {
			reply = ("Your input is invalid.");
		}

		return reply;
	}

	public static void printScore(String[][] array) {

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static int checkScore(String[][] array) {

		int winner = 0;
		// if winner = 1; player 1 wins (circles)
		// if winner = 2; player 2 wins (crosses)

		// diag1 L-R
		if (array[0][0].equals(array[1][1]) && array[1][1].equals(array[2][2])) {

			if (array[0][0].equals("O")) {
				return 1;
			}

			else if (array[0][0].equals("X")) {
				return 2;
			}

		}

		// diag2 R-L
		if (array[2][0].equals(array[1][1]) && array[1][1].equals(array[0][2])) {

			if (array[2][0].equals("O")) {
				winner = 1;
				return 1;
			}

			else if (array[2][0].equals("X")) {
				winner = 2;
				return 2;
			}

		}

		if (array[0][0].equals(array[0][1]) && array[0][1].equals(array[0][2])) {
			if (array[0][0].equals("O")) {
				winner = 1;
				return 1;
			}

			else if (array[0][0].equals("X")) {
				winner = 2;
				return 2;
			}
		}

		if (array[1][0].equals(array[1][1]) && array[1][1].equals(array[1][2])) {
			if (array[1][0].equals("O")) {
				winner = 1;
				return 1;
			}

			else if (array[1][0].equals("X")) {
				winner = 2;
				return 2;
			}
		}

		if (array[2][0].equals(array[2][1]) && array[2][1].equals(array[2][2])) {
			if (array[2][0].equals("O")) {
				winner = 1;
				return 1;
			}

			else if (array[2][0].equals("X")) {
				winner = 2;
				return 2;
			}
		}

		if (array[0][0].equals(array[1][0]) && array[1][0].equals(array[2][0])) {
			if (array[0][0].equals("O")) {
				winner = 1;
				return 1;
			}

			else if (array[0][0].equals("X")) {
				winner = 2;
				return 2;
			}
		}

		if (array[0][1].equals(array[1][1]) && array[1][1].equals(array[2][1])) {
			if (array[0][1].equals("O")) {
				winner = 1;
				return 1;
			}

			else if (array[0][1].equals("X")) {
				winner = 2;
				return 2;
			}
		}

		if (array[0][2].equals(array[1][2]) && array[1][2].equals(array[2][2])) {
			if (array[0][2].equals("O")) {
				winner = 1;
				return 1;
			}

			else if (array[0][2].equals("X")) {
				winner = 2;
				return 2;
			}
		}

		return winner;

	}

	public static boolean checkWinnerBoolean(String[][] array) {

		boolean win = false;

		if (checkScore(array) == 1) {
			win = true;
		}

		else if (checkScore(array) == 2) {
			win = true;
		}

		else if (checkScore(array) == 0) {
			win = false;
		}

		return win;

	}

	public static String checkWinnerString(String[][] array) {

		String win = " ";

		if (checkScore(array) == 1) {
			win = ("Player 1 wins!");
		}

		else if (checkScore(array) == 2) {
			win = ("Player 2 wins!");
		}

		else if (checkScore(array) == 0) {
			win = ("No winner yet.");
		}

		return win;

	}

	public static void main(String[] args) {

		String[][] array = new String[3][3];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = "F";
			}
		}

		Scanner in = new Scanner(System.in);

		System.out.println("Welcome to Tic-Tac-Toe.");
		System.out.println("F means Free Space.");
		System.out.println("If you do not take a free space, the game terminates.");
		System.out.println("Good luck!");

		System.out.println("What is player 1's name?");

		String player1 = in.nextLine();

		System.out.println("What is player 2's name?");

		String player2 = in.nextLine();

		System.out.println(player1 + ", go first. You are circles. Please enter the coordinate X value. (0-2)");

		int turn1X = in.nextInt();

		System.out.println(inBounds(turn1X));

		System.out.println("Now enter the coordinate Y value. (0-2)");

		int turn1Y = in.nextInt();

		System.out.println(inBounds(turn1Y));

		array[turn1X][turn1Y] = "O";

		printScore(array);

		System.out.println(player2 + ", go next. You are crosses. Please enter the coordinate X value. (0-2)");

		int turn2X = in.nextInt();

		System.out.println(inBounds(turn2X));

		System.out.println("Now enter the coordinate Y value. (0-2)");

		int turn2Y = in.nextInt();

		System.out.println(inBounds(turn2Y));

		if (array[turn2X][turn2Y].equals("F")) {
			array[turn2X][turn2Y] = "X";
		}

		else {
			System.out.println("That spot is taken. You lose.");
			System.out.println(player1 + " is the winner!");
			System.exit(0);

		}

		printScore(array);

		System.out.println(player1 + ", go next. Please enter the coordinate X value. (0-2)");

		int turn3X = in.nextInt();

		System.out.println(inBounds(turn3X));

		System.out.println("Now enter the coordinate Y value. (0-2)");

		int turn3Y = in.nextInt();

		System.out.println(inBounds(turn3Y));

		if (array[turn3X][turn3Y].equals("F")) {
			array[turn3X][turn3Y] = "O";
		}

		else {
			System.out.println("That spot is taken. You lose.");
			System.out.println(player2 + " is the winner!");
			System.exit(0);

		}

		printScore(array);

		System.out.println(player2 + ", go next. Please enter the coordinate X value. (0-2)");

		int turn4X = in.nextInt();

		System.out.println(inBounds(turn4X));

		System.out.println("Now enter the coordinate Y value. (0-2)");

		int turn4Y = in.nextInt();

		System.out.println(inBounds(turn4Y));

		if (array[turn4X][turn4Y].equals("F")) {
			array[turn4X][turn4Y] = "X";
		}

		else {
			System.out.println("That spot is taken. You lose.");
			System.out.println(player1 + " is the winner!");
			System.exit(0);

		}

		printScore(array);

		System.out.println(player1 + ", go next. Please enter the coordinate X value. (0-2)");

		int turn5X = in.nextInt();

		System.out.println(inBounds(turn5X));

		System.out.println("Now enter the coordinate Y value. (0-2)");

		int turn5Y = in.nextInt();

		System.out.println(inBounds(turn5Y));

		if (array[turn5X][turn5Y].equals("F")) {
			array[turn5X][turn5Y] = "O";
		}

		else {
			System.out.println("That spot is taken. You lose.");
			System.out.println(player2 + " is the winner!");
			System.exit(0);
		}

		System.out.println(checkWinnerString(array));

		if (checkWinnerBoolean(array) == true) {
			System.exit(0);
		}

		printScore(array);

		System.out.println(player2 + ", go next. Please enter the coordinate X value. (0-2)");

		int turn6X = in.nextInt();

		System.out.println(inBounds(turn6X));

		System.out.println("Now enter the coordinate Y value. (0-2)");

		int turn6Y = in.nextInt();

		System.out.println(inBounds(turn6Y));

		if (array[turn6X][turn6Y].equals("F")) {
			array[turn6X][turn6Y] = "X";
		}

		else {
			System.out.println("That spot is taken. You lose.");
			System.out.println(player1 + " is the winner!");
			System.exit(0);

		}

		System.out.println(checkWinnerString(array));

		if (checkWinnerBoolean(array) == true) {
			System.exit(0);
		}

		printScore(array);

		System.out.println(player1 + ", go next. Please enter the coordinate X value. (0-2)");

		int turn7X = in.nextInt();

		System.out.println(inBounds(turn7X));

		System.out.println("Now enter the coordinate Y value. (0-2)");

		int turn7Y = in.nextInt();

		System.out.println(inBounds(turn7Y));

		if (array[turn7X][turn7Y].equals("F")) {
			array[turn7X][turn7Y] = "O";
		}

		else {
			System.out.println("That spot is taken. You lose.");
			System.out.println(player2 + " is the winner!");
			System.exit(0);

		}

		System.out.println(checkWinnerString(array));

		if (checkWinnerBoolean(array) == true) {
			System.exit(0);
		}

		printScore(array);

		System.out.println(player2 + ", go next. Please enter the coordinate X value. (0-2)");

		int turn8X = in.nextInt();

		System.out.println(inBounds(turn8X));

		System.out.println("Now enter the coordinate Y value. (0-2)");

		int turn8Y = in.nextInt();

		System.out.println(inBounds(turn8Y));

		if (array[turn8X][turn8Y].equals("F")) {
			array[turn8X][turn8Y] = "X";
		}

		else {
			System.out.println("That spot is taken. You lose.");
			System.out.println(player1 + " is the winner!");
			System.exit(0);

		}

		System.out.println(checkWinnerString(array));

		if (checkWinnerBoolean(array) == true) {
			System.exit(0);
		}

		printScore(array);

		System.out.println(player1 + ", go next. Please enter the coordinate X value. (0-2)");

		int turn9X = in.nextInt();

		System.out.println(inBounds(turn9X));

		System.out.println("Now enter the coordinate Y value. (0-2)");

		int turn9Y = in.nextInt();

		System.out.println(inBounds(turn9Y));

		if (array[turn9X][turn9Y].equals("F")) {
			array[turn9X][turn9Y] = "X";
		}

		else {
			System.out.println("That spot is taken. You lose.");
			System.out.println(player2 + " is the winner!");
			System.exit(0);

		}

		System.out.println(checkWinnerString(array));

		printScore(array);

		System.out.println("Tie game!");
		System.exit(0);

	}

}