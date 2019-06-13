package codechallenge;

public class Xorshift {

	
	public long seed = 1;
	
	public Xorshift(long seed) {
		this.seed = seed;
	}
	
	public static void main(String args[]) {
		Xorshift xor = new Xorshift(System.currentTimeMillis());
		
		for(int x = 0;x<=9;x++) {
			try {
				Thread.currentThread().sleep(100);
				xor.random();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void random() {
	    seed ^= (seed << 13);
	    seed ^= (seed >> 17);
	    seed ^= (seed << 5);

	    //int x = (int) seed % 2;
	    seed = seed < 0 ? seed *-1 : seed;
	    System.out.println(seed);
	}
	
}
