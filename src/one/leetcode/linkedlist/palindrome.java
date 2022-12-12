package one.leetcode.linkedlist;

public class palindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode revHead = reverseList(head);
        return palin(head,revHead);
    }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)   return head;
        return revRec(null,head,head.next);
    }
    public static ListNode revRec(ListNode prev, ListNode cur, ListNode next){

        cur.next=prev;
        if(next==null){
            return cur;
        }
        return revRec(cur,next,next.next);
    }
    public boolean palin(ListNode one, ListNode two){
        if(one==null) return true;
        while(one.next==null){
            if(one.val!=two.val)    return false;
            one=one.next;
            two=two.next;
        }
        return true;
    }
}
