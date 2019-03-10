package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class P015 {

	public List<List<Integer>> threeSum(int[] nums) {
        //答案说找到的数据是有序的，因此先排序
		//List<Integer> in = new ArrayList<>();
		List<List<Integer>> out = new ArrayList<>();
		List<Integer> in = new ArrayList<>();
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length-2; i++) {
			int left = i+1;
			int right = nums.length -1;
			while(-nums[i] != (nums[left] + nums[right]) && (left+1) != right){
				while(nums[i] + nums[left] + nums[right] < 0  && left+1 < right) left++;
				while(nums[i] + nums[left] + nums[right] > 0 && left+1 < right) right--;
				
			}
			if(nums[i]+nums[left]+nums[right] ==0){
				
				in.add(nums[i]);
				in.add(nums[left]);
				in.add(nums[right]);
				out.add(in);
				in.clear();
			}
			
			
			
		}
		return out;
		
		
    }
	
	@Test
	public void test(){
		threeSum(new int[]{-1,0,1,2,-1,-4});
	}
}
