package leetcode.easy;

import org.junit.Test;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class P160 {

	
	 
	 
	public ListNode moveOffset(ListNode list,int offset){
		ListNode  p = list;
		for(int i = 0; i < offset; i++){
			p = p.next;
		}
		return p;
		
		
		
	}
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	    int lengthA = getListNode_length(headA);
	    int lengthB = getListNode_length(headB);
	    ListNode long_list = headA;
	    ListNode short_list = headB;
	    if(lengthA < lengthB){
	    	long_list = headB;
	    	short_list = headA;
	    }
	    int offset = Math.abs(lengthA - lengthB);
	    ListNode p1 = moveOffset(long_list,offset);
	    ListNode p2 = short_list;
	    while(p1 != null){
	    	if(p1 == p2){
	    		return p1;
	    	}
	    	p1 = p1.next;
	    	p2 = p2.next;
	    }
	    return null;
    }
    
    public int getListNode_length(ListNode head){
    	int count = 0;
    	while(head != null){
    		count ++;
    		head = head.next;
    	}
    	return count;
    }
    
    @Test
    public void test() {
    	ListNode node1 = new ListNode(1);
    	ListNode node2 = new ListNode(2);
    	ListNode node3 = new ListNode(3);
    	ListNode head = node1;
    	head.next = node2;
    	node2.next = node3;
    	int count = getListNode_length(head);
    	System.out.println(count);
	}
    /**
     * 
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	    int lenA = length(headA), lenB = length(headB);
	    // move headA and headB to the same start point
	    while (lenA > lenB) {
	        headA = headA.next;
	        lenA--;
	    }
	    while (lenA < lenB) {
	        headB = headB.next;
	        lenB--;
	    }
	    
	    // find the intersection until end
	    while (headA != headB) {
	        headA = headA.next;
	        headB = headB.next;
	    }
	    
    	return headA;
	}
	
		private int length(ListNode node) {
		    int length = 0;
		    while (node != null) {
		        node = node.next;
		        length++;
	    }
	    return length;
	}
     */
}
