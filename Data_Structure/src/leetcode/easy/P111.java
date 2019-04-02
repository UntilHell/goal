package leetcode.easy;


public class P111 {
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
//	 public int minDepth(TreeNode root) {
//	    if(root == null) return 0;
//	    return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
//	 }
	
	 public int minDepth(TreeNode root) {
        if(root == null) return 0;
        
        // leaf node
        if(root.left == null && root.right == null) return 1;
        
        // leaf nodes are in right subtree
        if(root.left == null) return minDepth(root.right) + 1;
        
        // leaf nodes are in left subtree
        if(root.right == null) return minDepth(root.left) + 1;
 
        // left/right subtrees both contains leaf nodes
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return Math.min(left, right) + 1;
    }
}
