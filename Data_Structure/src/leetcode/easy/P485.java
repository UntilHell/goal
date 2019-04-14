package leetcode.easy;

import org.junit.Test;

public class P485 {

	public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
		int count = 0;
        int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 1){
				count ++;
				max = Math.max(count, max);
			}else{
				count =0;
			}
		}
		return count;
    }
	
	
	@Test
	public void test(){
		int arr[] = {1,0,1,1,0,1};
		int ones = findMaxConsecutiveOnes(arr);
		System.out.println(ones);
	}
}
