package leetcode;

import java.util.HashSet;
import java.util.Set;

public class lengthoflongestsubstring {
	public static int lengthOfLongestSubstring(String s) {
		int n = s.length();
		int i=0, j=0, ans=0;
		Set<Character> set = new HashSet<>(); 
		while(i<n&&j<n) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				ans = Math.max(ans, j-i);
			}else {
				set.remove(s.charAt(i++));
			}
		}
		return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("abcded");
		int k = lengthOfLongestSubstring(s);
		System.out.print(k);

	}

}
