package leetcode.easy;

public class P053 {
	//�ݹ�Ͷ�̬�滮 ��������
	 public int maxSubArray(int[] nums) {
		if(nums == null || nums.length == 0){
			return 0;
		}
		int N = nums.length;
		
		int dp[] = new int[N];
		dp[0] = nums[0];
		int max = dp[0];
		for(int i = 1; i < N; i++){
			dp[i] = (dp[i-1] > 0 ? dp[i-1]:0) + nums[i];
			//��仰��û�뵽
			max = Math.max(max, dp[0]);
		}
	    return max; 
	 }
	 
	 public int maxSub(int[] nums,int k){
		int N = nums.length;
			
		int dp[] = new int[N];
		dp[0] = nums[0];
		for(int i = 1; i < k; i++){
			dp[i] = (dp[i-1] > 0 ? dp[i-1]:0) + nums[i];
		}
	    return dp[N-1]; 
		 
		 
	 }
	 
	 
	 
}
