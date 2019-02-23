package video;

public class SortColors {

	public void sortColors(int[] nums) {
		
		
//		 if(nums.length <= 0){
//		        return;
//		 }
//			int count0 = 0;
//			int count1 = 0;
//			//int count2 = 0;
//			for(int i = 0; i < nums.length; i++){
//				if(nums[i] == 0){
//					count0 ++;
//				}else if(nums[i] ==  1){
//					count1 ++;
//				}
//			}
//			for(int i = 0; i < count0; i++){
//				nums[i] = 0;
//			}
//			for(int i = count0; i < count1 + count0; i++){
//				nums[i] = 1;
//			}
//			for(int i = count1 + count0; i < nums.length; i++){
//				nums[i] = 2;
//			}    
//			
//		int count[] = {0,0,0}; 
//		for (int i = 0; i < nums.length; i++) {
//			if(nums[i] > 2 || nums[i] < 0){
//				throw new IllegalArgumentException("fail");
//			}
//			count[nums[i]] ++;
//		}
//		int index = 0;
//		for(int i = 0; i < count[0]; i++){
//			nums[index ++] = 0;
//		}
//		for(int i = 0; i < count[1]; i++){
//			nums[index ++] = 0;
//		}
//		for(int i = 0; i < count[2]; i++){
//			nums[index ++] = 0;
//		}
//		for(int i = 0; i < 3; i++){
//			for(int j = 0; j < count[i]; j++){
//				nums[index ++] = i;
//			}
//		}
		int zero = -1; //nums[0...zero]所有的数字为0
		int two = nums.length;	//nums[two...n-1]所有数字为2
		for(int i = 0; i < two;){
			if(nums[i] == 1){
				i++;
			}else if(nums[i] == 2){
				two--;
				int temp = nums[i];
				nums[i] = nums[two];
				nums[two] =temp;
			}else{
				zero++;
				int temp = nums[i];
				nums[i] = nums[zero];
				nums[zero] =temp;
				i++;
			}
		}
	}
}
