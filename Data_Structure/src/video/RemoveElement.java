package video;

public class RemoveElement {

	
public int removeElement(int[] nums, int val) {
	//����ָ�룬������valȫ���������
//	int l = 0, r = nums.length - 1;
//	
//	int count = 0;
	
	//numsΪnull��nums.length < 0������nums == null
//	if(nums.length <= 0){
//		return 0;
//	}
//	while(l <= r){
//		if(nums[l] == val && nums[r] != val){
//			//����
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
		//�Ѳ����ڵ��Ƶ�ǰ��
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
