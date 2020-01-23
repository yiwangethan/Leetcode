package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class duplicate {
	public static boolean containsDuplicate(int[] nums) {
		HashSet set = new HashSet(nums.length);
	    for (int x: nums) {
	        if (!set.add(x)) return true;
	    }
	    return false;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {3,1};
		boolean k;
		k = containsDuplicate(nums);
		System.out.print(k);
	}

}
