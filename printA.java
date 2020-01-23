package leetcode;

public class printA {
	public static void pA(int[] A) {
		int tmp = A[0];
		for(int i=1; i<A.length;i++) {
			int tmpxor = tmp^A[i];
			if(tmpxor==0) {
				System.out.print(A[i]);
			}
			if(tmpxor!=0) {
				tmp = A[i];
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] {1,1,2,2,3};
		pA(A);
	}

}
