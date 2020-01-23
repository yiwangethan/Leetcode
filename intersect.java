package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class intersect {
	public int[] Intersect(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length)
        	return Intersect(nums2,nums1);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums1) {
        	map.put(i, map.getOrDefault(i, 0)+1);
        }
        int k=0;
        for(int i:nums2) {
        	int cnt = map.getOrDefault(i, 0);
        	if(cnt>0) {
        		nums1[k++] = i;
        		map.put(i,cnt-1);
        	}
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = new int[]{1,2,1,2,1};
		int[] nums2 = new int[] {2,2};
		int[] nums3;
		intersect it = new intersect();
		nums1 = it.Intersect(nums1, nums2);
		for(int i=0;i<nums1.length;i++) {
			System.out.print(" "+nums1[i]);
		}
	}

}
