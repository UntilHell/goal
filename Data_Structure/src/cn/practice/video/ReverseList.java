package cn.practice.video;

import org.junit.Test;

public class ReverseList {

	 private class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	 public ListNode reverseList(ListNode head) {
	        
		 if(head == null){
			 return null;
		 }
		 ListNode pre = null;
		 ListNode cur = head;
		 
		 while(cur != null){
			 ListNode next = cur.next;
			 cur.next = pre;
			 pre = cur;
			 cur = next; 
		 }
		 return pre;
	 }
	 
	 private ListNode createLinkedList(int arr[], int n){
		 
		 if(n == 0){
			 return null ;
		 }
		 
		 ListNode head = new ListNode(arr[0]);
		 
		 ListNode curNode = head;
		 
		 for(int i = 1; i < n; i++){
			 curNode.next = new ListNode(arr[i]);
			 curNode = curNode.next;
		 }
		 return head;
		 
	 }
	 
	 private void printListNode(ListNode head){
		 ListNode curNode = head;
		 while(curNode != null){
			 System.out.print(curNode.val + " -> ");
			 curNode = curNode.next;
		 }
	 }
	 
	@Test
	public void test(){
		ListNode listNode = createLinkedList(new int[]{1, 2, 12, 22, 88}, 5);
		printListNode(listNode);
		System.out.println();
		printListNode(reverseList(listNode));
		
	}
}
