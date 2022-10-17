package Numbers;

public class AsciiValue {
	public static void main(String[] args)
	{
		char ch1='a';
		int a1=ch1;
		System.out.println(a1);
		int b1='b';
		System.out.println(b1);
		char ch3='c';
		int c1=(int)ch3;
		System.out.println(c1);
		
		
		
		for(int i=63;i<=65;i++)
		{
			System.out.println("The ascii value of "+(char)i+'='+i);}
		}
	
}
