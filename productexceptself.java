package leetcode;

public class productexceptself {
	public int[] ProductExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int k = 1;
        for(int i=0; i<nums.length; i++) {
        	 output[i] = k;
        	 k *= nums[i];
        }
        k = 1;
        for(int i=nums.length-1; i>=0; i--) {
        	output[i] *= k;
        	k *= nums[i];
        }
        return output;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,2,3,4};
		int[] op = new int[nums.length];
		productexceptself pro = new productexceptself();
		op = pro.ProductExceptSelf(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.print(op[i]+" ");
		}
		
	}

}
