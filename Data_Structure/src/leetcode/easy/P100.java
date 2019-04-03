package leetcode.easy;


public class P100 {

	
	class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
	}
	 
	public boolean isSameTree(TreeNode p, TreeNode q) {
		
		if(p== null && q == null){
			return true;
		}
		if(p == null && q != null) return false;
		if(q == null && p != null) return false;
		return p.val == q.val && isSameTree(p.left, q.left)
				&& isSameTree(p.right, q.right);
	}
}
