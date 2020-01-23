package leetcode;

public class ispalindrome {
    public static boolean isPalindrome(int x) {
    	if(x<0) return false;
    	int count = 0, cp = x ,res = 0;
    	while(x!=0) {
    		res = res*10 + x%10;
    		x/=10;
    	}
    	if(res == cp) return true;
    	return false;
    	
    	/*
    	 for(int i=0, j=s.length()-1;i<j;) {
			char ic = s.charAt(i);
			char jc = s.charAt(j);
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				ic += ' ';
			}
			if(s.charAt(j)>='A'&&s.charAt(j)<='Z') {
				jc+=' ';
			}
			if(!(ic>='a'&&ic<='z'||ic>='0'&&ic<='9')) {
				i++;
				continue;
			}
			if(!(jc>='a'&&jc<='z'||jc>='0'&&jc<='9')) {
				j--;
				continue;
			}
			if(jc!=ic) {
				System.out.println("false");
				return false;
			}
			i++;
			j--;
			
		}
		return true;*/
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 12521;
		boolean k = isPalindrome(x);
		System.out.print(k);
	}

}
