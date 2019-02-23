package cn.practice.video;


public class RemoveNthFromEnd {

	 private class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	 
	public ListNode removeNthFromEnd(ListNode head, int n) {
		/*class Solution {
		    public ListNode removeNthFromEnd(ListNode head, int n) {
		        ListNode cur = head;
		        if(cur.next == null){
		            return  null;
		        }
		        
				int i = 0;
				while(i < n){
					cur = cur.next;
					i++;
				}
				while(cur.next != null){
					cur = cur.next; 
					head = head.next;
				}
				
				head.next = head.next.next;
				head.next = null;
				return head;
		    }
		}*/
		ListNode dummyHead = new ListNode(0);
		dummyHead.next = head;
		ListNode p = dummyHead;
		ListNode q = dummyHead;
		
		for(int i = 0;i < n + 1; i++){
			p= p.next;
		}
		
		while(p != null){
			p = p.next;
			q= q.next;
		}
		
		ListNode delNode= q.next;
		q.next = delNode.next;
		delNode = null;
		return dummyHead.next;
		
		
    }
}
