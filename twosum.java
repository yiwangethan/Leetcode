package leetcode;

import java.util.HashMap;

public class twosum {
	public static int[] twoSum(int[] nums, int target) {
		/*
        for(int i=0;i<nums.length;i++) {
        	int k=nums[i];
        	for(int j=i+1; j<nums.length;j++) {
        		if(k+nums[j]==target) {

        			return new int[]{i,j};
        		}
        			
        	}
        }*/
		
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<nums.length;i++) {
			int component = target - nums[i];
			if(map.containsKey(component)) {
				return new int[] {map.get(component),i};
			}
			map.put(nums[i],i);
			//
		}
		throw new IllegalArgumentException("No two sum solution");
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {2,7,11,15};
		int[] k = new int[2];
		k = twoSum(nums,13);
		System.out.print(k[0]+" "+k[1]);
	}

}
