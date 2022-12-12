package one.leetcode.linkedlist;

public class mergeSort {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode midNext = mid.next;
        mid.next=null;
        ListNode left = sortList(head);
        ListNode right = sortList(midNext);
        return mergeTwoLists(left,right);
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode head = result;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                result.next = l1;
                l1 = l1.next;
            }else{
                result.next = l2;
                l2 = l2.next;
            }

            result = result.next;
        }

        if(l1!=null){
            result.next=l1;
        }else{
            result.next=l2;
        }

        return head.next;
    }
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow =head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

}
