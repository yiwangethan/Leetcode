package leetcode;

public class movezero {
	public void moveZeroes(int[] nums) {
        int len = nums.length;
        int index = 0;
        for(int i=0;i<len;i++) {
        	if(nums[i]!=0) {
        		nums[index] = nums[i];
        		index++;
        	}
        }
        for(;index<len;index++) {
        	nums[index]=0;
        }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,2,0,0,3,4,5,6,7};
		movezero move = new movezero();
		move.moveZeroes(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]);
		}
		
	}

}
