package Numbers;

import java.util.Scanner;

public class LeapYear {
	public static void main() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year");
		int year=sc.nextInt();
		if(year==366) {
			System.out.println("Leap year");
		}		
	}

}
