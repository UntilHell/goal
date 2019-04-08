package leetcode.easy;



public class P572 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	/**
	public boolean isSubtree(TreeNode s, TreeNode t) {
		if(s == null && t == null) return true;
		if(s == null || t == null) return false;
	    if(s.val != t.val){
	    	return isSubtree(s.left, t) && isSubtree(s.right, t);
	    }else{
	    	return isSubtree(s.left, t.left) && isSubtree(s.right, t.right);
	    }
	    
    }
    =====正确的答案=======================================
  	public boolean isSubtree(TreeNode s, TreeNode t) {
        return traverse(s,t);
    }
    public boolean equals(TreeNode x,TreeNode y)
    {
        if(x==null && y==null)
            return true;
        if(x==null || y==null)
            return false;
        return x.val==y.val && equals(x.left,y.left) && equals(x.right,y.right);
    }
    public boolean traverse(TreeNode s,TreeNode t)
    {
        return  s!=null && ( equals(s,t) || traverse(s.left,t) || traverse(s.right,t));
    }
	
    **/
	
	//递归做不出来
	//使用前序遍历
//	public boolean isSubtree(TreeNode s, TreeNode t) {
//		String str1 = preorder(s, true);
//		String str2 = preorder(t, true);
//		return str1.indexOf(str2) >= 0;
//	}
	
	//标记左右的null
	
//	public String preorder(TreeNode t,boolean left){
//		if(t==null){
//			if(left){
//				return "lnull";
//			}else{
//				return "rnull";
//			}
//		}
//		return "#" + t.val + " "+preorder(t.left, true)+" "+preorder(t.right,false);
//	}
	
	//使用
	 
	
}
