package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class P242 {

	//1.自己想的too slow
//	  public boolean isAnagram(String s, String t) {
//		  if(s.length() != t.length()) return false;
//	     char[] sc = s.toCharArray(); 
//	     char[] tc = t.toCharArray(); 
//	     List<Character> list = new ArrayList<>();
//	     for(int i = 0; i< sc.length; i++){
//	    	 list.add(new Character(sc[i]));
//	     }
//	     for (int i = 0; i < tc.length; i++) {
//			if(list.contains(new Character(tc[i]))){
//				boolean b = list.remove(new Character(tc[i]));
//			}
//		}
//	     return list.isEmpty();
//	  }
	
//	 public boolean isAnagram(String s, String t) {
//		 
//	     char[] sc = s.toCharArray(); 
//	     char[] tc = t.toCharArray(); 
//	     Arrays.sort(sc);
//	     Arrays.sort(tc);
//	     return Arrays.equals(sc, tc);
//	  }
	 public boolean isAnagram(String s, String t) {
		 if(s.length() != t.length()) return false;
		 int counts[] = new int[26];
		 for (int i = 0; i < s.length(); i++) {
			counts[s.charAt(i) - 'a']++;
			counts[t.charAt(i) - 'a']--;
		 }
		 for(int count:counts){
			 if(count != 0) return false;
		 }
		 return true;
		 
	 }
	
	
	  @Test
	  public void test(){
//		  "anagram"
//		  "nagaram"
		  System.out.println(isAnagram("anagram","nagaram"));
	  }
}
