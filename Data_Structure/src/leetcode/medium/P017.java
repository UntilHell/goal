package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class P017 {

	private List<String> result = new ArrayList<>();
	String letterMap[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public void findCombinations(String digits,int index,String s){
		if(index == digits.length()){
			result.add(s);
			return;
		}
		char c= digits.charAt(index);
		String letter = letterMap[c-'0'];
		for(int i = 0; i < letter.length(); i++){
			findCombinations(digits, index + 1, s + letter.charAt(i));
		}
	}
	
	
	public List<String> letterCombinations(String digits) {
	 
	    if(digits.length() == 0){
	    	return null;
	    }	    
	    findCombinations(digits, 0, "");
	    return result;
    }
	
	@Test
	public void test(){
		letterCombinations("23");
	}
}
