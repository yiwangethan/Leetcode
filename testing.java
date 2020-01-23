package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class testing {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++) {
        	map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
        }
        for(int i=0;i<nums2.length;i++) {
        	map.put(nums1[i], map.getOrDefault(nums1[i], 0)-1);
        }
        int k=0
        for(Integer i: map.keySet()) {
        	if(map.get(i)>0) {
        		nums1[k]=map.get(i);
        		k++;
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
