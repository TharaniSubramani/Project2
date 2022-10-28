package Numbers;

public class Factorial {

	public static void main(String[] args) {

		System.out.println(factorial(5));
	}

	public static int factorial(int num) {

		int ans = 1;
		for (int i = 0; i < num; i++) {
			ans = ans * (num - i);
		}
		return ans;
	}
}
