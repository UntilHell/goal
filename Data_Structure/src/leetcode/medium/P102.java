package leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class P102 {

	private static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> wrapList = new LinkedList<>();
        if(root == null){
        	return wrapList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
        	int levelNum = queue.size();
        	List<Integer> list = new ArrayList<>();
        	for(int i = 0; i < levelNum; i++){
        		if(queue.peek().left != null) queue.add(queue.peek().left);
        		if(queue.peek().right != null) queue.add(queue.peek().right);
        		list.add(queue.poll().val);
        	}
        	wrapList.add(list);
        }
        return wrapList;
    }
	
	 public static void main(String[] args) {

        // �ֶ�����Leetcode��ҳ�ϵĲ���������
        // ��Ȼ, �и��õĸ����ܵĴ����������ķ�ʽ, ����Ȥ��ͬѧ���������о���д����:)

        /*****************
         * ��������:
         *
         *       10
         *      /  \
         *     5   -3
         *    / \    \
         *   3   2   11
         *  / \   \
         * 3  -2   1
         *****************/
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(-2);

        TreeNode node3 = new TreeNode(3);
        node3.left = node1;
        node3.right = node2;

        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(2);
        node5.right = node4;

        TreeNode node6 = new TreeNode(5);
        node6.left = node3;
        node6.right = node5;

        TreeNode node7 = new TreeNode(11);
        TreeNode node8 = new TreeNode(-3);
        node8.right = node7;

        TreeNode node9 = new TreeNode(10);
        node9.left = node6;
        node9.right = node8;
        List<List<Integer>> result = (new P102()).levelOrder(node9);
        for (List<Integer> list : result) {
			for (Integer i : list) {
				System.out.print(i+", ");
			}
			System.out.println();
		}
    }
}
