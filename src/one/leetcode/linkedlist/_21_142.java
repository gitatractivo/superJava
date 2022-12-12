package one.leetcode.linkedlist;

public class _21_142 {

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

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode temp1 = list1;
        temp1.next = new ListNode(2);
        temp1=temp1.next;
        temp1.next=new ListNode(4);
//        list1.display();
        display(list1);
        ListNode list2 = new ListNode(1);
        ListNode temp2 = list2;
        temp2.next = new ListNode(3);
        temp2=temp2.next;
        temp2.next=new ListNode(4);
//        list1.display();
        display(list2);




        ListNode list3 = mergeTwoLists(list1,list2);
        display(list3);








    }
    public static void display(ListNode list){
        ListNode temp= list;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }


}

