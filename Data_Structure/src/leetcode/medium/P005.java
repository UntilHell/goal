package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class P005 {

	//Input: "babad"
	//Output: "bab"
	//Note: "aba" is also a valid answer.
	 public String longestPalindrome(String s) {
		 if(s == null || s.length() == 0) return s;
		 Set<String> permutations = permutation(s);
		 Set<String> palindrome = new HashSet<String>();
		 for (String one : permutations) {
			 if(isPalindrome(one)) palindrome.add(one);
		 }
		 int max = 0;
		 String result = "";
		 for (String p : palindrome) {
			max = Math.max(p.length(),max);
		 }
		 for (String p : palindrome) {
			if(p.length() == max) result = p;
		 }
		 return result;
		 
	 }
	 private Set<String> permutation(String s){
		 if(s == null || s.length() == 0) return null;
		 Set<String> set = new HashSet<>();
		 helper(set, "", s, 0);
		 return set;
	 }
	 private void helper(Set<String> set ,String one ,String s, int index) {
		 if(index <=s.length() && one.length() !=0){
			 set.add(one);
		 }
		 
		 for(int i = index; i < s.length();i++){
			 helper(set, one + s.charAt(i), s, i+1);
		 }
		 return;
	 }
	
	private boolean isPalindrome(String s){
		int i = 0, j = s.length()-1;
		while(i < j){
			if(s.charAt(i++) != s.charAt(j--)) return false;;
		}
		return true;
	}
	
	 public static void main(String[] args) {
//		String s = new Solution().longestPalindrome("babad");
		//String s = new Solution().longestPalindrome("cbbd");
		//System.out.println(s);
	}
	 
	 private Set<String> generateSub(String s){
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				set.add(s.substring(i, j));
			}
			
		}
		return set;
	}
}
