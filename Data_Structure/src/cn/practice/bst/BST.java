package cn.practice.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BST<E extends Comparable<E>> {

	private class Node{
		
		public E e;
		public Node left,right;
		
		public Node(E e){
			this.e = e;
			left = null;
			right = null;
		}
	}
	
	private Node root;
	private int size;
	
	public BST(){
		root = null;
		size = 0;
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
		
	//向二分搜索树中添加新的元素e
	public void add(E e){
		if(root == null){
			root = new Node(e);
			size ++;
		}else{
			add(root, e);
		}
	}

	//向以node为根的二分搜索树中插入元素e，递归算法
	private void add(Node node,E e) {
		if(e.equals(node.e)){
			return ;
		}else if(e.compareTo(node.e) < 0 && node.left == null){
			node.left = new Node(e);
			size ++;
			return;
		}else if(e.compareTo(node.e) > 0 && node.right == null){
			node.right = new Node(e);
			size ++;
			return;
		}
		
		if(e.compareTo(node.e) < 0){
			add(node.left, e);
		}else{
			add(node.right, e);
		}
	}
	
	//看二分搜索树中是否包含元素e
	public boolean contains(E e){
		return contains(root, e);
	}
	
	//看以node为根的二分搜索树是否包含元素e,递归算法
	private boolean contains(Node node,E e){
		if(node == null){
			return false;
		}
		if(e.compareTo(node.e) == 0){
			return true;
		}else if(e.compareTo(node.e) < 0){
			return contains(node.left, e);
		}else{
			return contains(node.right,e);
		}
		
	}
	
	//二分搜索树的前序遍历
	public void preOrder(){
		preOrder(root);
	}

	//前序遍历以node为根的二分搜索树，递归算法
	private void preOrder(Node node) {
		if(node == null){
			return;
		}
		System.out.println(node.e);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	 @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        generateString(root, 0, res);
        return res.toString();
    }

    // 生成以node为根节点，深度为depth的描述二叉树的字符串
    private void generateString(Node node, int depth, StringBuilder res){

        if(node == null){
            res.append(generateDepthString(depth) + "null\n");
            return;
        }

        res.append(generateDepthString(depth) + node.e + "\n");
        generateString(node.left, depth + 1, res);
        generateString(node.right, depth + 1, res);
    }

    private String generateDepthString(int depth){
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < depth ; i ++)
            res.append("--");
        return res.toString();
    }
    
    public void postOrder(Node node){
    	if(node == null){
    		return;
    	}
    	postOrder(node.left);
    	postOrder(node.right);
    	System.out.println(node.e);
    	
    	
    	
    }
    
    
    //二分搜索树的层序遍历
    public void levelOrder(){
    	Queue<Node> q = new LinkedList<>();
    	q.add(root);
    	while(!q.isEmpty()){
    		Node cur = q.remove();
    		System.out.println(cur.e);
    		
    		if(cur.left != null){
    			q.add(cur.left);
    		}
    		if(cur.right != null){
    			q.add(cur.right);
    		}
    	}
    			
    }
    
}
