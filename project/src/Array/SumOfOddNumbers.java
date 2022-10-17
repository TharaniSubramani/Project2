package Array;

public class SumOfOddNumbers {

	public static void main(String args[]) {
		int sum = 0;
		int array[] = { 7, 9, 3, 4, 6, 8, 1 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0)

				sum = sum + array[i];
		}
		System.out.println(sum);

	}
}
