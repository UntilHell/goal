package cn.practice.video;

//203. Remove Linked List Elements
public class RemoveElements {

	 private class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	 }
	public ListNode removeElements(ListNode head, int val) {
//        if(head == null){
//        	return null;
//        }
//        ListNode curNode = head;
//        while(curNode != null && curNode.val == val){
//        	ListNode delNode = curNode;
//			curNode = curNode.next;
//        }
//        if(curNode == null){
//        	return null;
//        }
		
        //²»Ð´curNode.next != null »á
//		while(curNode != null){
//			
//			if(curNode.next.val == val){
//				ListNode delNode = curNode.next;
//				curNode.next = delNode.next;
//				curNode = curNode.next;
//				
//			}else{
//				curNode = curNode.next;
//			}
//		}
//		return head;
		
		
		ListNode dummyHead = new ListNode(0);
		
		dummyHead.next = head;
		ListNode cur = dummyHead;
		while(cur.next != null){
			if(cur.next.val == val){
				ListNode delNode = cur.next;
				cur.next = delNode.next;
			}else{
				cur = cur.next;
			}
		}
		
		return dummyHead.next;
    }
}
