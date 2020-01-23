package leetcode;

public class maxproduct {
	public static int maxpro(int[] nums) {
		int max = Integer.MIN_VALUE, imax = 1, imin = 1;
		int len = nums.length;
		int tmp = nums[0];
		for(int i=0; i<len; i++) {
			if(nums[i]<0) {
				int tmpp = imax;
				imax = imin;
				imin = tmpp;
			}
			imax = Math.max(imax*nums[i], nums[i]);
			imin = Math.min(imin*nums[i], nums[i]);
			max = Math.max(imax, max);
		}
		return max;
				 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {2,-2,-2,-2,2};
		int k = maxpro(nums);
		System.out.print(k);
		
	}

}
