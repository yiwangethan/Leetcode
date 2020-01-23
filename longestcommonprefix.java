package leetcode;

public class longestcommonprefix {
    public static String longestCommonPrefix(String[] strs) {
    	String prefix = strs[0];
    	for(int i=0;i<strs.length;i++) {
    		while(strs[i].indexOf(prefix)!=0) {
    			prefix = prefix.substring(0,prefix.length()-1);
    			if(prefix.isEmpty()) return "";
    		}
    	}
    	return prefix;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = new String[] {"flower","flow","flight"};
		String arg = longestCommonPrefix(s);
		for(int i=0;i<arg.length();i++)
		System.out.print(arg.charAt(i));
	}

}
