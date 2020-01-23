package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class findklargest {
	public int findKthLargest(int[] nums, int k) {
        /*·½·¨Ò»
		Stack<Integer> data = new Stack<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {

        	data.add(nums[i]);
        		
        }
        	for(int i=1; i<k;i++) {
        		data.pop();
        	}
        	return data.peek();
        */
        
		Arrays.sort(nums);
		return nums[nums.length-k];

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {3,2,3,1,2,4,5,5,6,4};
		findklargest f = new findklargest();
		int k = f.findKthLargest(nums, 4);
		System.out.print(k);
	}

}
