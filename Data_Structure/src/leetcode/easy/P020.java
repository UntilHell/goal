package leetcode.easy;

import java.util.Stack;

import org.junit.Test;

public class P020 {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		if(s == null || s.length() <= 0)return false;
		if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == ')') return false;
	   	for(int i = 0; i < s.length(); i++){
    	    char c = s.charAt(i);
    	   if(c == '(' || c == '{' || c == '['){
    		   stack.push(c);
    	   }else{
    		   if(stack.isEmpty()){
      			 return false;
      		   }
			   char pop = stack.pop();
			   if(pop =='(' && c != ')') return false; 
    		   if(pop =='[' && c != ']') return false; 
    		   if(pop =='{' && c != '}') return false; 
    		   
    		  
    	   }
	   	}
	   	return stack.isEmpty();
		
		
    }
	
	@Test
	public void test(){
		System.out.println(isValid("()")); 
		char c = "()".charAt(0);
		System.out.println(c=='(');
		System.out.println(c!='(');
	}
}
