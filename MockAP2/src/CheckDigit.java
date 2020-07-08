public class CheckDigit {

	private int checkDigit;
	private int num;

	public static int getCheck(int num) {
		return num;
	}

	public static boolean isValid(int numWithCheckDigit) {

		boolean valid = false;
		
		int lastNumber = numWithCheckDigit % 10;
		int compare = getCheck(numWithCheckDigit);
		
		if (lastNumber == compare) {
			valid = true;
		}

		return valid;

	}

	public static void main(String[] args) {

		System.out.println(isValid(9));

	}

}