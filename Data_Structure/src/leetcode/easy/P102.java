package leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class P102 {
	
	public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
	}
	public List<List<Integer>> levelOrder(TreeNode root) {
        
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		List<List<Integer>> result = new ArrayList<>();
		while(!queue.isEmpty()){
			TreeNode cur = queue.remove();
			List<Integer> list = new ArrayList<>();
			list.add(cur.val);
			result.add(list);
			if(cur.left != null){
				queue.add(cur.left);
			}
			if(cur.right != null){
				queue.add(cur.right);
			}						
		}
		return result;
		
        
    }
}
