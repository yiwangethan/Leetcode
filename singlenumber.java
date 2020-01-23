package leetcode;

import java.util.Arrays;

public class singlenumber {
    public static int singleNumber(int[] nums) {
    	int result = 0;
        for (int num:nums){
            result = result ^ num;
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {4,1,2,1,2};
		int k = singleNumber(nums);
		System.out.print(k);
	}

}
