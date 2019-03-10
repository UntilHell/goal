package leetcode.easy;

public class P543 {

	private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { 
    	  val = x; 
      }
    }
	/**
	solution没有看懂是什么意思
	
	int ans;     
	public int diameterOfBinaryTree(TreeNode root) {
		ans = 1;
		depth(root);
		return ans -1;
	}
	
	public int depth(TreeNode node){
		if(node == null) return 0;
		int L = depth(node.left);
		int R = depth(node.right);
		ans = Math.max(ans, L+R+1);
		return Math.max(L, R) +1;
	}
	 *  
	 */
	
	int max = 0 ;
	public int diameterOfBinaryTree(TreeNode root){
		maxDepth(root);
		return max;
	}
	
	private int maxDepth(TreeNode root){
		if(root==null) return 0;
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		max = Math.max(max, left+right);
		return Math.max(left, right) + 1;
		
		
		
		
	}
}
