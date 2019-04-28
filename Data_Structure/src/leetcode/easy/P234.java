package leetcode.easy;

public class P234 {

	 public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	 }
	 /**辣鸡解法
	 public boolean isPalindrome(ListNode head) {
		Stack<ListNode> s = new Stack<ListNode>();
		ListNode head = cur;
		while(cur != null){
			s.push(cur);
			cur = cur.next;
		}
		while(head != null){
			
			if(s.pop().val != head.val) return false;
			head = head.next;
		}
		return true;
    }
	*/
	
	
//	public ListNode reverse(ListNode head){
//	
//		
//	}
}
