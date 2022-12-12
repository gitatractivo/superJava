package old.latest.oops.properties.generics;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private  Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;//size is also working as a index value

    public CustomGenericArrayList(){
        data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(this.isFull()){
            resize();
        }
        data[size++] = num;//here we have typecasted num to T; although it was not needed
    }
    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    private void resize() {
        Object[] temp = Arrays.copyOf(data,(data.length*2));
        //copy the current items in the new array
        data = temp;
    }


    private boolean isFull() {
        return size == data.length;
    }
    public T get(int index){
        return (T) data[index];
    }
    public int size(){
        return size;

    }
    public void set(int index, T value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        for(int i = 0; i< 14 ; i++){
            list.add(i);
        }
        System.out.println(list);

    }
}
