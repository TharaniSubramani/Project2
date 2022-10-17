package Array;

public class HowMany5 {
	public static void main(String args[]) {
		int findNumber = 5, count = 0;
		int a[] = { 7, 9, 3, 4, 6, 8, 1, 5, 7, 5, 8, 5 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == findNumber) {
				count++;
			}
		}
		{
			System.out.println("the Number of "+ findNumber+ " presented "+ count+" times");
		}
	}

}
