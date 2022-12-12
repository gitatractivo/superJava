package old.second.b;

import java.util.ArrayList;

public class linearRec {
    public static void main(String[] args) {
        int[] arr = {1,3,6,5,48,6,5,5,4,26,9,5};
        int target = 5;



//        System.out.println(searchArrayList1(arr,target,0,new ArrayList<>()));
        System.out.println(searchArrayList2(arr,target,0));

    }
    public static int search(int[] arr, int target,int i){
        if(i==arr.length)
            return -1;
        if(arr[i]==target)
            return i;
        return search(arr,target,++i);
    }
    static ArrayList<Integer> list= new ArrayList<>();
    public static ArrayList<Integer> searchAll(int[] arr, int target,int i, ArrayList<Integer> list){
        if(i==arr.length) return list;
        if(arr[i]==target) list.add(i);
        return searchAll(arr,target,++i,list);


    }
    public static ArrayList<Integer> searchArrayList1(int[] arr,int target, int i, ArrayList<Integer> list){
        if(i==arr.length) return list;
        if(arr[i]==target) list.add(i);
        return searchArrayList1(arr,target,++i,list);
    }
    public static ArrayList<Integer> searchArrayList2(int[] arr,int target, int i ){
        ArrayList<Integer> list = new ArrayList<>();
        if(i==arr.length) return list;
        if(arr[i]==target) list.add(i);
        list.addAll(searchArrayList2(arr,target,++i));
        return list;
    }
}
