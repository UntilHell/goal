package leetcode.medium;

public class P807 {

	//题目看不懂
	//看懂了
	
	
	 public static int maxIncreaseKeepingSkyline(int[][] grid) {
		 
		 int rows = grid.length;
		 int columns = grid[0].length;
		 int sum1 =0;
		 int sum2 =0;
	     for (int i = 0; i < rows; i++) {	    	 
	    	int max = grid[i][0];
			for (int j = 1; j < columns; j++) {
				if(grid[i][j] > max){
					max = grid[i][j];
				}
			}
			sum1 = sum1 + max;
	     }
	     
	     for (int i = 0; i < columns; i++) {	    	 
		    	int max = grid[0][i];
				for (int j = 1; j < rows; j++) {
					if(grid[j][i] > max){
						max = grid[j][i];
					}
				}
				sum2 = sum2 + max;
	     }
	     
	     return sum1 > sum2 ? sum1:sum2;
	 }
	 
	 private  int max(int[] arr){
		 int max = arr[0];
		 for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max){
				max = arr[i];
			}
		 }
		 return max;
		 
	 }
	 
	 private int max(int a,int b){
		 return a > b ? a:b;
	 }
	 
	 
	 
	 
	 public static void main(String[] args) {
//		 int[][] arr = {{2,5,0},{1,1,1},{3,2,4},{1,7,5}};
//		 int rows = arr.length;
//		 int columns = arr[0].length;
//		 System.out.println(rows);
//		 System.out.println(columns);
		 int[][] arr = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
		 int skyline = maxIncreaseKeepingSkyline(arr);
		 System.out.println(skyline);
		 //int arr[] = {1,5,3,2,2}; 
		 //int max = max(arr);
		 //System.out.println(max);
	}
}
