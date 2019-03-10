package leetcode.easy;

public class P437 {

	
  public  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
	
    public int pathSum(TreeNode root, int sum) {
    	if (root == null) return 0;
        return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);   
	}
    private int pathSumFrom(TreeNode node,int sum){
    	if(node == null) return 0;
    	return (node.val == sum?1:0) + 
    			pathSumFrom(node.left,sum-node.val) +
    			pathSumFrom(node.right,sum-node.val);
    }
    
   /* public class Solution {
        public int pathSum(TreeNode root, int sum) {
            if(root == null)
                return 0;
            return findPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
        }
        
        public int findPath(TreeNode root, int sum){
            int res = 0;
            if(root == null)
                return res;
            if(sum == root.val)
                res++;
            res += findPath(root.left, sum - root.val);
            res += findPath(root.right, sum - root.val);
            return res;
        }
       
    }*/
}
