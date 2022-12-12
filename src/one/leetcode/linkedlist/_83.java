package one.leetcode.linkedlist;

public class _83 {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode node = head;
        while(node.next!=null){
            if(node.val==node.next.val){
                node.next=node.next.next;

            }
            else{
                node=node.next;
            }
        }
        return head;
    }
//    public static ListNode rec(ListNode node){
//        if(node.next==null) return node;
//
//        while(node.val==node.next.val){
//            node.next=node.next.next;
//        }
//        node.next = rec(node.next);
//        return node;
//    }
}

