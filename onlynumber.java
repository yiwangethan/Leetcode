package leetcode;

import java.util.HashMap;

public class onlynumber {
	public static int number(int[] nums) {
		//int[] nums = new int[] {1,2,3,4,4,4,5,18,2,2,2,3,3,3,1,1,1,1,1,1,1,1};
		HashMap<Integer,Integer> map = new HashMap<>();
		//int len = nums.length;
		//int j = nums[0];
		for(Integer i: nums) {
			Integer count = nums[i];
			map.put(i,count);
			count += count == null? 1:++count;
		}
		for(Integer i: map.keySet()) {
			Integer count = map.get(i);
			if(count == 1) {
				//System.out.print("true");
				return i;
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,4,4,5,18,2,2,2,3,3,3,1,1,1,1,1,1,1,1};
		Integer i = number(nums);
		System.out.println(i);
	}

	private static void println(int i) {
		// TODO Auto-generated method stub
		
	}
}
