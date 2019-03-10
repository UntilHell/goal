package leetcode.easy;

public class P198 {

	public int rob(int[] nums) {
	   
		 if(nums.length == 1) return nums[0];
	       if(nums.length == 2) return Math.max(nums[0],nums[1]);
			int odd = 0;
			int even = 0;
			for (int i = 0; i < nums.length; i+=2) {
				odd += nums[i];
			}
			for (int i = 1; i < nums.length; i+=2) {
				even += nums[i];
			}
			return Math.max(odd, even);
	}
 }

