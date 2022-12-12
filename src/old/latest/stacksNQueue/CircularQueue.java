package old.latest.stacksNQueue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE= 10;

    protected int end = 0;
    protected int front = 0;
    protected int size =0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }
    public boolean isFull() {
        return size==data.length;
    }

    private boolean isEmpty()  {
        return size==0;
    }

    public boolean insert(int item)throws Exception{
        if (isFull()){
            throw new Exception("Queue is full");
        }
        data[end++]=item;
        end%= data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Arraylist is empty");
        }
        int removed = data[front++];
        front=front% data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append('[');
        int i = front;
        do{
            b.append(data[i]);
            i++;
            i%=data.length;
            if(i==end)    return b.append(']').toString();

            b.append(", ");
        }
        while(i !=end);
        return b.toString();



    }
    public void display(){
        System.out.println(this);
    }
}
