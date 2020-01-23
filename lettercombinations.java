package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lettercombinations {
    public List<String> letterCombinations(String digits) {
    	//int[] nums = {2,3,4,5,6,7,8,9};
    	String[] letters = {"*","*", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    	List<String> ans = new ArrayList();
    	for(int i=0;i<digits.length();i++) {
    		getchar(digits.charAt(i));
    		for(int )
    	}
    	
    }
    public String getchar(int n) {
    	switch(n) {
    		case 2: return "abc";
    		case 3: return "def";
    		case 4: return "ghi";
    		case 5: return "jkl";
    		case 6: return "mno";
    		case 7: return "pqrs";
    		case 8: return "tuv";
    		case 9: return "wxyz";
    		default: return null;
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
