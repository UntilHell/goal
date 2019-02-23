package cn.practice.offer;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Given s = "leetcode", return "leotcede".
 * @author Administrator
 *2019.1.5
 */
public class ReverseVowels {

	 public final static HashSet<Character> vowels 
	 = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
	 public String reverseVowels(String s) {
	      int l = 0, h = s.length() - 1;
	      
	      char result[] = new char[s.length()];
	      
	      while(l < h){
	    	  char ci = s.charAt(l);
	    	  char cj = s.charAt(h);
	    	  
	    	  if(!vowels.contains(ci)){
	    		  result[l++] = ci;
 	    	  }else if(!vowels.contains(cj)){
 	    		 result[h--] = cj;
 	    	  }else{
 	    		  result[l++] = cj;
 	    		  result[h--] = ci;
 	    	  }
	      }
	      return new String(result);
	 }
}
