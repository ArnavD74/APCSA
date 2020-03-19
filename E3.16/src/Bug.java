
public class Bug {

	private int position;
	private int direction;

	public Bug(int initialPosition) {
		this.position = initialPosition;
		this.direction = 0; //0 = right, 1 = left
	}

	public void turn(String turn) {
		if (turn == "turn") {
			this.direction = 1;
		} else {
			this.direction = 0;
		}
	}

	public void move() {
		if (this.direction == 0) {
			this.position += 1;
		} else {
			this.position -= 1;
		}
	}

	public int getPosition() {
		return this.position;
	}
}
