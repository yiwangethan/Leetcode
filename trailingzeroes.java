package leetcode;

public class trailingzeroes {
	public static int trailingZeroes(int n) {
	    int count = 0;
	    while (n > 0) {
	        count += n / 5;
	        n = n / 5;
	    }
	    return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 15;
		int m = trailingZeroes(k);
		System.out.print(m);
	}

}
