package cn.practice.video;

public class RemoveDuplicates {

	public int removeDuplicates(int[] nums) {
//        int first = 0;
//        int two = 1;
//        while(first < nums.length){
//        	while(nums[first] == nums[two]){
//        		two++;
//        	}
//        	first = two;
//        	nums[first] = nums[two];
//        	two++;
//        }
//        return two;
		int i= 0;
		for(int j = 1; j < nums.length; j++){
			if(nums[j] != nums[i]){
				i++;
				nums[i] = nums[j];
			}
		}
		return i+ 1;
    }
}
