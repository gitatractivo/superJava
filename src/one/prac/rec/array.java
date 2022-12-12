package one.prac.rec;

import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,2,5};
        int target = 2;

        System.out.println(findAll(arr,target,0));

    }
    static boolean isSorted(int[] arr){
        return isSortedRec(arr, 0);
    }
    static boolean isSortedRec(int[] arr, int i){
        if(i == arr.length-1) return true;
        return arr[i]<=arr[i+1] && isSortedRec(arr,++i);
    }
    static ArrayList<Integer> findAll(int[] arr, int target, int i){
        ArrayList<Integer> list = new ArrayList<>();
        if(i==arr.length) return list;
        if(arr[i]==target)  list.add(i);
        list.addAll(findAll(arr,target,i+1));
        return list;
    }
}
