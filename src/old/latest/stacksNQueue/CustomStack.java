package old.latest.stacksNQueue;


public class CustomStack {
    //internally it has an array
    protected int[] data;
    private static final int DEFAULT_SIZE= 10;

    private int pointer = -1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push (int item) throws StackException{

        if(isFull()){
            throw new StackException("Stack is Full");
        }

        data[++pointer]=item;
        return true;
    }

    public int pop() throws StackException{

        if(isEmpty()){
            throw new StackException("Stack is Empty");
        }


        return data[pointer--];
    }

    public boolean isFull() {
        return pointer==data.length-1;
    }

    private boolean isEmpty()  {
        return pointer==-1;
    }
    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty Stack");

        }

        return data[pointer];
    }
}
