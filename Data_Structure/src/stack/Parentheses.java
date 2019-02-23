package stack;
import java.util.Stack;
public class Parentheses {

	public boolean isValid(String s){
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(c == '(' || c == '{' || c == '['){
				stack.push(c);
			}else{
				//如果没有左边的，返回false
				if(stack.isEmpty()){
					return false;
				}
				char topChar = stack.pop();
				if(topChar == '(' && c != ')'){
					return false;
				}
				if(topChar == '[' && c != ']'){
					return false;
				}
				if(topChar == '{' && c != '}'){
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
