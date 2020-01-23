package leetcode;

import java.util.Random;

public class shufflearrays {
	private int[] array;
	private int[] original;
	Random rand = new Random();
	
	private int randRange(int min, int max) {
		return rand.nextInt(max - min) + min;
	}

	private void swapAt(int i, int j) {
		int temp = array[i];
	    array[i] = array[j];
	    array[j] = temp;
	}

	public shufflearrays(int[] nums) {
		array = nums;
        original = nums.clone();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
    	array = original;
        original = original.clone();
        return original;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
    	for (int i = 0; i < array.length; i++) {
            swapAt(i, randRange(i, array.length));
        }
        return array;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = new int[] {3,1,4,7,15,2};
		shufflearrays sf = new shufflearrays(ary);
		sf.shuffle();
		for(int i=0;i<ary.length;i++) {
			System.out.print(" "+ary[i]);
		}
		ary = sf.reset();
		System.out.println();
		for(int i=0;i<ary.length;i++) {
			System.out.print(" "+ary[i]);
		}
	}

}
