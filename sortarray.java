package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sortarray {
	public List<Integer> sortArray(int[] nums) {
		int[] count = new int[100001];
        for(int i=0;i<nums.length;i++){
            count[nums[i]+50000]++;
        }
        List<Integer> goal = new ArrayList<>();
        for(int i=0;i<100001;i++){
            if(count[i]!=0){
                for(int j=0;j<count[i];j++) goal.add(i-50000); 
            }
        }
        return goal;
    }
	//¿ìËÙÅÅÐò
	public static int[] qsort(int arr[],int start,int end) {        
	    int pivot = arr[start];        
	    int i = start;        
	    int j = end;        
	    while (i<j) {            
	        while ((i<j)&&(arr[j]>pivot)) {                
	            j--;            
	        }            
	        while ((i<j)&&(arr[i]<pivot)) {                
	            i++;            
	        }            
	        if ((arr[i]==arr[j])&&(i<j)) {                
	            i++;            
	        } else {                
	            int temp = arr[i];                
	            arr[i] = arr[j];                
	            arr[j] = temp;            
	        }        
	    }        
	    if (i-1>start) arr=qsort(arr,start,i-1);        
	    if (j+1<end) arr=qsort(arr,j+1,end);        
	    return (arr);    
	}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
