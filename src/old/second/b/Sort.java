package old.second.b;

import java.util.Arrays;

import static one.leetcode.array.Sorting.selection;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {4,5,9,7,8,6,2,1,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int mi=0, max = arr[0];
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>max){
                    max=arr[j];
                    mi=j;
                }
            }
            arr[mi]=arr[arr.length-i-1];
            arr[arr.length-i-1]=max;

        }
    }

}
