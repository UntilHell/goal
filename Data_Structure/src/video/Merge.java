package video;

import org.junit.Test;

public class Merge {

	 public void merge(int[] nums1, int m, int[] nums2, int n) {
//		int l1 = nums1.length;
		//int l2 = nums2.length;
//	    for(int i = l1 - 1; i >= 0 ; i--){ 
//	    	
//	    		if(nums1[m-1] > nums2[n -1 ] ){
//	    			nums1[i] = nums1[m - 1];
//	    			m--;
//	    		}else{
//	    			nums1[i] = nums2[n - 1];
//	    			n--;
//	    		}
//	    }
		 
		int count = m + n -1;
		m--;
		n--;
		while(m >= 0 && n >= 0){
			nums1[count--] = nums1[m] > nums2[n]?nums1[m--]:nums2[n--];
		}
		while(n >= 0){
			nums1[count--] = nums2[n--];
		} 
		 
	 }
	 
	 @Test
	 public void test(){
		 int[] nums1 = {1,2,3,0,0,0};
		 int[] nums2 = {2,5,6};
		 merge(nums1,3,nums2,3);
	 }
}
