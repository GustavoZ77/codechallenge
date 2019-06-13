package codechallenge;

public class PseudoRandomSimple {

	static int count = 0;
	static void countBits(int n) {
		if(n > 0) {
			count += n & 1;
			n >>= 1;
			countBits(n);
		}
		
	}

	public static void main(String args[]) {
		int i = 5;
		countBits(i);
		System.out.println(count);
	}

}
