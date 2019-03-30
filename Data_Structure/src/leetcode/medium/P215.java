package leetcode.medium;

import org.junit.Test;

public class P215 {

	public int findKthLargest(int[] nums, int k) {
		k = nums.length - k;
		int l = 0, r = nums.length-1;
		while(l < r){
			
			int result = quick_help(nums, l , r);
			if(k == result){
				break;
			}else if(k > result){
				l = result + 1;
			}else{
				r = result - 1;
			}
		}
		return nums[k];
		
    }
	public int quick_help(int nums[] ,int start, int end){
		
		int l = start;
		int r = end +1;
		while(true){
			
			while(nums[++l] < nums[start] && l < end);
			while(nums[--r] > nums[start] && r > start);
			if(l >= r){
				break;
			}
			swap(nums,l,r);
		}
		swap(nums,start,r);
		return r;
		
	}
	
	private void swap(int nums[],int i, int j){
		int temp;
		temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	@Test
	public void test(){
		int arr[] = {3,2,1,5,6,4};
		int result = findKthLargest(arr,2);
		System.out.println(result);
	}
}
