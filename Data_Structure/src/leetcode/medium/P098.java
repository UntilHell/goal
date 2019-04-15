package leetcode.medium;

import leetcode.medium.P098.TreeNode;

public class P098 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public boolean isValidBST(TreeNode root) {
		
		
		if(root == null) return true;
		
		TreeNode left = root.left;
		TreeNode right = root.right;
		
		if(left == null && right == null) return true;
		if(left != null && right != null){
			return isValidBST(left) && isValidBST(right);
		}
		if(left != null){
			return left.val < root.val;
		}
		if(right != null){
			return right.val < root.val;
		}
		
		
		
		
	}
}
