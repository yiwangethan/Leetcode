package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class wordbreak {
	
	public boolean wordBreak(String s, List<String> wordDict) {
		Set<String> wordset = new HashSet(wordDict);
		boolean[] dp = new boolean[s.length()+1];
		dp[0] = true;
		for(int i=1;i<=s.length();i++) {
			for(int j=0; j<i; j++) {
				if(dp[j]&&wordset.contains(s.substring(j,i))) {
					dp[i]=true;
					break;
				}
			}
		}
		return dp[s.length()];
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("catsanddog");
		wordbreak wb = new wordbreak();
		List<String> wordDict = new ArrayList<>();
		wordDict.add("cat");
		wordDict.add("and");
		wordDict.add("sand");
		wordDict.add("dog");
		boolean k = wb.wordBreak(s, wordDict);
		System.out.print(k);
	}

}
