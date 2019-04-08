package leetcode.medium;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class P078 {

	private List<List<Integer>> res = null;
	public List<List<Integer>> subsets(int[] nums) {
        
		res = new LinkedList<>();
		if(nums == null || nums.length == 0){
			return res;
		}
		LinkedList<Integer> p = new LinkedList<>();
		generateSubSet(nums,0,p);
		return res;
    }
	private void generateSubSet(int[] nums, int index, LinkedList<Integer> p) {
		
//		if(index <= nums.length ){
//			res.add((LinkedList<Integer>) p.clone());
//			
//			//return;
//		}
//		if(index == nums.length) return;
		res.add((LinkedList<Integer>) p.clone());
		for(int i = index; i < nums.length; i++){
			p.addLast(nums[i]);
			generateSubSet(nums, i +1, p);
			p.removeLast();
		}
		
	}
	
	@Test
	public void test(){
		int nums[] = {1,2,3};
		subsets(nums);
		
	}
	
}
