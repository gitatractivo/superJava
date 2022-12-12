package one.leetcode.linkedlist;

import static one.leetcode.linkedlist._21_142.display;

public class _23 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode();
        ListNode l3 = new ListNode(-1);
        ListNode[] arr = {l1,l2,l3};

        ListNode ans =mergeKLists(arr);
        display(ans);
    }


    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode result = new ListNode();
        ListNode head = result;
        for(int i= 0; i<lists.length; i++){
            head = mergeTwoLists(lists[i], head);
        }
        return head.next;
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)    return l2;
        if(l2==null)    return l1;
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

}
