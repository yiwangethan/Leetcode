package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);
        int len=nums.length;
        if(nums == null || len < 3) return ans;
        for(int i=0;i<nums.length;i++) {
        	int l=i+1, r=len-1;
        	if(nums[i]>0) break;
        	if(i>0&&nums[i]==nums[i-1])continue;
        	while(l<r) {
        		int sum = nums[l]+nums[r]+nums[i];
        		if(sum == 0) {
        			ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
        			while(l<r&&nums[l]==nums[l+1])l++;
        			while(l<r&&nums[r]==nums[r-1])r--;
        			l++;
        			r--;
        		}else if(sum<0) {
        			l++;
        		}else if(sum>0) {
        			r--;
        		}
        	}
        	
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {-1, 0, 1, 2, -1, -4};
		threesum t = new threesum();
		List<List<Integer>> ans = new ArrayList();
		ans = t.threeSum(nums);
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i)+" ");
		}
	}

}
