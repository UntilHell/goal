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
	
	//��ȡ������Ԫ�صĸ���
	public int getSize(){
		return this.size;
	}
	
	//���������Ƿ�Ϊ��
	public boolean isEmpty(){
		return this.size == 0;
	}
	
	//������ͷ����µ�Ԫ��
	public void addFirst(E e){
		Node node = new Node(e);
		node.next = head;
		head = node;
		size ++;
	}
	
	// �������index(0-based)λ������µ�Ԫ��e
    // �������в���һ�����õĲ�������ϰ�ã�
	
	
	public void add(E e,int index){
		if(index < 0 || size > index){
			throw new IllegalArgumentException("Add failed. Illegal index.");
		}
		//ܳ��������index=0�������
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
			//�ȼ۵�д��
			prev.next = new Node(e,prev.next);
			size++;
			
		}
	}
	
	//��ĩβ���Ԫ��
	public void  addLast(E e){
		add(e, size);
	}
}
