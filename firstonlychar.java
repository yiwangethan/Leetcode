package leetcode;

import java.util.HashMap;

public class firstonlychar {
	public static int firstuniqchar(String s) {
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		int len = s.length();
		for(int i=0;i<len;i++) {
			char c = s.charAt(i);
			//count.getOrDefault(key, defaultValue)
			count.put(c, count.getOrDefault(c, 0)+1);//Existing c: c+=1; Not existing: 0+1=1;
		}
		for(int i=0;i<len;i++) {
			if(count.get(s.charAt(i))==1) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("lleetcode");
		int k = firstuniqchar(s);
		System.out.print(k);
	}

}
