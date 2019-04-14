package oncemore;

import java.util.ArrayList;
import java.util.List;


public class P017 {

	 private String letterMap[] = {
             " ",    //0
             "",     //1
             "abc",  //2
             "def",  //3
             "ghi",  //4
             "jkl",  //5
             "mno",  //6
             "pqrs", //7
             "tuv",  //8
             "wxyz"  //9
	 };
	 public List<String> letterCombinations(String digits) {
	   List<String> list = new ArrayList<String>();
	   if (digits == null || digits.length() == 0) return list;
	   findCombination(list,0,"",digits);
	   return list;
	 }

	 private void findCombination(List<String> list, int index, String s,String digits) {
	   
	   if(s.length() == digits.length()){
		   list.add(s);
		   return ;
	   }
	   
	   int c = digits.charAt(index) - '0';
	   String letter = letterMap[c] ;
	   for(int i = 0; i < letter.length(); i++){
		   findCombination(list, index+1, s+letter.charAt(i), digits);
	   }
	 }
	   
	  
}
