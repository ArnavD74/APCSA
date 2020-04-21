import java.util.Random;

public class TokenPass {

	public int[] board;
	public int currentPlayer;

	public TokenPass(int playerCount) {

		board = new int[playerCount];
		Random r = new Random(playerCount - 1);

		for (int i = 0; i < playerCount; i++)
			board[i] = (int) (r.nextInt() * 10 + 1);

		currentPlayer = r.nextInt() * playerCount;
	}

	public void distributeCurrentPlayerTokens() {

		int index = board[currentPlayer];

		int bound = currentPlayer + 1;
		board[currentPlayer] = 0;

		while (index > 0) {
			if (bound == board.length - 1)
				bound = 0;

			board[bound]++;
			bound++;
			index--;
		}

	}
}