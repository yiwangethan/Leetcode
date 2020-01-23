package leetcode;

import java.util.Stack;

public class findpeakelement {
	//不要求找出所有峰值元素
	public static int findPeakElement(int[] nums) {
		int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,4,3,4,2};
		int k = findPeakElement(nums);
		System.out.print(k);

	}
}
