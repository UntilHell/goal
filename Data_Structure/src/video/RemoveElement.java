package video;

public class RemoveElement {

	
public int removeElement(int[] nums, int val) {
	//两个指针，将等于val全部放在最后
//	int l = 0, r = nums.length - 1;
//	
//	int count = 0;
	
	//nums为null，nums.length < 0而不是nums == null
//	if(nums.length <= 0){
//		return 0;
//	}
//	while(l <= r){
//		if(nums[l] == val && nums[r] != val){
//			//交换
//			int temp = nums[l];
//			nums[l] = nums[r];
//			nums[r] = temp;
//			count ++;
//			l++;
//			r--;
//		}else if(nums[l] != val && nums[r] == val){
//			l++;
//			r--;
//		}else if(nums[l] == val && nums[r] == val){
//			r--;
//			count ++;
//		}else{
//			l++;
//		}
//	}
//	return nums.length - count - 1;
		//把不等于的移到前面
//		int i = 0;
//		for(int j = 0;j < nums.length; j++){
//			if(nums[j] != val){
//				nums[i] = nums[j];
//				i++;
//			}
//		}
//		return i;
		int l = 0;
		int r = nums.length;
		while(l < r){
			if(nums[l] == val){
				nums[l] = nums[r -1];
				r--;
			}else{
				l++;
			}
		}
		return r;	
	
	
	}
}
