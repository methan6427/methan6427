package markis99;

public class maybe95 {

	public static void main(String[] args) {
		PrintOneThousand(2);
	}

	public static int PrintOneThousand(int i) {
		if (i < 1000) {
			if (PrimeTest(i, 2) && PrimeTest(i + 2, 2)) {
				System.out.println(i + " " + (i + 2));
				return PrintOneThousand(i+2);
			}else
				return PrintOneThousand(i+1);
				
		}
		return 0;
	}

	static boolean PrimeTest(int x, int i) {
		if (x < 2) {
			return false;
		}
		if (i < x) {
			if (x % i != 0) {
				return PrimeTest(x, i + 1);
			} else
				return false;

		} else
			return true;
	}
}
