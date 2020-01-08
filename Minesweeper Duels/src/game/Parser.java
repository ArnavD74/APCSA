package game;

public class Parser {
	public static String getString(String str, String start, String end) {
		int i = str.indexOf(start)+start.length();
		return str.substring(i, str.indexOf(end, i));
	}
	public static int getInt(String str, String start, String end) {
		return Integer.parseInt(getString(str, start, end));
	}
	public static boolean getBoolean(String str, String start, String end) {
		return getString(str, start, end).equals("true");
	}
	public static long getLong(String str, String start, String end) {
		return Long.parseLong(getString(str, start, end));
	}
}
