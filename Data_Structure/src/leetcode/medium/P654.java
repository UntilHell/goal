package leetcode.medium;

import java.util.Arrays;

import org.junit.Test;

public class P654 {

	class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
	}
	
	
	 public TreeNode constructMaximumBinaryTree(int[] nums) {
	    if(nums.length == 0)
	    	return null;
	    
	    int max = nums[0];
	    int maxIndex = 0;
	    for (int i = 1; i < nums.length; i++) {
			if(nums[i] > max){
				max = nums[i];
				maxIndex = i;
			}
			
		}
	    int[] leftNum = Arrays.copyOfRange(nums, 0, maxIndex);
	    int[] rightNum = Arrays.copyOfRange(nums, maxIndex+1, nums.length);
	   
	    TreeNode root =  new TreeNode(max);
	    root.left = constructMaximumBinaryTree(leftNum);
	    root.right = constructMaximumBinaryTree(rightNum);
	    return root;
	 }
	 
	 @Test
	 public void test(){
		 int arr[] = {3,2,1,6,0,5};
		 constructMaximumBinaryTree(arr);
	 }
	 
}
