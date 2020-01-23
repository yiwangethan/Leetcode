package leetcode;

public class searchmatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		int row = matrix.length - 1;
		int col = 0;
		while(row>=0&&col<matrix[0].length) {
			if(matrix[row][col] > target) {
				row--;
			}
			else if(matrix[row][col] < target){
				col++;
			}
			else return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[][] {
			{1, 4, 7, 11, 15},
			{2, 5, 8, 12, 19},
		};
		searchmatrix s = new searchmatrix();
		boolean k = s.searchMatrix(arr, 122);
		System.out.print(k);
	}

}
