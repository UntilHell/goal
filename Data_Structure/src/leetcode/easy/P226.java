package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class P226 {

	
	
  private class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
	
	public TreeNode invertTree(TreeNode root) {
//        �ݹ飬������ͨ�ĺ���
//		if(root == null){
//			return null;
//		}
//		TreeNode left = invertTree(root.right);
//		TreeNode right = invertTree(root.left);
//		root.left = left;
//		root.right = right;
//		return root;
		if(root == null){
			return null;
		}
		Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
        	
        	TreeNode current = q.poll();
        	TreeNode temp = current.left;
        	current.left = current.right;
        	current.right = temp;
        	if(current.right != null) q.add(current.right);
        	if(current.left != null) q.add(current.left);
        }
        return root;
        
    }
	
	//TreeNode g = q.poll();����󷵻ص�Ϊʲô��root��root��currentָ��λ����һ����
	
	@Test
	public void test(){
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		TreeNode root = new TreeNode(4);
		q.add(root);
		TreeNode temp = q.poll();
		System.out.println(root == temp);
		
		System.out.println("----------------------");
		
		Queue<Integer> queue = new LinkedList<>();
		Integer b = new Integer(21);
		queue.add(b);
		Integer tempb = queue.poll();
		System.out.println(tempb == b);
	}
}
