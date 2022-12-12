package old.latest.stacksNQueue;

import java.util.Arrays;

public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }


    @Override
    public boolean push(int item) throws StackException {
        //this takes of it being full
        if(this.isFull()){
            //double the array size
            int[] temp = Arrays.copyOf(data,data.length*2);
            data=temp;
        }
        return super.push(item);
    }
}
