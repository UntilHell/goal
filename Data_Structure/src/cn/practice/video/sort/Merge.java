package cn.practice.video.sort;

public class Merge<T extends Comparable<T>> extends Sort<T> {

	public void merge(){
		
	}

	@Override
	public void sort(T[] nums) {
		// TODO Auto-generated method stub
		int N = nums.length;
		mergeSort(nums, 0, N-1);
	}
	
	private void mergeSort(T[] nums,int l, int r){
		if(l >= r){
			return;
		}
		int mid = (l + r) / 2;
		//×ó±ß¹é²¢ÅÅÐò
		mergeSort(nums,l,mid);
		mergeSort(nums,mid+1,r);
		mergeSort(nums, l ,mid, r);
	}

	private void mergeSort(T[] nums, int l, int mid, int r) {
		// TODO Auto-generated method stub
		//T[] aux = new T[r-l+1];
		
	}
	
	
}
