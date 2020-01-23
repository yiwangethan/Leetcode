package leetcode;

public class longestpalindrome {
    public static String longestPalindrome(String s) {
    	int[] w = new int[26];
    	int len = s.length();
    	int left=0, right=len-1;
    	int start=0,end=0;
    	for(int i=0; i<len; i++) {
    		int len1 = center(s,i,i);
    		int len2 = center(s,i,i+1);
    		int ans = Math.max(len1, len2);
    		if (ans > end - start) {
                start = i - (ans - 1) / 2;
                end = i + ans / 2;
            }

    	}
    	return s.substring(start,end+1);
    	
    	
    }
    private static int center(String s , int left, int right) {
    	while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)) {
    		right++;
    		left--;
    	}
    	return right-left-1;
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("abbc");
		String k = longestPalindrome(s);
		for(int i=0;i<k.length();i++) {
			System.out.print(k.charAt(i));
		}
	}

}
