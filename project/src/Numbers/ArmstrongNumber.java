package Numbers;

public class ArmstrongNumber {
	public static void main(String[] args) {
		boolean isArmstrong = armstrongNumber(371);
		if (isArmstrong) {
			System.out.println("Given number is armstrong number");
		} else {
			System.out.println("Given number is not armstrong number");
		}
	}

	public static boolean armstrongNumber(int number) {
		boolean isArmstrong = false;
		int numberOfDigits = 0;
		while (number > 0) {
			number = number / 10;
			numberOfDigits++;
		}
		double sum = 0;
		while (number > 0) {
			int remainder = number % 10;
			number = number / 10;
			double square = Math.pow(remainder, numberOfDigits);
			sum = sum + square;
		}
		if (sum == number) {
			return true;
		}
		return false;
	}
}