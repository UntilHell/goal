package cn.practice.offer;

import java.util.Stack;

public class TwoQueueImplStack {

	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	public void push(int n){
		stack1.push(n);
	}
	
	public Integer pop(){
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop()); 
			}
		}
		return stack2.pop();
	}
}
