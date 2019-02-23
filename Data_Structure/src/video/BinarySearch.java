package video;

public class BinarySearch {

	public int binarySearch(int[] arr,int n, int target){
		
//		int l = 0, r = n - 1; //��[l.....r]��Ѱ��target
//		while(l <= r){  //�� l = r�������������壬ֻ��һ��
//			int middle = (l + r) / 2;
//			if(target == arr[middle]){
//				return middle;
//			}else if(target > arr[middle]){
//				l = middle + 1;  //target ��[ middle + 1, r ]
//			}else{
//				r = middle - 1;  //target ��[ l, middle -1]
//			}
//			
//		}
//		return -1;
		
		
		//�����r��� n
		int l = 0, r = n ; //��[l.....r)��Ѱ��target
		while(l < r){  //�� l = r,[12,12)
			int middle = (l + r) / 2;
			if(target == arr[middle]){
				return middle;
			}else if(target > arr[middle]){
				l = middle + 1;  //target ��[ middle + 1, r )
			}else{
				r = middle ;  //target ��[ l, middle )
			}
			
		}
		return -1;
	}
}
