package leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P094 {
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	 //public static List<Integer> list= new ArrayList<>();
	 public List<Integer> inorderTraversal(TreeNode root) {
//		 List<Integer> list= null;
//		 if(list == null && list.size() <=0){
//			 
//		 }
				
//		 if(root == null){
//			 return null;
//		 }
//		 inorderTraversal(root.left);
//		 list.add(root.val);
//		 inorderTraversal(root.right);
//		 
//	      return list;
		 
		 
		 //��������õݹ�д�ģ�������ջ
//		 Queue<TreeNode> queue = new LinkedList<TreeNode>();
//		 List<Integer> list = new ArrayList<Integer>();
//		
//		 while(roo != null){
//			 
//		 }
		 
		 //--10���Ӻ��޹�����������
		 
		 //�ݹ��е㿴����
		 
		 List<Integer> res = new ArrayList<Integer>();
		 helper(root,res);
		 return res;
		 
	  }
	 
	 public void helper(TreeNode root,List<Integer> res){
		 if(root != null){
			 if(root.left != null){
				 helper(root.left,res);
			 }
			 res.add(root.val);
			 if(root.right != null){
				 helper(root.right,res);
			 }
		 }
	 }
	 
	 
	 
	 
	 //------------ѭ��д��-------------
//	 public List<Integer> inorderTraversal(TreeNode root) {
//		 Stack<TreeNode> stack = new Stack<>();
//		 List<Integer> res = new ArrayList<>();
//		 TreeNode cuur = root;
//	     while(cuur != null || !stack.isEmpty()){
//	    	 while(cuur != null){
//	    		 stack.push(cuur);
//	    		 cuur = cuur.left;
//	    	 }
//	    	 cuur = stack.pop();
//	    	 res.add(cuur.val);
//	    	 cuur = cuur.right;
//	     }
//	     return res;
//	      
//	  }
}
