package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class partition {
	public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        Deque<String> path = new ArrayDeque<>();
        int len = s.length();
        back(s,0,res,path,len);
        return res;
		
    }
	public static void back(String s, int start, List<List<String>> res,Deque<String> path ,int len) {
		if(start==len) {
			res.add(new ArrayList<>(path));
			return;
		}
		for(int i=start;i<len;i++) {
			if(!judge(s,start,i)) {
				continue;
			}
			path.addLast(s.substring(start, i+1));
			back(s,i+1,res,path,len);
			path.removeLast();
			
		}
	}
	public static boolean judge(String s, int left, int right) {
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> res = new ArrayList<>();
        Deque<String> path = new ArrayDeque<>();
        //path.addLast("aa");
        //path.addLast("a");
        //path.addLast("bbbb");
        //path.addLast("c");
        String s = new String("aabbc");
        //res.add(new ArrayList<>(path));
        res = partition(s);
        for(int i=0;i<res.size();i++) {
        	System.out.print(res.get(i)+" ");
        }
        
	}

}
