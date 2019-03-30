package leetcode.easy;

import org.junit.Test;

public class P058 {

	public int lengthOfLastWord(String s) {
        String str = s.trim();
        if(str.length()==0) return 0;
        int N = str.length();
        int r = N-1;
        int count = 0;
        while(r >=0 ){
            
            if(str.charAt(r)==' ') break;
            r--;
            count++;
                
        }
        if(r==N-1) return 1; 
        return count;
    }
	
	@Test
	public void test(){
		//System.out.println(" ".trim().length());
		System.out.println(lengthOfLastWord(" "));
		
	}
}
