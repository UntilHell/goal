package oncemore;

public class P053 {

   public int maxSubArray(int[] nums) {
	   if(nums.length == 0) return 0;
	   if(nums.length == 1){
		   return nums[0];
	   }
	   int dp[] = new int[nums.length];
	   dp[0] = nums[0];
	   int max = 0;
	   for (int i = 1; i < nums.length; i++) {
		 
		   dp[i] = (dp[i-1] > 0 ? dp[i-1]:0) + nums[i];
		   max = Math.max(dp[i], max);
	   }
	   return max;
   }
}
