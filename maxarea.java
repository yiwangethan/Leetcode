package leetcode;

public class maxarea {
    public static int maxArea(int[] height) {
        int len = height.length;
        int i = 0, j = len-1;
        int res = Integer.MIN_VALUE;
        while(i<j) {
        	int left = height[i], right = height[j];
        	int choos = Math.min(left, right);
        	int cap = (j-i)*choos;
        	res = Math.max(res, cap);
        	if(height[i]<height[j]) {
        		i++;
        	}
        	else {
        		j--;
        	}
        }
        return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = new int[]{1,8,6,2,5,4,8,3,7};
		int k = maxArea(height);
		System.out.print(k);
	}

}
