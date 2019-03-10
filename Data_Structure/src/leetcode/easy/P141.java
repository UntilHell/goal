package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class P141 {

	
  private class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
	 
    public boolean hasCycle(ListNode head) {
        //看是否已经遍历
    	Set<ListNode> set = new HashSet<ListNode>();
    	while(head != null){
    		if(set.contains(head)){
    			return true;
    		}else{
    			set.add(head);
    		}
    		head = head.next;
    		
    	}
    	return false;
    }
}
