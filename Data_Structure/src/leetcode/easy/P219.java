package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class P219 {

//	public boolean containsNearbyDuplicate(int[] nums, int k) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i = 0; i< nums.length; i++){
//            if(map.containsValue(nums[i])){
//            	return true;
//            }else{
//            	map.put(i, nums[i]);
//            }
            
            
            //if(map.)
//        }
//    }
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
        	if(i > k) set.remove(nums[i-k-1]);
        	if(set.contains(nums[i])) return true;
        	set.add(nums[i]);
        }
        return false;
    }
}
