package leetcode;

public class titletonumber {
    public int titleToNumber(String s) {
        int ans = 0;
        for(int i=0; i<s.length();i++) {
        	int num = s.charAt(i) - 'A' + 1;
        	ans = ans*26 + num;
        	
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("AB");
		titletonumber t = new titletonumber();
		int k = t.titleToNumber(s);
		System.out.print(k);
	}

}
