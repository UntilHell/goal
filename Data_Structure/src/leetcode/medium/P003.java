package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class P003 {

	/**
	 * 1.复杂度高，重复计算
	 * @param s
	 * @return
	 
	public int lengthOfLongestSubstring(String s) {
	    int n = s.length();
	    int ans = 0;
	    for(int i = 0; i < n; i++){
	    	for(int j = i + 1; j <= n; j++){
	    		if(allUnique(s, i, j)){
	    			ans =Math.max(ans, j - i);
	    		}
	    	}
	    }
	    return ans;
    }
	 
	 public boolean allUnique(String s, int start, int end){
		 Set<Character> set = new HashSet<>();
		 for(int i = start; i < end; i++){
			 Character ch = s.charAt(i);
			 if(set.contains(ch)){
				 return false;
			 }
			 set.add(ch);
		 }
		 return true;
	 }
	 */
	
	public int lengthOfLongestSubstring(String s) {
		int n = s.length();
		Set<Character> set = new HashSet<>();
		int i = 0 ,j =0, ans = 0;
		while(i < n && j < n){
			if(!set.contains(s.charAt(j))){
				set.add(s.charAt(j++));
				ans = Math.max(ans, j-i);
			}else{
				set.remove(s.charAt(i++));
			}
		}
		return ans;
		
	}
	
	 @Test
	 public void test(){
		 String s = "abb";
		 //System.out.println(lengthOfLongestSubstring(s));
	 }
}
