package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class P438 {

//	 public List<Integer> findAnagrams(String s, String p) {
// 		char pp[] = p.toCharArray();
//		int pL = p.length(); 
//		List<Integer> list = new ArrayList<>();
//		Arrays.sort(pp);
//		String ppp = new String(pp);
//		for(int i = 0; i <= s.length() - p.length(); i++){
			//这里还是的排序，复杂度很高
//			if(new String(Arrays.sort(s.substring(i, pL).toCharArray()).to.equals(ppp)){
//				list.add(i);
//			}
//			 pL++;
//		}
//		return list;
//	 }
	 @Test
	  public void test(){
//		  String s = "";
//		  System.out.println(s.length());
//		  System.out.println(s==null);
		 //System.out.println(findAnagrams("abab","ab"));
		 System.out.println('a' - "aa".charAt(1));
		 System.out.println('a' - "ab".charAt(1));
		 System.out.println(1*2);
	  }
	 
//	 public List<Integer> findAnagrams(String s, String p) {
//		 if(s == null || s.length()<0 ||s.length() < p.length()) return null;
//		 int count[] = new int[26];
//		 int sl = s.length();
//		 int pl = p.length();
//		 for(int i = 0; i < p.length(); i++){
//			 int temp = p.charAt(i) - 'a';
//			 count[temp]++;
//			 count[temp] =(pl-sl +1) * count[temp] ;
//		 }
//		 for(int i = 0; i < sl -pl + 1; i++){
//			 for(int j = i; j < p.length(); j++){
//				 int temp = s.charAt(i) - 'a';
//				 count[temp] --;
//			 }			 
//		 }
//		 int min = count[0];
//		 for(int i = 1; i< count.length; i++){
//			 min = Math.max(min, count[i]);
//		 }
//		 return min;
//	 }
	 
	 public List<Integer> findAnagrams(String s, String p) {
		 List<Integer> list = new ArrayList<>();
		 if(s == null|| s.length() == 0||p==null||p.length()>0) return list;
		 int hash[] = new int[256];
		 for(char c : p.toCharArray()){
			 hash[c]++;
		 }
		 
		 //
		 int left = 0,right = 0,count = p.length();
		 while(right < s.length()){
			 if(hash[s.charAt(right++)]-- >= 1) count--;
			 if(count==0) list.add(left);
			 if(right - left == p.length() && hash[s.charAt(left++)]++ >0)count++;
		 }
		 
		 return list;
	 }
	 
}
