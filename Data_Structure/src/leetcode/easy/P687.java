package leetcode.easy;

public class P687 {

	 public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
//	public int longestUnivaluePath(TreeNode root) {
//        //1.���庯��
//		
//		//2.Ѱ�ҽ�������
//		if(root == null ){
//			return 0;
//		}
//		//3.Ѱ�ҵȼ۹�ϵ,����������һ����root��ֵ��ȣ���󣻷���
//		if(root.val == root.left.val){
//			return 1+longestUnivaluePath(root.left);
//		}else if(root.val == root.right.val){
//			return 1+longestUnivaluePath(root.right);
//		}else{
//			return Math.max(longestUnivaluePath(root.left), longestUnivaluePath(root.right));
//		}
//    }
	 int ans;
	 public int longestUnivaluePath(TreeNode root) {
        ans = 0;
        arrowLength(root);
        return ans;
    }
	 
	 
	 public int arrowLength(TreeNode node){
		 if(node == null) return 0;
		 int left = arrowLength(node.left);
		 int right = arrowLength(node.right);
		 int arrowLeft = 0, arrowRight = 0;
		 if(node.left != null && node.left.val == node.val){
			 arrowLeft += left + 1;
		 }
		 if(node.right != null && node.right.val == node.val){
			 arrowRight += right + 1;
		 }
		 ans = Math.max(ans, arrowRight + arrowLeft);
		 return Math.max(arrowLeft,arrowRight);
	 }
}
