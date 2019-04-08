package leetcode.medium;

import org.junit.Test;

public class P647 {

//	public boolean is_palindromic(String str){
//		if(str.length() == 1) return true;
//		char[] c = str.toCharArray();
//		int l = 0;
//		int r = c.length -1;
//		while(l != r && l < r){
//			if(c[l++] != c[r--]) return false;
//		}
//		
//		return true;
//	}
//	
	
//	 public int countSubstrings(String s) {
//		 int result = 0;
//		 for(int i = 0; i< s.length(); i++){
//			 for(int j = i+1; j<= s.length(); j++){
//				 if(is_palindromic(s.substring(i, j))){
//					result++; 
//				 }
//			 } 
//		 }
//		 return result;
		 
		 //复杂度太高,通不过
//		 return 1;
		 
		 
		 
//	 }
	@Test
	public void test(){
//		System.out.println(is_palindromic("1455"));
//		System.out.println(is_palindromic("145541"));
//		System.out.println(is_palindromic("1441"));
		System.out.println(countSubstrings("abc"));
		System.out.println(countSubstrings("aaa"));
//		String str = "abc";
//		System.out.println(str.substring(0, 0));
//		System.out.println(str.substring(0, 1));
//		System.out.println(str.substring(2, 3));
//		String str = "ab";
//		for(int i = 0; i<str.length(); i++){
//			for(int j = i+1; j<=str.length(); j++){
//				
//				System.out.println(str.substring(i, j));
//			}
//		}
	}
	
	int count = 1;
	
	public int countSubstrings(String s) {
		if(s.length() == 0) return 0;
		for(int i = 0; i < s.length()-1;i++){
			checkPlindrome(s,i,i);
			checkPlindrome(s,i,i+1);
		}
		return count;
	}

	private void checkPlindrome(String s, int i, int j) {
		while(i >=0 && j < s.length() 
				&& s.charAt(i) == s.charAt(j)){
			count++;
			j++;
			i--;
		}
	}
	
	
	
}
