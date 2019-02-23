package cn.practice.array;

import java.sql.Date;

public class Array<E> {

	private E[] data;
	//ʵ��������������һ��Ԫ�ص���һ��λ�õ�����
	private int size;
	
	//���캯�����������������capacity������Array
	public Array(int capacity){
		data = (E[])new Object[capacity];
	}
	
	//�޲ι��캯���������Ĭ��ֵΪ10
	public Array(){
		data = (E[])new Object[10];
	}
	
	//��ȡ����,�����length
	public int getCapacity(){
		return data.length;
	}
	
	//��ȡ������Ԫ�صĸ���
	public int getSize(){
		return this.size;
	}
	
	//�����������Ϊ��
	public boolean isEmpty(){
		return this.size == 0;
	}
	
	//�������������Ԫ��
	public void addLast(E e){
		//�����ж���full
		if(size == data.length){
			throw new IllegalArgumentException("AddLast failed. Array is full.");
		}
		data[size] = e;
		size ++;
	}
	
	//�����������һ��Ԫ��
	public void add(int index,E e){
		
		
		if(index < 0 || index >= size){
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
		}
		if(size == data.length){
			resize(2 * data.length);
		}
		
		
		//�Ӳ���λ�ÿ�ʼ���е�Ԫ��������ƶ�һλ����indexλ�ÿճ���
		for(int i = size -1; i >= index; i--){
            data[i+1] = data[i];
		}
		
		data[index] = e;
		size ++;
	}
	
	//��ȡindex����λ�õ�Ԫ��
	public E get(int index){
		if(index < 0 || index >= size){
			throw new IllegalArgumentException("Get failed. Index is illegal.");
		}
		return data[index];
	}
	
	//�޸�index����λ�õ�Ԫ��
	public void set(int index, E e){
		if(index < 0 || index >= size){
			throw new IllegalArgumentException("Set failed. Index is illegal.");
		}
		data[index] = e;
	}
	
	//�����������Ƿ����Ԫ��e
	public boolean contains(int e){
		for (int i = 0; i < size; i++) {
			if(data[i].equals(e)){
				return true;
			}
		}
		return false;
	}
	

    // ����������Ԫ��e���ڵ����������������Ԫ��e���򷵻�-1
    public int find(E e){
        for(int i = 0 ; i < size ; i ++){
            if(data[i].equals(e))
                return i;
        }
        return -1;
    }
    
    //��������ɾ��indexλ�õ�Ԫ��, ����ɾ����Ԫ��
    public E remove(int index){
    	if(index < 0 || index >= size){
    		throw new IllegalArgumentException("Remove failed. Index is illegal.");    		
    	}
    	
    	E ret = data[index];
    	for(int i = index + 1; i < size; i++){
    		data[i - 1] = data[i];
    	}
    	size -- ;
    	if(size == data.length / 2){
    		resize(data.length / 2);
    	}
    	return ret;
    }
    
    //��������ɾ����һ��Ԫ�أ�����ɾ����Ԫ��
    public E removeFirst(){
    	return remove(0);
    }
	
    //ɾ�����һ��Ԫ��
    public E removeLast(){
    	return remove(size -1);
    }
    
    //��������ɾ��Ԫ��e
    public void removeElement(E e){
        int index = find(e);
        if(index != -1){
        	remove(index);
        }
    }
    
	@Override
    public String toString(){

        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
        res.append('[');
        for(int i = 0 ; i < size ; i ++){
            res.append(data[i]);
            if(i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }
	
	// ������ռ���������newCapacity��С
    private void resize(int newCapacity){

        E[] newData = (E[])new Object[newCapacity];
        for(int i = 0 ; i < size ; i ++)
            newData[i] = data[i];
        data = newData;
    }
}
