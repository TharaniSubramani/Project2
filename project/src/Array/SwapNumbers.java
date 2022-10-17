package Array;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array length");
		int length = sc.nextInt();
		int array[] = new int[length];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter array value");
			int value = sc.nextInt();
			array[i] = value;
		}
		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.println(array[i]);
		}
	}
}
