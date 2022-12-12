package one.leetcode.linkedlist;//package leetcode.linkedlist;
//
//import static leetcode.linkedlist._21_142.display;
//
//public class _92 {
//    public static void main(String[] args) {
//        ListNode list1 = new ListNode(1);
//        ListNode temp1 = list1;
//        temp1.next = new ListNode(2);
//        temp1=temp1.next;
//        temp1.next=new ListNode(3);
//        temp1=temp1.next;
//        temp1.next=new ListNode(4);
//        temp1=temp1.next;
//        temp1.next=new ListNode(5);
////        list1.display();
//        display(list1);
//        list1= reverseBetween(list1);
////        System.out.println(list1.val);
//        display(list1);
//    }
//    public static ListNode reverseBetween(ListNode head, int left, int right) {
//        if(head==null || head.next==null)   return head;
//        return revRec(null,head,head.next,left-1,right-1,0);
//    }
//    public static ListNode revRec(ListNode prev, ListNode cur, ListNode next,int left, int right,int i){
//        if(i<l) return revRec(cur,next,next.next,left,right,i+1);
//        if(i==l){
//            ListNode sc = cur;
//            ListNode sp = prev;
//            ListNode e= next;
//        }
//        cur.next=prev;
//        if(next==null){
//            return cur;
//        }
//        return cur;
//    }
//}
