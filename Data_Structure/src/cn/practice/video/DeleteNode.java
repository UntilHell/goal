package cn.practice.video;


public class DeleteNode {

	 private class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	 
	 public void deleteNode(ListNode node) {
	     
		 if(node == null){
			 return ;
		 }
		 if(node.next == null){
			 node = null;
		 }
		 
		 node.val = node.next.val;
		 ListNode delNode = node.next;
		 node.next = delNode.next;
		 delNode = null;
		 
	 }
}
