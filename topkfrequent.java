package leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class topkfrequent {
	public List<Integer> topKFrequent(int[] nums, int k) {
		HashMap<Integer,Integer> count = new HashMap<>();
		for(Integer n : nums) {
			count.put(n,count.getOrDefault(n, 0)+1);
		}
		//less frequent fist
		PriorityQueue<Integer> pq = new PriorityQueue<>((n1,n2)->count.get(n1)-count.get(n2));
		//PriorityQueue<>((x1,x2)->x1-x2) 小的在上，大的在下
		for(int n : count.keySet()) {
			pq.add(n);
			if(pq.size()>k) {
				pq.poll();
			}
		}
		List<Integer> topk = new LinkedList();
		while(!pq.isEmpty()) {
			topk.add(pq.poll());
		}
		Collections.reverse(topk);
		return topk;
		
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {5,5,5,2,2,2,2,2,15};
		List<Integer> topk = new LinkedList();
		topkfrequent f = new topkfrequent();
		topk = f.topKFrequent(nums, 2);
		System.out.print(topk);
	}

}
