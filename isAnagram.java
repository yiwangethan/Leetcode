package leetcode;

import java.util.HashMap;

public class isAnagram {
	public boolean anag(String s, String t) {
		//HashMap<Integer,Integer> map = new HashMap<>();
		if(s.length()!=t.length()) return false;
		int[] table = new int[26];
		for(int i=0; i<s.length(); i++) {
			table[s.charAt(i)-'a']++;
			table[t.charAt(i)-'a']--;
		}
		for(int i=0;i<26;i++) {
			if(table[i]!=0)
				return false;
		}
		
		
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("analog");
		String t = new String("naalog");
		boolean k;
		isAnagram k2 = new isAnagram();
		k = k2.anag(s,t);
		System.out.print(k);
	}

}
