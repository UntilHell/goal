package leetcode.easy;

import java.util.Arrays;

import org.junit.Test;

public class P581 {

	 public int findUnsortedSubarray(int[] nums) {
		int n = nums.length;
		int [] sort = new int[nums.length];
		System.arraycopy(nums, 0, sort, 0, n);
		Arrays.sort(sort);
		
		int l = 0;
		int r = n-1;
		while(l < r){
			if(sort[l] != nums[l] ) break;
			l++;
		}
		
		while(l < r){
			if(sort[r] != nums[r] ) break;
			r--;
		}
		
		return r - l + 1;
		
	 }
	 
	 @Test
	 public void test(){
		 int arr[] = {2,6,4,8,10,9,15};
		 System.out.println(Arrays.toString(arr));
		 int copyofArr[] = new int[arr.length] ;
		 System.arraycopy(arr, 0, copyofArr, 0, arr.length);
//		 copyofArr[2] = 99;
//		 System.out.println(Arrays.toString(copyofArr));
		 int result = findUnsortedSubarray(arr);
		 System.out.println(result);
	 }
}
