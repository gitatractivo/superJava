package one.leetcode.linkedlist;

public class _876 {
    //take two pointers one fast and other slow the one which moves fast will cover double the distance hence when fast moves end slow will be at middle

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
