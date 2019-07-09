package codechallenge;

public class IntegersProduct {

	public static void main(String args[]) {

		System.out.println(IntegersProduct.getMaxProduct(2));
	}

	public static int getMaxProduct(int n) {

		int product = 1;

		if (n == 2)
			return 1;
		if (n == 3)
			return 2;
		if (n == 4)
			return 4;

		if (n % 3 == 0) {
			int s = n / 3;
			product = (int) Math.pow(3, s);
		} else if (n % 3 == 2) {
			int s = n / 3;
			product = (int) Math.pow(3, s) * 2;
		} else if (n % 3 == 1) {
			int s = (n - 4) / 3;
			product = (int) Math.pow(3, s) * 4;
		}

		return product;
	}

}
