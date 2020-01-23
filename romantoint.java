package leetcode;

import java.util.HashMap;

public class romantoint {
    public static int romanToInt(String s) {
    	int nums = getvalue(s.charAt(0));
    	int sum = 0;
    	for(int i=1;i<s.length();i++) {
    		int num = getvalue(s.charAt(i));
    		if(nums<num) {
    			sum -= nums;
    		}else {
    			sum += nums;
    		}
    		nums = num;
    	}
    	sum+=nums;
    	return sum;
    }
    private static int getvalue(char a) {
    	switch(a) {
	    	case 'I' : return 1;
	    	case 'V': return 5;
	        case 'X': return 10;
	        case 'L': return 50;
	        case 'C': return 100;
	        case 'D': return 500;
	        case 'M': return 1000;
	        default: return 0;

    	} 
    		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("IV");
		int x = romanToInt(s);
		System.out.print(x);
	}

}
