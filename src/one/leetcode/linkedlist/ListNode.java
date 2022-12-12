package one.leetcode.linkedlist;

import java.sql.ClientInfoStatus;

public class ListNode {
        private ListNode head;
        private ListNode tail;


        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }


//        public void display(){
//                ListNode temp=head;
//                while(temp!=null){
//                        System.out.print(temp.val + " -> ");
//                        temp=temp.next;
//                }
//                System.out.println("END");
//        }
public  void display(ListNode list){
        ListNode temp= list;
        while(temp!=null){
                System.out.print(temp.val + " -> ");
                temp=temp.next;
        }
        System.out.println("END");
}


}
