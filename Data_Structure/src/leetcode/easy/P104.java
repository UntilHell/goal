package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class P104 {

	
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public int maxDepth(TreeNode root) {
		/**
		 * 递归
		 */
       // return root == null? 0:(1+Math.max(maxDepth(root.left),maxDepth(root.right)));
        
		
		//层序遍历的方法实现
		Queue<TreeNode> q = new LinkedList<>();
		int result = 0;
		q.add(root);
		while(!q.isEmpty()){
			TreeNode cur = q.remove();
			result ++;
			if(cur.left != null){
				q.add(cur.left);
			}
			if(cur.right != null){
				q.add(cur.right);
			}
		}
		return result;
		
		
		
		
		
    }
}
