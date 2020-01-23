package leetcode;

import java.util.Arrays;

public class wigglesort {
    public void wiggleSort(int[] nums) {
    	int len = nums.length;
    	int[] num2 = new int[len];
    	Arrays.sort(nums);
    	for(int i=0; i<len; i+=2) {
    		num2[i] = nums[i/2];
    	}
    	for(int i=1; i<len; i+=2) {
    		num2[i] = nums[len/2+i/2+len%2];
    	}
    	for(int i=0;i<len;i++) {
    		nums[i] = num2[i];
    	}
    	
    	
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {4,5,5,6};
		wigglesort w = new wigglesort();
		w.wiggleSort(nums);
		for(int i: nums)
			System.out.print(i+" ");
	}

}
