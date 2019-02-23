package cn.practice.offer;

public class Merge {

	private class ListNode{
		int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	public ListNode merge(ListNode list1,ListNode list2) {
        if(list1 == null){
        	return list2;
        }else if(list2 == null){
        	return list1;
        }
        ListNode pMergeHead = null;
        if(list1.val < list2.val){
        	pMergeHead = list1;
        	pMergeHead.next = merge(list1.next,list2);
        }else{
        	pMergeHead = list2;
        	pMergeHead.next = merge(list1,list2.next);
        }
        return pMergeHead;
    }
}
