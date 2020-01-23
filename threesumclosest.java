package leetcode;

import java.util.Arrays;

public class threesumclosest {
    public int threeSumClosest(int[] nums, int target) {
    	int len = nums.length;
    	Arrays.sort(nums);
    	int ans = nums[0]+nums[1]+nums[2];
    	if(len<3) return 0;
    	for(int i=0;i<len;i++) {
    		int l=i+1;
    		int r=len-1;
    		while(l<r) {
    			int sum = nums[i]+nums[l]+nums[r];
    			if(Math.abs(sum-target)<Math.abs(ans-target)) {
    				ans = sum;
    			}
    			if(sum>target) {
    				r--;
    			}
    			else if(sum<target) {
    				l++;
    			}else return ans;
    			
    			
    		}
    	}
    	return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {-1,2,1,-4};
		threesumclosest tc = new threesumclosest();
		int k = tc.threeSumClosest(nums, 1);
		System.out.print(k);

	}

}
