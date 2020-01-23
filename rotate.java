package leetcode;

public class rotate {
	public static void rotation(int[] nums, int k) {
		int len = nums.length;
		if(k>len)
			k = k%len;
		if(len>1) {
		reverse(0,len-1,nums);
		reverse(0,k-1,nums);
		reverse(k,len-1,nums);
		}
	}
	public static void reverse(int start, int end, int[] nums) {
		while(start < end) {
			int tmp = nums[start];
			nums[start] = nums[end];
			nums[end] = tmp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,2};
		rotation(nums,2);
		for(int i=0;i<nums.length;i++) {
			System.out.print(" "+ nums[i]);
		}
		
	}

}
