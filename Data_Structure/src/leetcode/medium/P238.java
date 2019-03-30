package leetcode.medium;

import java.util.Arrays;

import org.junit.Test;

public class P238 {

	public int[] productExceptSelf(int[] nums) {
		int left[] = new int[nums.length];
		int right[] = new int[nums.length];
		left[0] = 1;
		for(int i = 1; i < nums.length; i++){
			left[i] = left[i-1] * nums[i-1];
		}
		right[nums.length -1] = 1;
		for(int i = nums.length -2; i >= 0; i--){
			right[i] = right[i+1] * nums[i+1];
		}
		
		int[] product = new int[nums.length];
		for(int i = 0; i < product.length; i++){
			product[i] = left[i] * right[i];
		}
		return product;
    }
	
/*	too slow
 * public int[] productExceptSelf(int[] nums) {
		int N = nums.length;
	    int result[] = new  int[N] ;
	    Arrays.fill(result, 1);
	    for (int i = 0; i < N; i++) {
			for(int j = 0 ; j < N; j++){
				if(i == j){
					continue;
				}
				result[i] = result[i] * nums[j];
			}
		}
	    return result;
    }*/
	@Test
	public void test(){
		int arr[] = {1,2,3,4};
		int[] result = productExceptSelf(arr);
		System.out.println(Arrays.toString(result));
	}
}
