package leetcode;

public class longestsubstring {
	/*
    public int longestSubstring(String s, int k) {
        if(s.length()<k) return 0;
        if(k<2) return s.length();
        return count(s.toCharArray(),k,0,s.length()-1);
    }
    
    public int count(char[] chars, int k, int p1, int p2) {
    	if(p2-p1+1<k) return 0;
    	int[] times = new int[26];
    	for(int i=p1;i<=p2;i++) {
    		times[chars[i]-'a']++;
    	}
    	while(p2-p1+1>k&&times[chars[p1-'a']]<k) {
    		p1++;
    	}
    	while(p2-p1+1>k&&times[chars[p1-'a']]<k) {
    		p2--;
    	}
    	//if(p2-p1+1<k) return 0;
    	for(int i=p1;i<p2;i++) {
    		if(times[chars[p1-'a']]<k) {
    			return Math.max(count(chars,k,p1,i-1),count(chars,k,i+1,p2));
    		}
    		
    	}
    	return p2-p1+1;
    	
    }
	*/
    public int longestSubstring(String s, int k) {
        int len = s.length();
        if (len == 0 || k > len) return 0;
        if (k < 2) return len;

        return count(s.toCharArray(), k, 0, len - 1);
    }

    private static int count(char[] chars, int k, int p1, int p2) {
        if (p2 - p1 + 1 < k) return 0;
        int[] times = new int[26];  //  26����ĸ
        //  ͳ�Ƴ���Ƶ��
        for (int i = p1; i <= p2; ++i) {
            ++times[chars[i] - 'a'];
        }
        //  ������ַ�����Ƶ��С��k���򲻿��ܳ����ڽ���Ӵ���
        //  �ֱ��ų���Ȼ��Ų������ָ��
        while (p2 - p1 + 1 >= k && times[chars[p1] - 'a'] < k) {
            ++p1;
        }
        while (p2 - p1 + 1 >= k && times[chars[p2] - 'a'] < k) {
            --p2;
        }

        if (p2 - p1 + 1 < k) return 0;
        //  �õ���ʱ�Ӵ����ٵݹ鴦��
        for (int i = p1; i <= p2; ++i) {
            //  �����i��������Ҫ���зֳ��������ηֱ�ݹ����
            if (times[chars[i] - 'a'] < k) {
                return Math.max(count(chars, k, p1, i - 1), count(chars, k, i + 1, p2));
            }
        }
        return p2 - p1 + 1;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("aaabb");
		longestsubstring l = new longestsubstring();
		int k = l.longestSubstring(s, 3);
		System.out.print(k);
	}

}
