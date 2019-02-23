package video.sort;

public class Selection<T extends Comparable<T>> extends Sort<T> {

	@Override
	public void sort(T[] nums) {

		int N = nums.length;
		for(int i =0; i< N; i++){
			int minIndex = i;
			for(int j = i +1;j < N ; j++){
				if(less(nums[i],nums[j])){
					minIndex = j;
				}
				swap(nums,i,minIndex);
			}
		}
	}

}
