package leetcode.easy;

public class P021 {

	
	private class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
		if(l1.val > l2.val){
			l1.next = mergeTwoLists(l1.next,l2);
		}else{
			l1.next = mergeTwoLists(l1,l2.next);
		}
		return l1;
	 
	}
}
