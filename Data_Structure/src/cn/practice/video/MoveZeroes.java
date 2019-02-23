package cn.practice.video;

import org.junit.Test;

public class MoveZeroes {

	 public void moveZeroes(int[] nums) {
	   /*int numsTemp[] = new int[nums.length];
	   int index = 0;
	   for (int i = 0; i < nums.length; i++) {
		   if(nums[i] != 0){
			   numsTemp[index++] = nums[i];
		   }
	   }
	   for(int i =0; i < index; i++){
		   nums[i] = numsTemp[i];
	   }
	   for(int i= index;i<nums.length;i++){
		   nums[i] = 0;
	   }*/
		//将[k,k)
//		 int k = 0;
//		 for(int i = 0; i< nums.length; i++){
//			 if(nums[i] != 0){
		 		//当nums全是非0，和自己交换，可以避免
//				 int temp = nums[i];
//				 nums[i] = nums[k];
//				 nums[k] = temp;
//				 k++;
//			 }
//		 }
		 
		 //视频中的解法
		 int k = 0;  //nums中[0,k)均为非0元素; 遍历到第i个元素后，保证[0,i]中所有非0元素都按顺序排列到[0,k)中
		 
		 for(int i =0; i < nums.length; i++){
			 if(nums[i] != 0){
				 nums[k] = nums[i];
				 k++;
			 }
		 }
		 for(int i = k; i< nums.length; i++){
			 nums[i] = 0;
		 }
		 
    }
	 

	 
	 
	 @Test
	 public void test(){
//		 int nums[] = {0,1,0,3,12};
//		 moveZeroes(nums);
//		 printArr(nums);
		 int a =3;
		 int b =5;
		int temp = a;
		a = b;
		b =temp;
		 System.out.println(a);
		 System.out.println(b);
	 }
	 
	 public void printArr(int []arr){
		 for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	 }
}
