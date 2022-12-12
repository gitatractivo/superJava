package old.latest.linkedList;

public class CLL {
    private Node head;
    private Node tail;
    private int size;



    public CLL() {
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        if(head==null){
            head=node;//why not head.next and tail.next = node here?
            tail=node;
//            tail.next=head;
//            head.next=tail;
            return;
        }
        tail.next = node;
        node.next= head;
        tail = node;
        size++;
    }

    public void display(){
        Node node = head;
        if(head!=null){
            do{
                System.out.print(node.value + " -> ");
                node = node.next;
            }
            while(node!=head);
            System.out.println("END");
        }
    }

    public void delete(int value){
        if(head==null) return;
        if(head.value==value){
            tail.next=head.next;
            head=head.next;
            return;
        }
        Node temp = head;
        while(temp.next.value!=value){
            temp=temp.next;
        }
//        if(temp==tail){
//            temp.next
//        }
        //see kunals code once
        temp.next=temp.next.next;
        size--;

    }

    private class Node{
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
