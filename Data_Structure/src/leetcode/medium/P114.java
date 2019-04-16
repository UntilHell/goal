package leetcode.medium;

public class P114 {


	public class TreeNode {
		  int val;
		  TreeNode left;
		  TreeNode right;
		  TreeNode(int x) { val = x; }
	}
 

	/**
    public void flatten(TreeNode root) {
		helper(root);
	}

	public TreeNode helper(TreeNode root){
		if(root == null) return null;
		TreeNode right = root.right;
		TreeNode left = root.left;
		root.left = null;
		TreeNode rightF = helper(right);
		TreeNode leftF = helper(left);
		if(leftF != null){
			leftF.right = rightF;
		}
		root.right = leftF;
		return root;
	}
	**/
	/**
	public void flatten(TreeNode root) {
		TreeNode cur = root;
		Queue<TreeNode> q = new LinkedList<TreeNode>();		
		q.add(cur);
		while(!q.isEmpty() || cur != null){
			
			while(cur != null){
				q.add(cur);
				cur = cur.left;
			}
			cur = q.poll();
			TreeNode node = new TreeNode(cur.val);
			cur.right = node;
			cur = cur.right;
		}
		root = cur ;
	}
	**/
	
	 public void flatten(TreeNode root) {
		if(root == null) return ;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode current = stack.pop();
			if(current.right != null) stack.push(current.right);
			if(current.left != null) stack.push(current.left);
			if(!stack.isEmpty()) current.right = stack.peek();
			current.left = null;
		}
	}
}
