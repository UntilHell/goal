package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class P136 {

	/**
	 * 
		we use bitwise XOR to solve this problem :
		first , we have to know the bitwise XOR in java
		0 ^ N = N
		N ^ N = 0
		So..... if N is the single number
		N1 ^ N1 ^ N2 ^ N2 ^..............^ Nx ^ Nx ^ N
		= (N1^N1) ^ (N2^N2) ^..............^ (Nx^Nx) ^ N
		= 0 ^ 0 ^ ..........^ 0 ^ N
		= N
	 * @param nums
	 * @return
	 */
	 public int singleNumber(int[] nums) {
//		List<Integer> list = new ArrayList<>();
//        for(int i = 0; i < nums.length; i++){
//            
//            if(list.contains(nums[i])){
//                list.remove(Integer.valueOf(nums[i]));
//            }else{
//                list.add(nums[i]);    
//            }
//        }
//        return list.get(0);  
		 int result = 0;
		 for (int i : nums) {
			result ^= i;
		}
		 return result;
	 }
	 
	 @Test
	 public void test(){
		 int[] arr = {1,2,2};
		 int number = singleNumber(arr);
		 System.out.println(number);
//		0 ^ N = N
//		N ^ N = 0    ÓëÔËËã 0^0=0  1^1=0  1^0=1  0^1=1
		 //System.out.println(0 ^ 3);
		 //System.out.println(3 ^ 3);
		 
	 }

}
