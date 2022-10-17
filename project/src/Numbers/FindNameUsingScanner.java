package Numbers;

import java.util.Scanner;

public class FindNameUsingScanner {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		String name = Sc.nextLine();
		if (name.equals("Tharani")) {
			System.out.println("the given name is Tharani");
		} else {
			System.out.println("the give name is not equal");
		}
	}
}