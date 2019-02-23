package linkedlist;

public class LinkedList_dummy<E> {

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
	
	private Node dummyHead;
	private int size;
	
	public LinkedList_dummy(){
		dummyHead = new Node();
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
		add(e, size);
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
			Node prev = dummyHead;
			for(int i =0; i < index ; i ++){
				prev = prev.next;			
			}
			prev.next = new Node(e, prev.next);
			size++;
			
		}
	}
	
	//��ĩβ���Ԫ��
	public void addLast(E e){
		add(e, size);
	}
	
	// �������ĵ�index(0-based)��λ�õ�Ԫ��
    // �������в���һ�����õĲ�������ϰ�ã���
	public E get(int index){
		if(index < 0 || index >= size){
			throw new IllegalArgumentException("Get failed. Illegal index.");
		}
		Node prev = dummyHead.next;
		for (int i = 0; i < index; i++) {
			prev = prev.next;
		}
		return prev.e;
	}
	
	//��������ĵ�һ����Ԫ��
	public E getFront(){
		return get(0);
	}
	
	//�����������һ��Ԫ��
	public E getLast(){
		return get(size-1);
	}
	
	// �޸�����ĵ�index(0-based)��λ�õ�Ԫ��Ϊe
    // �������в���һ�����õĲ�������ϰ�ã���
	public void set(int index,E e){
		if(index < 0 || index >= size){
            throw new IllegalArgumentException("Set failed. Illegal index.");
		}
		Node cur = dummyHead.next;
		for(int i =0; i < index; i++){
			cur = cur.next;
		}
		cur.e = e;
	}
	
	//�����������Ƿ���Ԫ��e
	public boolean contains(E e){
		Node cur = dummyHead.next;
		while(cur.next != null){
			if(cur.e.equals(e)){
				return true;
			}
			cur = cur.next;
				
		}
		return false;
	}
	
	// ��������ɾ��index(0-based)λ�õ�Ԫ��, ����ɾ����Ԫ��
    // �������в���һ�����õĲ�������ϰ�ã���
	public E remove(int index){
		
		if(index < 0 || index > size){
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
		}
		Node pre = dummyHead;
		for(int i = 0; i < index; i++){
			pre = pre.next;
		}
		Node retNode = pre.next;
		pre.next = retNode.next;
		size --;
		return retNode.e;
	}
	
	// ��������ɾ����һ��Ԫ��, ����ɾ����Ԫ��
    public E removeFirst(){
        return remove(0);
    }

    // ��������ɾ�����һ��Ԫ��, ����ɾ����Ԫ��
    public E removeLast(){
        return remove(size - 1);
    }
    
 // ��������ɾ��Ԫ��e
    public void removeElement(E e){
    	Node prev = dummyHead;
    	//���ҵ�e��ǰ��һ��
    	while(prev.next != null){
    		if(prev.next.e.equals(e)){
    			break;
    		}
    		prev = prev.next;
    	}
    	Node delNode = prev.next;
    	prev.next = delNode.next;
    	delNode.next = null;
    	size --;
    }
    
    
	
}
