public class Robot {

	private int[] hall;
	private int pos;
	private boolean facingRight;

	private boolean forwardMoveBlocked() { // true if robot has wall in front of it
		if (facingRight && pos >= hall.length - 1) {
			return true;
		}

		else if (!facingRight && pos == 0) {
			return true;
		}

		return false;
	}

	private void move() {

		if (hall[pos] > 0) {
			hall[pos]--; // -1
		}

		if (hall[pos] == 0) {

			if (forwardMoveBlocked()) {

				facingRight = !facingRight;

			}

			else if (facingRight) {
				pos++;
			}

			else {
				pos--;
			}
		}
	}

	public int clearHall() {
		int count = 0;

		while (hallIsClear() == false) {
			move();
			count++;
		}

		return count;
	}
}