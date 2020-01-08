package game;

public class Player {
	
	public static int startingHealth = 100;
	
	Board b;
	char[][] boardDisplay;
	int health;
	int queue;
	int numMines;
	int shields;
	boolean valid = true;
	
	public Player() {
		health = startingHealth;
		queue = 0;
		shields = 3;
		newBoard(9, 9, 50);
	}
	public Player(String playerString) {
		if (!playerString.equals("")) {
			health = Parser.getInt(playerString, "health:", "|");
			queue = Parser.getInt(playerString, "queue:", "|");
			shields = Parser.getInt(playerString, "shields:", "|");
			numMines = Parser.getInt(playerString, "numMines:", "|");
			String boardString = Parser.getString(playerString, "board:", "|");
			if (boardString.equals("")) {
				valid = false;
			} else {
				boardDisplay = getCharsFromBoardString(boardString);
			}
		} else {
			valid = false;
		}
	}
	public boolean isAlive() {
		return health > 0;
	}
	private char[][] getCharsFromBoardString(String str) {
		int bw = Parser.getInt(str, "(", ",");
		int bh = Parser.getInt(str, ",", ")");
		char[][] chars = new char[bw][bh];
		int curIndex = str.indexOf(")");
		for (int y = 0; y < bh; y++) {
			String curLine = str.substring(curIndex+1, str.indexOf(",", curIndex+1));
			curIndex = str.indexOf(",", curIndex+1);
			for (int x = 0; x < bw; x++) {
				chars[x][y] = curLine.charAt(x);
			}
		}
		return chars;
	}
	
	public void newBoard(int w, int h, int numMines) {
		b = new Board(w, h, numMines);
	}
	
	public String toString() {
		//health:100|queue:10|numMines:1|board:(3,3)???,???,???,|
		String output = "";
		output += "health:"+health+"|";
		output += "queue:"+queue+"|";
		output += "shields:"+shields+"|";
		output += "numMines:"+b.getNumMines()+"|";
		output += "board:"+b.toString()+"|";
		return output;
	}
	
}
