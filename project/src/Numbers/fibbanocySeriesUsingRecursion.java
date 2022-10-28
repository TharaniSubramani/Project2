package Numbers;

public class fibbanocySeriesUsingRecursion {
	public static int fibbanocySeriesUsingRecursion(int n) {
		if(n<=1) 
			return n;
		else 
		return fibbanocySeriesUsingRecursion(n-1)+fibbanocySeriesUsingRecursion(n-2);

		}
	
	public static void main(String[] args) {
		System.out.println(fibbanocySeriesUsingRecursion(10));
	}

}
