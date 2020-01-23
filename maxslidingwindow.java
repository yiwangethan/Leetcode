package leetcode;

public class maxslidingwindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
    	int i=0;
    	int max = nums[0];
    	
    	for(i=0; i<k; i++) {
        	if(nums[i]>=max)
        		max = nums[i];
        }
    	k++;
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,3,-1,-3,5,3,6,7};

	}

}
