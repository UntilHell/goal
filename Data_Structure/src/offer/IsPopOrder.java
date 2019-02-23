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
        	//��ѹ�룬�������ȣ�����ѹ����ȵ�����popA����������ƶ�
        	stack.push(pushA[i]);
        	while(!stack.isEmpty() && stack.peek() == popA[popIndex]){
        		stack.pop();
        		popIndex ++;
        	}
        }
        return stack.isEmpty();
		
    }
}
