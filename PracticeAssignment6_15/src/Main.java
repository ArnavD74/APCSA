import java.awt.Color;

import Picture.Picture;

public class Main {

	public static void main(String[] args) {

		Picture pic = new Picture();
		pic.load("https://specials-images.forbesimg.com/imageserve/1026205392/960x0.jpg?fit=scale");
		for (int x = 0; x < pic.getWidth(); x++) {
			for (int y = 0; y < pic.getHeight(); y++) {
				Color original = pic.getColorAt(x, y);

				int xCenter = pic.getWidth() / 2;
				int yCenter = pic.getHeight() / 2;
				int distanceConstant = 0;
				if (pic.getWidth() > pic.getHeight()) {
					distanceConstant = pic.getHeight() / 2;
				} else
					distanceConstant = pic.getWidth() / 2;

				int distance = (int) Math.sqrt(Math.pow(x - xCenter, 2) + Math.pow(y - yCenter, 2));

				if (distance > distanceConstant) {
					pic.setColorAt(Color.BLACK, x, y);
				}

			}
		}
	}
}
