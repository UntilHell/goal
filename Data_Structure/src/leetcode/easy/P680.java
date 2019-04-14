package leetcode.easy;

public class P680 {

	public boolean validPalindrome(String s) {
		
		int i =-1, j = s.length();
		while(++i < --j){
			if(s.charAt(i) != s.charAt(j)){
				return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
			}
		}
		return true;
    }

	private boolean isPalindrome(String s, int i, int j) {
		
		while(i < j){
			if(s.charAt(i++) != s.charAt(j--)) return false;
		}
		return true;
	}
	
	
}
