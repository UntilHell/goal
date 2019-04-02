package oncemore;

public class P101 {

	 public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
//	 public boolean isSymmetric(TreeNode root) {
//		 if(root == null) return true;
//		 if(root.left.val == root.right.val) {
//			 return isSymmetric(root.left) && isSymmetric(root.right);
//		 }else{
//			 return false;
//		 }
//		 if(root == null) return true;
//		 return help(root.left,root.right);
//		 
//	 }
//	 
//	 public boolean help(TreeNode root1,TreeNode root2){
//		 if(root1.left.val != root2.right.val || root1.right.val != root2.left.val){
//			 return false;
//		 }
//		 return true;
//	 }
	 
	 
	 public boolean isSymmetric(TreeNode root) {
		 return isMirror(root,root);
 	 }
	 public boolean isMirror(TreeNode t1,TreeNode t2){
		 if(t1 == null && t2 == null) return true;
		 if(t1 == null || t2 == null) return false;
		 return t1.val == t2.val && 
				 isMirror(t1.left,t2.right) && isMirror(t1.right,t2.left);
	 }
}
