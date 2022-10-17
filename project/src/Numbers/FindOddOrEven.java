package Numbers;

import java.util.Scanner;

public class FindOddOrEven {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("please enter number");
		int i = Scanner.nextInt();
		if (i % 2 == 0) {
			System.out.println("The given number is even number");
		} else {
			System.out.println("The given number is odd number");
		}
	}
}