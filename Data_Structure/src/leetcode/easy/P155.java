package leetcode.easy;

import java.util.Stack;

public class P155 {


    /** initialize your data structure here. */
	
    public P155() {
    	
    }
    Stack<Integer> stack1 = new Stack<>() ;
	Stack<Integer> stack2 = new Stack<>() ;
    public void push(int x) {
    	if(stack1.isEmpty()){
    		stack1.push(x);
    		stack2.push(x);
    	}else{
    		stack1.push(x);
    		if(stack2.peek() > x){
    			stack2.push(x);
    		}else{
    			stack2.push(stack2.peek());
    		}
    		
    	}
    }
    
    public void pop() {
        stack1.pop();
        stack2.pop();
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int getMin() {
    	return stack2.peek();
    }

}
