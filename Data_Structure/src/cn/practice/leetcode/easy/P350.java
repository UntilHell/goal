package cn.practice.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P350 {
	
	 public int[] intersect(int[] nums1, int[] nums2) {
	        
		 Map<Integer,Integer> map = new HashMap<>();
	 
		 for (int num : nums1) {
			if(!map.containsKey(num)){
				map.put(num, 1);
			}else{
				map.put(num, map.get(num) + 1);
			}
		}
		 
		 List<Integer> list = new ArrayList<Integer>();
		for (int num  : nums2) {
			if(map.containsKey(num)){
				list.add(num);
				map.put(num, map.get(num) - 1); //上面已经有key不可能为空map.get(num)
				if(map.get(num) == 0){
					map.remove(num);
				}
			}
		}
		
		
		int result[] = new int[list.size() -1];//数组越界
		int i = 0;
		for (Integer r : list) {
			result[i++] = r;
		} 
		return result;
	 }
}
