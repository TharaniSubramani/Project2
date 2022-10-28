package Numbers;

public class FibbanocySeries {
	public static void fibbanocySeries(int n) {
        
		int num1 = 0, num2 = 1, sum = 0;
		for (int k = 0; k <= n; k++) {
            System.out.println(num1);
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
	}
	
	public static void main(String[] args) {
		fibbanocySeries(10);
	}
}

// 0,1,1,2,3,5,8,13