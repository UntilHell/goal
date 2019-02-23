package offer;

public class MinNumberInRotateArray {

	public static int minNumberInRotateArray(int [] array) {
	    
		int left = 0;
		int right = array.length - 1;
		int middle = left;
		while(array[left] >= array[right]){
			if(right -left == 1){
				middle = right;
				break;
			}
			middle = (right + left) / 2;
			if(array[left] == array[middle] && array[left] == array[right]){
				middle = min(array);
				break;
			}
			if(array[left] <= array[middle]){
				left = middle;
			}else if(array[left] >= array[middle]){
				right = middle;
			}
			
			
		}
		return array[middle];
    }
	
	public static int min(int arr[]){
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(min < arr[i]){
				min = i;
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		int a[] = {6501,6828,6963,7036,7422,7674,8146,8468,8704,8717,9170,9359,9719,9895,9896,9913,9962,154,293,334,492,1323,1479,1539,1727,1870,1943,2383,2392,2996,3282,3812,3903,4465,4605,4665,4772,4828,5142,5437,5448,5668,5706,5725,6300,6335};
		System.out.println(minNumberInRotateArray(a));
	}
}
