package cn.practice.video;

import java.util.HashSet;
import java.util.Set;

public class Intersection {

	
	public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
			set1.add(nums1[i]);
		}
        Set<Integer> set2 = new HashSet<Integer>();
        for (int i = 0; i < nums2.length; i++) {
			if(set1.contains(nums2[i])){
				set2.add(nums2[i]);
			}
		}
        int k = 0;
        int result[] = new int[set2.size()];
        for (int i : set2) { 
			result[k++] =  i;
		}
        return result;
    }
}
