package leetcode;

public class reversestring {
	public static void reverseString(char[] s) {
		int len = s.length;
		for(int i=0; i<len/2; i++) {
			char tem = s[i];
			s[i] = s[len-1-i];
			s[len-1-i] = tem;
		}
		for(int i=0; i<s.length; i++) {
			System.out.print(s[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = new char[] {'h','e','l','l','o'};
		reverseString(s);
		
		

}
}
