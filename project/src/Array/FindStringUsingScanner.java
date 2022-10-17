package Array;

import java.util.Scanner; 

public class FindStringUsingScanner {
	public static void main(String[] args) {
		int count=0;
		boolean isExist = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array length");
		int length = sc.nextInt();

		String a[] = new String[length];

		for (int i = 0; i < a.length; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter name "+i);
			String name = scan.nextLine();
			a[i] = name;
		
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter find name ");
		String findName = scanner.nextLine();
		for (int i = 0; i < a.length; i++) {

			if (a[i].equals(findName))
			{
				isExist = true;
				count++;
	
			}

		}
		System.out.println(count);

		if ( isExist) {
			System.out.println("Name Found");
		}
		else System.out.println("Name not Found");
	}
}