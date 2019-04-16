package leetcode.medium;

import leetcode.medium.P098.TreeNode;

public class P098 {

	public boolean isValidBST(TreeNode root) {
		//验证一棵树是否是二分搜索树
		//中序遍历
		if(root == null) return true;
		inorder(root);
		Integer value[] = new Integer[list.size()];
		list.toArray(value);
		for(int i = 0; i < value.length-1; i++){
			if(value[i] > value[i+1]) return false;
		}
		return true;
	}
	private List<Integer> list = new ArrayList<>();
	public void inorder(TreeNode root){
		if(root == null) return;
		inorder(root.left);
		list.add(root.val);
		inorder(root.right);
	}
}
