package Array;

import java.util.Scanner;

public class AssingValuesArray {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter array length");
		int length=sc.nextInt();
		
		int a[] = new int[length];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Please enter array value");
			int value=sc.nextInt();
			a[i]=value;
		}
	}
}