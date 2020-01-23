package leetcode;

public class inttoroman {
    public static String intToRoman(int num) {
    	int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while(index < 13) {
        	while(num>=nums[index]) {
        		sb.append(romans[index]);
        		num-=nums[index];
        	}
        	index++;
        }
        return sb.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums = 4;
		String s = intToRoman(nums);
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
		}
	}

}
