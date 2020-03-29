public class GrayImage {

	public static final int BLACK = 0;
	public static final int WHITE = 255;

	private int[][] pixelValues;

	public GrayImage(int[][] thepixelValues) {

		pixelValues = thepixelValues;

	}

	public int countWhitePixels() {

		int counter = 0;
		int rows = pixelValues.length;
		int columns = pixelValues[0].length;

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {

				if (pixelValues[i][j] == WHITE) {
					counter++;
				}
			}
		}

		return counter;

	}

	public static void main(String[] args) {

		int[][] values = { { 255, 184, 178, 84, 129 }, { 84, 255, 255, 130, 94 }, { 78, 255, 0, 0, 78 },
				{ 84, 130, 255, 130, 84 } };

		GrayImage image = new GrayImage(values);

		System.out.println("count white should be 5 and is " + image.countWhitePixels());
	}
}