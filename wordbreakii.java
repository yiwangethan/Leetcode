package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class wordbreakii {
	public static List<String> wordBreakii(String s, List<String> wordDict) {
        int len = s.length();
		List<String> res = new ArrayList<>();
		//List<String> save = new ArrayList<>();
		String m = new String();
		traverse(res,wordDict,s,m,0,len);
        return res;
    }
	
	public static void traverse(List<String> res,List<String> wordDict,String s, String m, int start, int len) {
		if(start==len){
			res.add(m);
		}
		for(int i=start;i<len;i++) {
			if(!wordDict.contains(s.substring(start,i+1))) {
				continue;
			}
			m=m+s.substring(start,i+1)+' ';
			traverse(res,wordDict,s,m,i+1,len);
			m=new String();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("pineapplepenapple");
		List<String> wordDict = new ArrayList<>();
		List<String> res = new ArrayList<>();
		wordDict.add("apple");
		wordDict.add("pen");
		wordDict.add("applepen");
		wordDict.add("pine");
		wordDict.add("pineapple");
		res = wordBreakii(s, wordDict);
		for(int i=0;i<res.size();i++) {
        	System.out.println(res.get(i));
        }
	}

}
