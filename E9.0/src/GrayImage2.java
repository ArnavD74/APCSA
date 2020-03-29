public class GrayImage2 {
	public static final int BLACK = 0;
	public static final int WHITE = 255;

	private int[][] pixelValues;

	public GrayImage2(int[][] theArray) {
		pixelValues = theArray;
	}

	public void processImage() {

		int rows = pixelValues.length;
		int columns = pixelValues[0].length;

		for (int i = 0; i < rows - 2; i++) {

			for (int j = 0; j < columns - 2; j++) {

				if (i + 2 != rows || j + 2 != columns) {

					if (pixelValues[i][j] - pixelValues[i + 2][j + 2] <= 0) {
						pixelValues[i][j] = BLACK;
					}

					else {
						pixelValues[i][j] -= pixelValues[i + 2][j + 2];
					}

				}
			}
		}
	}

	public void printValues() {

		for (int r = 0; r < pixelValues.length; r++) {

			for (int c = 0; c < pixelValues[0].length; c++) {

				System.out.print(pixelValues[r][c] + ", ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[][] values = { { 221, 184, 178, 84, 135 }, { 84, 255, 255, 130, 84 }, { 78, 255, 0, 0, 78 },
				{ 84, 130, 255, 130, 84 } };

		GrayImage2 image = new GrayImage2(values);
		image.printValues();
		image.processImage();
		System.out.println();
		System.out.println("after process image");
		System.out.println();
		image.printValues();

	}
}