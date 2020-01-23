package leetcode;

import java.util.Arrays;

public class findduplicate {
    public int findDuplicate(int[] nums) {
    	/*My method
    	Arrays.sort(nums);
    	int tmp = nums[0];
    	for(int i=1; i<nums.length;i++) {
    		tmp ^= nums[i];
    		if(tmp == 0) {
    			return nums[i];
    		}else {
    			tmp = nums[i];
    		}
    	}
    	return 0;
    	*/
    	
    	// Find the intersection point of the two runners.
        int tortoise = nums[0];
        int hare = nums[0];
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Find the "entrance" to the cycle.
        int ptr1 = nums[0];
        int ptr2 = tortoise;
        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }

        return ptr1;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,1,1,1,3,3,3,4,2,2};
		findduplicate f = new findduplicate();
		int k = f.findDuplicate(nums);
		System.out.print(k);
	}

}
