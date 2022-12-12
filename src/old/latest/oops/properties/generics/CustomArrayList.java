package old.latest.oops.properties.generics;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private  int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;//size is also working as a index value

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(this.isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = Arrays.copyOf(data,(data.length*2));
        //copy the current items in the new array
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;

    }
    public void set(int index, int value){
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
        CustomArrayList list = new CustomArrayList();
        for(int i = 0; i< 14 ; i++){
            list.add(2*i);
        }
        System.out.println(list);

    }
}
