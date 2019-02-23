package cn.practice.offer;

import org.junit.Test;

public class ReOrderArray {

	public static void reOrderArray(int [] array) {
        int start = 0;
        int end = array.length -1;
        while(end > start){
        	while(array[start] % 2 != 0){
        		start ++;
        	}
        	while(array[end] % 2 == 0){
        		end --;
        	}
        	int temp =array[start];
        	array[start] = array[end];
        	array[end] = temp;  
        	start++;
        	end--;
        }
        
    }
	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7};
		reOrderArray(array);
		System.out.print(array);
	}
	
	
}
