import java.awt.Color;

import Picture.Picture;

public class Main {

	public static void main(String[] args) {

		Picture pic = new Picture();
		pic.load("https://specials-images.forbesimg.com/imageserve/1026205392/960x0.jpg?fit=scale");
		for (int x = 0; x < pic.getWidth(); x++) {
			for (int y = 0; y < pic.getHeight(); y++) {
				Color original = pic.getColorAt(x, y);

				int newRed = original.getRed();
				newRed += 30;

				if (newRed > 255)
					newRed = 255;

				Color sunset = new Color(newRed, original.getGreen(), original.getBlue());

				pic.setColorAt(x, y, sunset);

			}
		}
	}
}
