package linkedlist;

public class LinkedList<E> {

	private class Node{
		public E e;
		public Node next;
		
		public Node(E e, Node next){
			this.e = e;
			this.next = next;
		}
		public Node(E e){
			this(e,null);
		}
		public Node(){
			this(null,null);
		}
		@Override
		public String toString() {
			return e.toString();
		}
	}
	
	private Node head;
	private int size;
	
	public LinkedList(){
		head = null;
		size = 0;
	}
	
	//获取链表中元素的个数
	public int getSize(){
		return this.size;
	}
	
	//返回链表是否为空
	public boolean isEmpty(){
		return this.size == 0;
	}
	
	//在链表头添加新的元素
	public void addFirst(E e){
		Node node = new Node(e);
		node.next = head;
		head = node;
		size ++;
	}
	
	// 在链表的index(0-based)位置添加新的元素e
    // 在链表中不是一个常用的操作，练习用：
	
	
	public void add(E e,int index){
		if(index < 0 || size > index){
			throw new IllegalArgumentException("Add failed. Illegal index.");
		}
		//艹，忽略了index=0的情况。
		if(index == 0){
			addFirst(e);
		}else{
			Node prev = head;
			for(int i =0; i < index -1 ; i ++){
				prev = prev.next;			
			}
			//Node node =new Node(e);
			//node.next = prev.next;
			//prev.next = node;
			//等价的写法
			prev.next = new Node(e,prev.next);
			size++;
			
		}
	}
	
	//向末尾添加元素
	public void  addLast(E e){
		add(e, size);
	}
}
