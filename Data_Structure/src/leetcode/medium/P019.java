package leetcode.medium;

public class P019 {

	
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			this.val = x;
		}
	}
	
	public ListNode removeNthFromEnd(ListNode head,int n){
		ListNode cur = head;
		int count = 0;
		while(cur != null){
			count ++;
			cur = cur.next;
		}
		
		ListNode dummyHead = new ListNode(0);
		dummyHead.next = head;
		cur = dummyHead;
		int i = count - n;
		while(i != 0){		
			i--;
			cur = cur.next;
		}
		cur.next = cur.next.next;
		cur.next = null;
		return dummyHead.next;
	}
}
