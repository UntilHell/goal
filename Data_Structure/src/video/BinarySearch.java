package video;

public class BinarySearch {

	public int binarySearch(int[] arr,int n, int target){
		
//		int l = 0, r = n - 1; //在[l.....r]里寻找target
//		while(l <= r){  //当 l = r在区间内有意义，只有一个
//			int middle = (l + r) / 2;
//			if(target == arr[middle]){
//				return middle;
//			}else if(target > arr[middle]){
//				l = middle + 1;  //target 在[ middle + 1, r ]
//			}else{
//				r = middle - 1;  //target 在[ l, middle -1]
//			}
//			
//		}
//		return -1;
		
		
		//如果将r变成 n
		int l = 0, r = n ; //在[l.....r)里寻找target
		while(l < r){  //当 l = r,[12,12)
			int middle = (l + r) / 2;
			if(target == arr[middle]){
				return middle;
			}else if(target > arr[middle]){
				l = middle + 1;  //target 在[ middle + 1, r )
			}else{
				r = middle ;  //target 在[ l, middle )
			}
			
		}
		return -1;
	}
}
