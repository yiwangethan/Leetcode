package leetcode;

public class nextpermutation {
    public static void nextPermutation(int[] nums) {
    	int i=nums.length-2;
    	while(i>=0&&nums[i]>=nums[i+1]) {
    		i--;
    	}
    	if(i>=0) {
    		int j = nums.length-1;
    		while(j>=0&&nums[j]<=nums[i]) {
    			j--;
    		}
    		swap(nums,i,j);
    	}
    	reverse(nums,i+1,nums.length-1);

    }
    public static void swap(int[] nums, int a, int b) {
    	int tmp = nums[a];
    	nums[a] = nums[b];
    	nums[b] = tmp;
    			
    }
    public static void reverse(int[] nums, int start, int end) {
    	while(start<end) {
    		swap(nums,start,end);
    		start++;
    		end--;
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,5,3,1};
		nextPermutation(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
