package leetcode;

public class kthsmallest {
	
	public int kthSmallest(int[][] matrix, int k) {
		int row = matrix.length;
		int col = matrix[0].length;
		int left = matrix[0][0];
		int right = matrix[row-1][col-1];
		int a=1;
		while(left < right) {
			int mid = (left+right)/2;
			int count = findNotBiggerThanMid(matrix,mid,row,col);
			if(count < k) {
				left = mid + 1;
			}
			else {
				right = mid;
			}
			System.out.println("循环次数 "+a++);
		}
		return right;
        
    }
	private int findNotBiggerThanMid(int[][] matrix, int mid, int row, int col) {
		int i = row - 1;
		int j = 0;
		int count = 0;

		while(i>=0&&j<col) {
			if(matrix[i][j] <= mid) {
				count += i+1;//第j列有i+1个元素小于mid
				j++;
			}
			else {
				i--;
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = new int[][] {
			{1,5,9},{10,11,13},{12,13,15}
			};
		kthsmallest k = new kthsmallest();
		int k2 = k.kthSmallest(nums, 3);
		System.out.print(k2);
	}

}
