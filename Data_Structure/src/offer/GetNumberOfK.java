package offer;

import org.junit.Test;

public class GetNumberOfK {

	public int GetNumberOfK(int [] array , int k) {
	     if(array == null ){
	    	 return -1;
	     }
	     int first = getFirstK(array, k, 0, array.length -1);
	     int last = getLastK(array, k, 0, array.length - 1);
	     if(first > -1 && last > -1){
	    	 return last - first +1;
	     }
	     return 0;
    }
	
	public int getFirstK(int[] array,int k,int start,int end){
		if(start > end){
			return -1;
		}
		int middle = (start + end) / 2;
		int middleData = array[middle];
		if(middleData == k){
			if((middle > 0 && array[middle-1] != k) || middle == 0){
				return middle;
			}else{
				//中间数字的前面一个也是k，说明k还是位于前面
				end = middle -1;
			}
		}else if(middleData > k){
			end = middle -1;
		}else{
			start = middle + 1;
		}
		return getFirstK(array, k, start, end);
	}
	
	public int getLastK(int[] array,int k,int start,int end){
		if(start > end){
			return -1;
		}
		int middle = (start + end) / 2;
		int middleData = array[middle];
		if(middleData == k){
			if((middle < array.length - 1 && array[middle+1] != k) || middle == array.length -1){
				return middle;
			}else{
				//中间数字的前面一个也是k，说明k还是位于前面
				start = middle + 1;
			}
		}else if(middleData < k){
			start = middle + 1;
		}else{
			end = middle -1;
		}
		return getLastK(array, k, start, end);
	}
	
	@Test
	public void test(){
		int arr[] = {1,2,2,2,2,2,3,3,3,4,4,4,4,4,5,6,7};
		System.out.println(GetNumberOfK(arr, 4));
	}
}