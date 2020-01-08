package game;

public class Board {
	
	private static final int[][] adj = {{-1,-1}, {-1,0}, {-1,1}, {0,-1}, {0,1}, {1,-1}, {1,0}, {1,1}};
	
	private int w, h;
	boolean[][] mines;
	boolean[][] visible;
	boolean[][] flags;
	boolean firstReveal = true;
	
	public Board(int w, int h, int numMines) {
		this.w = w;
		this.h = h;
		mines = new boolean[w][h];
		visible = new boolean[w][h];
		flags = new boolean[w][h];
		for (int x = 0; x < w; x++) {
			for (int y = 0; y < h; y++) {
				mines[x][y] = false;
				visible[x][y] = false;
				flags[x][y] = false;
			}
		}
		for (int i = 0; i < numMines; i++) {
			int x = (int)(Math.random()*w);
			int y = (int)(Math.random()*h);
			if (mines[x][y]) {
				i--;
			} else {
				mines[x][y] = true;
			}
		}
	}
	public int getNumMines() {
		int output = 0;
		for (int x = 0; x < w; x++) {
			for (int y = 0; y < h; y++) {
				if (mines[x][y]) {
					output++;
				}
			}
		}
		return output;
	}
	public int getNumCorrectFlags() {//minus 1 for incorrect
		int output = 0;
		for (int x = 0; x < w; x++) {
			for (int y = 0; y < h; y++) {
				if (flags[x][y]) {
					if (mines[x][y]) {
						output++;
					} else {
						output--;
					}
				}
			}
		}
		if (output < 0) {
			return 0;
		}
		return output;
	}
	private boolean inBounds(int x, int y) {
		return x >= 0 && x < w && y >= 0 && y < h;
	}
	private int getMineCount(int x, int y) {
		int count = 0;
		for (int i = 0; i < adj.length; i++) {
			int cx = x + adj[i][0];
			int cy = y + adj[i][1];
			if (inBounds(cx, cy)) {
				if (mines[cx][cy]) {
					count++;
				}
			}
		}
		return count;
	}
	private int getFlagCount(int x, int y) {
		int count = 0;
		for (int i = 0; i < adj.length; i++) {
			int cx = x + adj[i][0];
			int cy = y + adj[i][1];
			if (inBounds(cx, cy)) {
				if (flags[cx][cy]) {
					count++;
				}
			}
		}
		return count;
	}
	public boolean checkWin() {//win if all non-mines are revealed
		for (int x = 0; x < w; x++) {
			for (int y = 0; y < h; y++) {
				if (!mines[x][y] && !visible[x][y]) {
					return false;
				}
			}
		}
		return true;
	}
	public void flag(int x, int y) {
		if (inBounds(x, y)) {
			if (!visible[x][y]) {
				flags[x][y] = !flags[x][y];
			}
		}
	}
	public boolean reveal(int x, int y) {
		return reveal(x, y, true);
	}
	public boolean reveal(int x, int y, boolean recursive) {//true if boom
		if (inBounds(x, y)) {
			if (firstReveal) {
				//remove mines TODO move or remove?
				mines[x][y] = false;
				for (int i = 0; i < adj.length; i++) {
					int cx = x + adj[i][0];
					int cy = y + adj[i][1];
					if (inBounds(cx, cy)) {
						mines[cx][cy] = false;
					}
				}
				firstReveal = false;
			}
			if (flags[x][y]) {
				//dont do anything
			} else if (mines[x][y]) {
				return true;
			} else {
				visible[x][y] = true;
				if (recursive) {
					if (getMineCount(x,y) == 0 || getFlagCount(x,y) == getMineCount(x,y)) {//recursive search
						boolean result = false;
						for (int i = 0; i < adj.length; i++) {
							int cx = x + adj[i][0];
							int cy = y + adj[i][1];
							if (inBounds(cx, cy)) {
								if (!visible[cx][cy]) {
									if (getMineCount(cx,cy) == 0) {
										if (reveal(cx, cy, true)) {
											result = true;
										}
									} else {
										if (reveal(cx, cy, false)) {
											result = true;
										}
									}
								}
							}
						}
						return result;
					}
				}
			}
		}
		return false;
	}
	private char[][] getDisplay() {//only for during the game, not when you're dead
		char[][] output = new char[w][h];
		for (int x = 0; x < w; x++) {
			for (int y = 0; y < h; y++) {
				if (visible[x][y]) {//number of mines
					int num = getMineCount(x,y);
					if (num == 0) {
						output[x][y] = '.';
					} else {
						output[x][y] = (char)(num+'0');
					}
					
				} else if (flags[x][y]) {
					output[x][y] = 'f';
				} else {
					output[x][y] = '?';
				}
			}
		}
		return output;
	}
	public String toString() {//example: "(3,3)???,???,???,"
		char[][] chars = getDisplay();
		String output = "("+w+","+h+")";
		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {
				output += chars[x][y];
			}
			output+=',';
		}
		return output;
	}
}
