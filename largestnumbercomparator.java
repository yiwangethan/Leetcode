package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class largestnumbercomparator {
	private static class LargerNumberComparator implements Comparator<String>{
		@Override
		public int compare(String a, String b) {
			String order1 = a+b;
			String order2 = b+a;
			return order2.compareTo(order1);
		}
	}
	
	
    public static String largestNumber(int[] nums) {
    	String[] asStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            asStrs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(asStrs, new LargerNumberComparator());
        if (asStrs[0].equals("0")) {
            return "0";
        }
        
        // Build largest number from sorted array.
        String largestNumberStr = new String();
        for (String numAsStr : asStrs) {
            largestNumberStr += numAsStr;
        }

        return largestNumberStr;


    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("3");
		String s2 = new String("30");
		int[] nums = new int[] {3,30,34,5,9};

		String[] asStrs = new String[nums.length];
		String s = largestNumber(nums);
		//for(String i:s)
			System.out.println(s);

		
		
	}

}
