package old.latest.stacksNQueue;

import java.util.Arrays;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }


    @Override
    public boolean insert(int item) throws Exception {

        if(this.isFull()){
            //double the array size
            int[] temp = new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[(front+i)%data.length];//important
            }
            front = 0;
            end = data.length;
            data=temp;
        }

        return super.insert(item);
    }
}
