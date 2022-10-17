package Numbers;

import java.util.Scanner;

public class AsciiScanner {
	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
		char chr=Sc.next().charAt(0);
		int asciivalue=chr;
		System.out.println(asciivalue);
	}

}
