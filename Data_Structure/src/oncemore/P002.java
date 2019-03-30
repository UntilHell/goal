package oncemore;

import org.junit.Test;

public class P002 {

	public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		ListNode dummy = new ListNode(0);
		ListNode cuur = dummy;
		int sum = 0 ;
		while(l1 != null || l2 != null){
			int carry = sum / 10;
			sum = (l1 != null?l1.val:0) + (l2 != null?l2.val:0);
			
			ListNode node= new ListNode(sum % 10 + carry);
			cuur.next = node;
			if(l1 != null) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
			cuur = cuur.next;
		}
		return dummy.next;
    }
	
	@Test
	public void test(){
		ListNode node11 = new ListNode(2);
		ListNode node12 = new ListNode(4);
		ListNode node13 = new ListNode(3);
		node11.next = node12;
		node12.next = node13;
	
		ListNode node21 = new ListNode(5);
		ListNode node22 = new ListNode(6);
		ListNode node23 = new ListNode(7);
		node21.next = node22;
		node22.next = node23;
		
		addTwoNumbers( node11,  node21);
		
		
	}
}
