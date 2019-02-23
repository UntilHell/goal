package video.sort;

public class QuickSortInt {
	
	public void quickSort(int arr[],int n){
		
		quick(arr, 0, n-1);
	}

	private void quick(int[] arr, int l, int r) {
		
		if(l >= r){
			return ;
		}
		
		int p = partition(arr, l, r);
		quick(arr, l, p-1);
		quick(arr, p+1, r);
		
	}

	private int partition(int[] arr, int l, int r) {
		int v = arr[l];
		int j = l;
		for(int i = l+1; i<=r; i++){
			if(arr[i] < v){
				//swap(arr[j+1],arr[j]);
			}
			
		}
		return 0;
	}

}
