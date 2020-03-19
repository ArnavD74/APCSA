
//A minivan has two sliding doors. 
//Each door can be opened by either a dashboard switch, its inside handle, or its outside handle. 
//However, the inside handles do not work if a child lock switch is activated. 
//In order for the sliding doors to open, the gear shift must be in park, and the master unlock switch must be activated.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println(
				"0 means off and 1 means activated. Please enter 0 or 1 with spaces for the current situations for the following variables.");
		System.out.println(
				"Left door, right door, child lock left, child lock right, master lock, inside handle left, outside handle left, inside handle right, outside handle right, gear shift, (one of P N D 1 2 3 R)");
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();

		int leftDoor = Integer.parseInt(input.substring(0, 1));
		int rightDoor = Integer.parseInt(input.substring(2, 3));
		int childLockL = Integer.parseInt(input.substring(4, 5));
		int childLockR = Integer.parseInt(input.substring(6, 7));
		int masterLock = Integer.parseInt(input.substring(8, 9));
		int insideHandleL = Integer.parseInt(input.substring(10, 11));
		int outsideHandleL = Integer.parseInt(input.substring(12, 13));
		int insideHandleR = Integer.parseInt(input.substring(14, 15));
		int outsideHandleR = Integer.parseInt(input.substring(16, 17));
		String gear = input.substring(18, 19);

		boolean left = false;
		boolean right = false;

		if (leftDoor == 0)
			System.out.println("Left door is closed");
		else
			System.out.println("Left door is open");

		if (rightDoor == 0)
			System.out.println("Right door is closed");
		else
			System.out.println("Right door is open");

		if (childLockL == 0)
			System.out.println("Child lock left side is locked");
		else
			System.out.println("Child lock left side is unlocked");

		if (childLockR == 0)
			System.out.println("Child lock right side is locked");
		else
			System.out.println("Child lock right side is unlocked");

		if (masterLock == 0)
			System.out.println("Master lock is locked");
		else
			System.out.println("Master lock is unlocked");

		if (insideHandleL == 0)
			System.out.println("Left inside handle is closed");
		else
			System.out.println("Left inside handle is open");

		if (outsideHandleL == 0)
			System.out.println("Left Outside handle is closed");
		else
			System.out.println("Left Outside handle is open");

		if (insideHandleR == 0)
			System.out.println("Right inside handle is closed");
		else
			System.out.println("Right inside handle is open");

		if (outsideHandleR == 0)
			System.out.println("Right outside handle is closed");
		else
			System.out.println("Right outside handle is open");

		if (gear.equals("P"))
			System.out.println("Gear is in park");
		else
			System.out.println("Gear is not in park");

		// System.out.println(right);

		if ((leftDoor == 1 || insideHandleL == 1 || outsideHandleL == 1) && masterLock == 1 && gear.equals("P"))
			left = true;
		if ((rightDoor == 1 || insideHandleR == 1 || outsideHandleR == 1) && masterLock == 1 && gear.equals("P"))
			right = true;

		// System.out.println(right);

		if (childLockL == 0)
			left = false;
		else if (leftDoor == 0)
			left = false;
		else if (!gear.equals("P"))
			left = false;
		else if (masterLock == 0)
			left = false;

		// System.out.println(right);

		if (childLockR == 0)
			right = false;
		else if (rightDoor == 0)
			left = false;
		else if (!gear.equals("P"))
			right = false;
		else if (masterLock == 0)
			right = false;

		// System.out.println(right);

		System.out.println("Left = " + left);
		System.out.println("Right = " + right);

		if ((left = true) && (right = true)) {
			System.out.println("Both doors open");
		} else if ((left = true) && (right != true)) {
			System.out.println("Left door opens");
		} else if ((left != true) && (right = true)) {
			System.out.println("Right door opens");
		} else {
			System.out.println("Both doors stay closed");
		}

	}
	// 1 1 1 1 1 1 1 1 1 P
}
