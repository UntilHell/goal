package oncemore;


public class P226 {

	 public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	 
	 public TreeNode invertTree(TreeNode root) {
	
		 if(root == null) return null;
		 TreeNode right = root.right;
		 root.right = invertTree(root.left);
		 root.left = invertTree(right);
		 return root;
	 }
	 
}
