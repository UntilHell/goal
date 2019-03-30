package leetcode.medium;


import org.junit.Test;

public class P064 {

	public int minPathSum(int[][] grid) {
		if(grid == null || grid.length == 0){
			return 0;
		}
		int m = grid.length;
		int n = grid[0].length;
		int dp[][] = new int[m][n];
		dp[0][0] = grid[0][0];
		for(int i = 0; i < n -1 ; i++){
			dp[0][i+1] = grid[0][i+1] + dp[0][i];
		}
		for(int i = 0; i < m - 1; i++){
			dp[i+1][0] = grid[i+1][0]+ dp[i][0];
		}
		
		for(int i = 1; i < m; i++){
			for(int j = 1; j < n; j++){
				dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
			}
		}
		for(int i = 0; i< m; i++){
			for(int j = 0; j< n; j++){
				System.out.print(dp[i][j] + " ,");
			}
			System.out.println();
		}
		
		return dp[m-1][n-1];
    }
	
	@Test
	public void test(){
		int arr[][] = {{1,3,1}, {1,5,1},{4,2,1}};
		int min = minPathSum(arr);
		System.out.println(min);
	}
}
