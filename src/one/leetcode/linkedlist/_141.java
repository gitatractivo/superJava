package one.leetcode.linkedlist;

import java.util.ArrayList;

public class _141 {
    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        ListNode temp1 = list;
        temp1.next = new ListNode(2);
        temp1=temp1.next;
        ListNode head = temp1;
        temp1.next=new ListNode(3);
        temp1=temp1.next;
        temp1.next=new ListNode(4);
        temp1=temp1.next;
        temp1.next=head;
        System.out.println(detectCycle(list));
//        display(list);
    }
    public static boolean hasCycle(ListNode head) {
        if(head==null)  return false;
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while(temp.next!=null){
            int i = temp.val;
            for (ListNode a: list) {
                if(temp.next==a)    return true;
            }
            list.add(temp);
            temp=temp.next;
        }
        return false;
    }
    public static boolean fastSlow(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }

        }
        return false;
    }
    public static ListNode retNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return fast;
            }

        }
        return null;
    }
    public static int length(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next==null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                ListNode temp = fast;
                int length = 0;
                do{
                    temp=temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }
        }

        return 0;
    }
    public static int detectCycleMY(ListNode head) {
        ListNode fast = retNode(head);
        if(fast==null)  return -1;
        int i = 0;
        ListNode temp = fast;
        while(temp!=head){
            temp=temp.next;
            if(temp==fast)  {
                head=head.next;
                i++;
            }
        }
        return i;
    } public static ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast= fast.next.next;
            slow=slow.next;
            if(fast==slow){
                ListNode temp = fast;
                do{
                    temp=temp.next;
                    length++;
                }while(temp!=slow);
                break;

            }
        }
        if(length==0)   return null;

        ListNode f = head;
        ListNode s = head;
        while(length>0){
            s = s.next;
            length--;
        }
        while(f!=s){
            s=s.next;
            f=f.next;
        }
        return f;

    }


    public  void display(ListNode list){
        ListNode temp= list;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

}
