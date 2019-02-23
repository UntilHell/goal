package video;


public class SwapPairs {

	 private class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	 
	 public ListNode swapPairs(ListNode head) {
	  
		 ListNode dummyHead = new ListNode(0);
		 dummyHead.next = head;
		 ListNode p = dummyHead;
		 while(p.next != null && p.next.next != null){
			 ListNode node1 = p.next;
			 ListNode node2 = node1.next;
			 ListNode next = node2.next;
			 node1.next = node2.next;
			 node2.next = node1;
			 p.next = node2;
			 
			 p = node1;
		 }
		 
		 ListNode retNode = dummyHead.next;
		 dummyHead = null;
		 return retNode;
		 
	 }
}
