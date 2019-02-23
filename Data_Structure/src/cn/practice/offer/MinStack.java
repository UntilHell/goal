package cn.practice.offer;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node) {
        if(stack1.isEmpty()){
        	stack1.push(node);
        	stack2.push(node);
        }else{
        	stack1.push(node);
        	if(stack2.peek() > node){
        		stack2.push(node);
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
    
    public int min() {
        return stack2.peek();
    }
}
