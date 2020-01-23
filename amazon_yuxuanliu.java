package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class amazon_yuxuanliu {
	public static List<String> twosum(String[] s) {
		Arrays.sort(s);
		List<String> ans = new ArrayList();
		int len = s.length;
		//String p1 = s[0];
		int start;
		for(start=1;start<len;start++) {
			int left=0, right=len-1;
			while(left<start) {
				if(!s[start].contains(s[left])) {
					left++;
				}
				if(s[start].contains(s[left])) {
					break;
				}
			}
			while(right>start) {
				if(!s[start].contains(s[right])) {
					right--;
				}
				if(s[start].contains(s[right])) {
					break;
				}
			}
			if(s[start].equals(s[left]+s[right])) {
				ans.add(s[left]);
				ans.add(s[right]);
			}
		}

		return ans;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"applepen","apple","pen","highway","high","way"};
		List<String> x = new ArrayList();
		x=twosum(s);
		for(int i=0;i<x.size();i++) {
			System.out.print(x.get(i)+" ");
		}

	}

}
