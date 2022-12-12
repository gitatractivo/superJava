package old.latest.linkedList;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int val){

        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
//            tail=head;
        }
        head=node;
        if(tail==null) tail=node;
        size++;

    }

    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.value + " -> ");
            node=node.next;
        }
        System.out.println("END");
    }

    public void displayRev(){
        Node node = tail;
        while(node!=null){
            System.out.print(node.value + " <- ");
            node=node.prev;
        }
        System.out.println("START");
    }


    public void insertLast(int val){
        if(tail==null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        node.prev=tail;
        tail=node;
        size++;

    }

    public void insertLastNoTail(int val){
        Node node = new Node(val);
        Node last = head;

        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
        tail=node;

    }

    public void insert(int index, int value){
        if(index==0) {
            insertFirst(value);
            return;
        }
        if(index==size-1){
            insertLast(value);
            return;
        }
        Node temp = get(index-1);
        Node node = new Node(value);
        node.next=temp.next;
        temp.next.prev = node;
        temp.next=node;
        node.prev=temp;
        size++;

    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node= node.next;

        }
        return node;
    }

    public void insert(){

    }


    private class Node{
        private final int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "" + value;
        }
    }

}
