package leetcode.medium;

public class P540 {

	public int singleNonDuplicate(int[] nums) {
    
		/**
		 * 	序号 0 1 2 3 4 5 6
			数组 X X X X X X X
			此时left = 0, right = 6, mid = left + parseInt((right - left) / 2) = 3
			mid两端都是奇数个值
			当nums[mid] == nums[mid+1]时，右侧此时就会剩下偶数个值，因此只出现一次的数字不会出现在右侧
			反之，nums[mid] == nums[mid-1]时，左侧就会剩下偶数个值，因此只出现一次的数字不会出现在左侧
			
			序号 0 1 2 3 4
			数组 X X X X X
			此时left = 0, right = 4, mid = left + parseInt((right - left) / 2) = 2
			mid两端都是偶数个值
			当nums[mid] == nums[mid+1]时，右侧此时剩下奇数个值，因此只出现一次的数一定会在右侧
			反之，nums[mid] == nums[mid-1]时，左侧剩下奇数个值，因此只出现一次的数一定会在左侧
		 */
		
		int left = 0, right = nums.length-1;
		while(left < right){
			int mid = (left + right) / 2;
			if(mid % 2 == 1) mid--; //查找的区间是奇数
			if(nums[mid] == nums[mid+1]){
				left = mid + 2;
			}else{
				right = mid;
			}					
		}
        return nums[left];		
    }	
}
