package oncemore;

import java.util.LinkedList;
import java.util.Queue;

public class P617 {

	 public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	  }
	
	 /**  1.递归的算法
	 public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null) return t2;
        if(t2 == null) return t1;
        t1.val = t1.val + t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
	 }
	 **/
	 
	 /**
	 2.广度优先
	 public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		 Queue<TreeNode> queue1 = new LinkedList<>();
		 Queue<TreeNode> queue2 = new LinkedList<>();
		 queue1.add(t1);
		 queue1.add(t2);
		 while(queue1.isEmpty() || queue2.isEmpty()){
			 TreeNode temp1 = queue1.poll();
			 TreeNode temp2 = queue2.poll();
			 int sum = (temp1 != null? temp1.val: 0) + (temp2 != null? temp2.val: 0);
			 
 		 }
		 
		 
	 }
	  * 
	  */
	 
}
