package cn.practice.array;

public class Array2 {

	private int[] data;
	//实际上是数组的最后一个元素的下一个位置的索引
	private int size;
	
	//构造函数，传入数组的容量capacity，构造Array
	public Array2(int capacity){
		data = new int[capacity];
	}
	
	//无参构造函数，传入的默认值为10
	public Array2(){
		data = new int[10];
	}
	
	//获取容量,数组的length
	public int getCapacity(){
		return data.length;
	}
	
	//获取数组中元素的个数
	public int getSize(){
		return this.size;
	}
	
	//返回数组书否为空
	public boolean isEmpty(){
		return this.size == 0;
	}
	
	//向数组的最后添加元素
	public void addLast(int e){
		//首先判断是full
		if(size == data.length){
			throw new IllegalArgumentException("AddLast failed. Array is full.");
		}
		data[size] = e;
		size ++;
	}
	
	//向数组中添加一个元素
	public void add(int index,int e){
		if(size == data.length){
			throw new IllegalArgumentException("AddLast failed. Array is full.");
		}
		
		if(index < 0 || index > size){
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
		}
		
		//从插入位置开始所有的元素向后面移动一位，将index位置空出来
		for(int i = size -1; i >= index; i--){
			if(index < 0 || index > size){
				throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
			}
            data[i+1] = data[i];
		}
		
		data[index] = e;
		size ++;
	}
	
	//获取index索引位置的元素
	public int get(int index){
		if(index < 0 || index >= size){
			throw new IllegalArgumentException("Get failed. Index is illegal.");
		}
		return data[index];
	}
	
	//修改index索引位置的元素
	public void set(int index, int e){
		if(index < 0 || index >= size){
			throw new IllegalArgumentException("Set failed. Index is illegal.");
		}
		data[index] = e;
	}
	
	//查找数组中是否包含元素e
	public boolean contains(int e){
		for (int i = 0; i < size; i++) {
			if(data[i] == e){
				return true;
			}
		}
		return false;
	}
	

    // 查找数组中元素e所在的索引，如果不存在元素e，则返回-1
    public int find(int e){
        for(int i = 0 ; i < size ; i ++){
            if(data[i] == e)
                return i;
        }
        return -1;
    }
    
    //从数组中删除index位置的元素, 返回删除的元素
    public int remove(int index){
    	if(index < 0 || index >= size){
    		throw new IllegalArgumentException("Remove failed. Index is illegal.");    		
    	}
    	
    	int ret = data[index];
    	for(int i = index + 1; i < size; i++){
    		data[i - 1] = data[i];
    	}
    	size -- ;
    	return ret;
    }
    
    //从数组中删除第一个元素，返回删除的元素
    public int removeFirst(){
    	return remove(0);
    }
	
    //删除最后一个元素
    public int removeLast(){
    	return remove(size -1);
    }
    
    //从数组中删除元素e
    public void removeElement(int e){
        int index = find(e);
        if(index != -1)
            remove(index);
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
}
