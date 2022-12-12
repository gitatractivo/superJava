package one.leetcode.linkedlist;

import java.util.List;

import static one.leetcode.linkedlist._21_142.display;

public class rev {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode temp1 = list1;
        temp1.next = new ListNode(2);
        temp1=temp1.next;
        temp1.next=new ListNode(3);
        temp1=temp1.next;
        temp1.next=new ListNode(4);
        temp1=temp1.next;
        temp1.next=new ListNode(5);
//        list1.display();
        display(list1);
        list1= rev(list1);
//        System.out.println(list1.val);
        display(list1);
//        System.out.println(list1.val ) ;
//        System.out.println(list1.next.val);
    }
    public static ListNode rev(ListNode head){
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
}
