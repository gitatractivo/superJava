package old.latest.linkedList;

public class  LL {
    private Node head;
    private Node tail;
    private int size;


    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail==null){
            tail= head;
        }

        size+=1;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void insertLast(int val){
        if(tail==null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size+=1;
    }

    public void insert(int index, int val){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next=node;
        size++;

    }

    public void insertRec(int index,int value){
        head = insertRec(index,value,head);
    }
//

    private Node insertRec(int index,int value,Node node){
        //the node we are actually on right now will be returned
        if(index==0){
            Node temp = new Node(value,node);
            size++;
            return temp;
            //now temp.next has been at the correct index now when node will be returned than it will go to its previous
            //which is expecting its next value hence we will link the value to its correct place to its neighbours
        }
        node.next = insertRec(--index,value,node.next);
        //node will be retuned from where it was called
        return node;
    }
    public void deleteFirst(){
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node= node.next;

        }
        return node;
    }

    public void deleteLast(){
        if(size<=1){
            deleteFirst();
        }
        Node secondLast = get(size-2);
        tail=secondLast;
        tail.next=null;
        size--;

    }

    public void delete(int index){
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size-1){
            deleteLast();
            return;
        }

        Node prev = get(index-1);
        prev.next=prev.next.next;
        size--;
    }
    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node= node.next;
        }
        return null;
    }



    private class Node {
        private final int value;
        private Node next;//reference to the next object


        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }

    }
}
