package PrintingStarPattern;

public class PrintDiamodStar {
	public static void printStarDiamond(int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		for (int l = 1; l <= number-1; l++) {
			for (int m = 0; m <= l-1; m++) {
				System.out.print(" ");
			}
			for (int n = 1; n <= 2*(number-l)-1; n++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {
		printStarDiamond(3);
	}
}
