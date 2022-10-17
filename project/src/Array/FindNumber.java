package Array;

public class FindNumber {
	public static void main(String args[]) {
		boolean isExist = false;
		int findNumber = 5;
		int array[] = { 7, 9, 3, 4, 6, 8, 1 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] == findNumber) {
				isExist = true;
				break;
			}
		}

		if (true) {
			System.out.println("5 is exist");

		} else
			System.out.println("5 is not exist");

	}
}
