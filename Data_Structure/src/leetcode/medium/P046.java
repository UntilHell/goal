package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class P046 {
	
	/**����
	 List<List<Integer>> results = new ArrayList<>();
	 public List<List<Integer>> permute(int[] nums) {
	   if(nums == null || nums.length == 0){
		   return results;
	   }
	   generatePermutation(nums, 0, new LinkedList<Integer>());
	   return results;
	 }
	 
	 public void generatePermutation(int nums[], int index, LinkedList<Integer> result){
		 
		 if(index == nums.length){
			 printList(result);
			 //results.add(result)ֻ������˵�ַ����clear���������Ӿ�û�����ˣ�resultsҲ��ɿ�
			 results.add((LinkedList<Integer>) result.clone());
			 result.clear();
			 return;
		 }
		 System.out.println("##########-> index: " + index);
		 for(int i = 0; i < nums.length; i++){
			 //if(nums[i] �Ƿ���p)
			 if(!result.contains(nums[i])){
				 System.out.println("**********"+ nums[i]);
				 result.add(nums[i]);
				 generatePermutation(nums, index+1, result);
				 
			 }
		 }
	 }
	 
	 @Test
	 public void test(){
		 int arr[] = {6,7};
		 //int arr[] = {6,7,8};
		 permute(arr);
	 }
	 
	 public void printList(LinkedList<Integer> list){
		for (Integer i : list) {
			System.out.print(i + ", ");
		}
		 System.out.println();
	 }
	 
	 **/
	
	/**����**/
	private ArrayList<List<Integer>> res;
	private boolean used[];
	
	public List<List<Integer>> permute(int[] nums){
		
		res = new ArrayList<List<Integer>>();
		if(nums == null || nums.length == 0){
			return res;
		}
		used = new boolean[nums.length];
		LinkedList<Integer> p = new LinkedList<>();
		generatePermutation(nums,0,p);
		return res;
	}

	private void generatePermutation(int[] nums, int index, LinkedList<Integer> p) {
		if(index == nums.length){
			res.add((List<Integer>) p.clone());
			return ;
		}
		
		for(int i = 0; i < nums.length; i++){
			if(!used[i]){
				used[i] = true;
				p.addLast(nums[i]);
				generatePermutation(nums, index + 1, p);
				p.removeLast();
				used[i] = false;
			
			}
		}
		return;
	}
	
	
	
	
}
