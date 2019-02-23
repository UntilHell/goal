package offer;

import java.util.Stack;

public class IsPopOrder {

	public boolean IsPopOrder(int [] pushA,int [] popA) {
		Stack<Integer> stack = new Stack<Integer>();
        if(pushA == null || popA == null){
	       return false;
        }
        int popIndex = 0;
        for (int i = 0; i < popA.length; i++) {
        	//先压入，如果不相等，继续压；相等弹出，popA的索引向后移动
        	stack.push(pushA[i]);
        	while(!stack.isEmpty() && stack.peek() == popA[popIndex]){
        		stack.pop();
        		popIndex ++;
        	}
        }
        return stack.isEmpty();
		
    }
}
