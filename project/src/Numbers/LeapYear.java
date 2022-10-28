package Numbers;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year");
		int year=sc.nextInt();
		boolean Isleap=leapYear(year);
		if(Isleap) {
		System.out.println("Leap year");
		}
		else {
			System.out.println("not leap year");
		}
	}
		public static boolean leapYear(int year) {
			boolean Isleap=false;
		if(year%400==0) {
			Isleap= true;
		}	
		return false;
	}

}
