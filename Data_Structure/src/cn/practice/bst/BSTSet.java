package cn.practice.bst;

public class BSTSet<E extends Comparable<E>> implements Set<E> {

	private BST<E> bst;
	public BSTSet(){
		bst = new BST<>();
	}
	
	
	@Override
	public void add(E e) {
		bst.add(e);
	}

	@Override
	public void remove(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
