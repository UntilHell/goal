package leetcode.easy;

import java.util.Arrays;

import org.junit.Test;

public class P572 {
	//������
	 /*  public int rob(int[] nums) {
		   if(nums.length == 1) return nums[0];
	       if(nums.length == 2) return Math.max(nums[0],nums[1]);
			int odd = 0;
			int even = 0;
			for (int i = 0; i < nums.length; i+=2) {
				odd += nums[i];
			}
			for (int i = 1; i < nums.length; i+=2) {
				even += nums[i];
			}
			return Math.max(odd, even);
	    }*/
	   
	 //�����ڵĺ����
//	 public int rob(int[] nums) {
//		 //��̬�滮 amount[n] = amount[n-1] +nums[i]
//		 //if(nums.length == 1) return nums[0];
//	     //  if(nums.length == 2) return Math.max(nums[0],nums[1]);
//	       return rob(nums,nums.length-1);
//	 }
	 
//	 private int rob(int[] nums,int i){
//		 if(i<0) return 0;
//		 return Math.max(rob(nums,i-2)+nums[i], rob(nums, i-1));
//	 }
	 
	//��������ͬ��ֵ���Ľ���һ������Ŀռ�
//	int[] memo;
//	public int rob(int[] nums) {
//		 memo = new int[nums.length-1];
//		 Arrays.fill(memo, -1);
//		 return rob(nums,nums.length-1);
//	 }
//	private int rob(int[] nums,int i){
//		if (i < 0) {
//	        return 0;
//	    }
//	    if (memo[i] >= 0) {
//	        return memo[i];
//	    }
//	    int result = Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
//	    memo[i] = result;
//	    return result;
//	}
	
	//��̬�滮�㷨�����ݣ�������дһ���ݹ�
	/**
	public int rob(int[] nums) {
		return rob(nums, nums.length-1);
	}
	
	private int rob(int[] nums,int i){
		if(i==0){
			return nums[0];
		}else if(i==1){
			return Math.max(nums[0], nums[i]);
		}else{
			return Math.max(rob(nums,i-2)+nums[i], rob(nums,i-1));
		}
	
	}
	*/
	public int rob(int[] nums) {
		int res[] = new int[nums.length];
		res[0] = nums[0];
		res[1] = Math.max(nums[0], nums[1]);
		for(int i = 2; i < nums.length; i++){
			
			res[i] = Math.max(res[i-2]+nums[i], res[i-1]);
		}
		return res[nums.length-1];
	}
	

	
	@Test
	public void test(){
		System.out.println(rob(new int[]{1,2,3,1}));
		System.out.println(rob(new int[]{2,7,9,3,1}));
	}
}
