package cn.practice.offer;

public class MoreThanHalfNum_Solution {

	public int moreThanHalfNum_Solution(int [] array) {
        
		//int 
		return 0;
    }
	
	private int partition(int nums[], int l, int h){
		int i = l, j = h+1;
		int v= nums[l];
		while(true){
			while(nums[++i] < v && i != h);
			while(v < nums[--j] && j != l);
			if(i >= j){
			break;
			}
			swap(nums,i,j);
		}
		swap(nums,l,j);
		return j;
	}

	private void swap(int[] a, int l, int j) {
		int t = a[l];
        a[l] = a[j];
        a[j] = t;
		
	}
}


