package leetcode.medium;

public class P113 {

	/**
	���˴�Ҳ��������
	public class TreeNode {
		    int val;
		    TreeNode left;
		    TreeNode right;
		    TreeNode(int x) { val = x; }
	}
	 public List<List<Integer>> pathSum(TreeNode root, int sum) {
	    
		 List<List<Integer>> ans = new LinkedList<List<Integer>>();
		 if(root == null) return ans;
		 helper(ans,root,sum,new ArrayList<Integer>());
		 return ans;
		 
	 }
	 private void helper(List<List<Integer>> ans, TreeNode root, int sum, ArrayList<Integer> p) {
		 if(root == null) return;
		 p.add(root.val);
		 if(root.val == sum && root.left == null && root.right == null){
			 ans.add(new ArrayList<Integer>(p));
			 p.remove(p.size() - 1);
			 return ;
		 }	
		 
		 helper(ans, root.left, sum - root.val, p);
		 helper(ans, root.right, sum - root.val, p);
		 
		 return;
	 }
	 **/
	 
//	  public List<List<Integer>> pathSum(TreeNode root, int sum) {
//	    
//		 List<List<Integer>> ans = new LinkedList<List<Integer>>();
//		 if(root == null) return ans;
//		 helper(ans,root,sum,new ArrayList<Integer>());
//		 return ans;
//		 
//	 }
//	 private void helper(List<List<Integer>> ans, TreeNode root, int sum, ArrayList<Integer> p) {
//		 if(root == null) return;
//		 p.add(root.val);
//		 if(root.val == sum && root.left == null && root.right == null){
//			 ans.add(new ArrayList<Integer>(p));
//			 p.remove(p.size() - 1);
//			 return ;
//		 }	
//		 
//		 helper(ans, root.left, sum - root.val, p);
//		 helper(ans, root.right, sum - root.val, p);
//		 /**û���ҵ�ҲҪ��ȥ*/
//		 p.remove(p.size()-1);
//		 return;
//	 }
	 
}
