package leetcode;

public class removeduplicate {
    public static int removeDuplicates(int[] nums) {
    	int i=0;
    	for(int j=1;j<nums.length;j++) {
    		if(nums[j]!=nums[i]) {
    			i++;
    			nums[i]=nums[j];
    		}
    	}
    	return i+1;
    	
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,0,1,1,1,1,2,2,2,3,3,3,3,4,4};
		int k = removeDuplicates(nums);
		System.out.print(k);
	}

}
