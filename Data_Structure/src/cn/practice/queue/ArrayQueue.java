package cn.practice.queue;

import cn.practice.stack.Array;

public class ArrayQueue<E> implements Queue<E>{

	private Array<E> array;
	public ArrayQueue(int capacity){
		array = new Array(capacity);
	}
	
	public ArrayQueue(){
		array = new Array<>();
	}
	
	@Override
	public void enqueue(E e) {
		array.addLast(e);
	}

	@Override
	public E dequeue() {
		return array.removeFirst();
	}

	@Override
	public E getFront() {
		
		return array.getFirst();
	}

	@Override
	public int getSize() {
		
		return array.getSize();
	}

	@Override
	public boolean isEmpty() {
		return array.isEmpty();
	}

}
