package old.latest.stacksNQueue;

import java.util.Arrays;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE= 10;

    private int end = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }
    public boolean isFull() {
        return end==data.length;
    }

    private boolean isEmpty()  {
        return end==0;
    }

    public boolean insert(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is Full");
        }
        data[end++]=item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        //shift to left
        int[] temp= Arrays.copyOfRange(data,1,end+1);
        data =temp;
        end--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];

    }
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0;i<end ; i++) {
            b.append(data[i]);
            if (i == end-1)
                return b.append(']').toString();
            b.append(", ");
        }
        return b.toString();

    }
}
