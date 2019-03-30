package leetcode.medium;

public class P413 {

	public int numberOfArithmeticSlices(int[] A) {
	   int N = A.length;
	   int dp[] = new int[N];
	   for(int i =2; i < N; i++){
		   if(A[i] -A[i-1] == A[i-1]-A[i-2]){
			   dp[i] = dp[i-1] + 1;
		   }
	   }
	   //return dp[N-1];
	   
	   //下面还要算和,没想到
	   int total = 0;
	   for (int i = 0; i < dp.length; i++) {
		 total = total + dp[i];  
	   }
	   return total;
	}
}
