package leetcode;

public class increasing {
	public boolean increasingTriplet(int[] nums) {
		int len = nums.length;
	    if (len < 3) return false;
	    int small = Integer.MAX_VALUE, mid = Integer.MAX_VALUE;
	    for (int num : nums) {
	      if (num <= small) {
	        small = num;
	      } else if (num <= mid) {
	        mid = num;
	      } 
	      else if (num > mid) {
	        return true;
	      }
	    }
	    return false;
	    
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = new int[] {1,2,3,4,5};
		int[] nums2 = new int[] {9,5,6,2,7};
		increasing inc = new increasing();
		boolean k = inc.increasingTriplet(nums2);
		System.out.print(k);
		
	}

}
