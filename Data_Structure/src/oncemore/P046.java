package oncemore;

import java.util.ArrayList;
import java.util.List;


public class P046 {
	 List<List<Integer>> ans = new ArrayList<>();
	 public List<List<Integer>> permute(int[] nums) {
		 
	     if(nums==null || nums.length == 0){
	    	 return ans;
	     }
	     generatePermute(nums,new ArrayList<Integer>());
	     
		 return ans;
	 }

	 private void generatePermute(int[] nums, ArrayList<Integer> one) {
		 if(one.size() == nums.length){
			 ans.add((List<Integer>) one.clone());
			 return;
		 }
		 
		 for (int i = 0; i < nums.length; i++) {
			 if(!one.contains(nums[i])){
				 one.add(nums[i]);
				 generatePermute(nums, one);
				 one.remove(one.size()-1);
			 }
		 }
		 
		 return;
	 }
	 
	 
}
