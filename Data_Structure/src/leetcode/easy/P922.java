package leetcode.easy;

public class P922 {

	public int[] sortArrayByParityII(int[] A) {
		int N = A.length;
		int result[] = new int[N];
		int k = 0;
		for (int i = 0; i < A.length; i++) {
			if( A[i] % 2 == 0){
				result[k] = A[i];
				k = k+2;
			}
       }
		k=1;
		for (int i = 1; i < A.length; i++) {
			if( A[i] % 2 != 0){
				result[k] = A[i];
				k = k+1;
			}
       }
		return result;
    }
}
