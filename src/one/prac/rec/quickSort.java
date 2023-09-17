package one.prac.rec;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr ={1,5,7,6,9,8,4,3,0,2};
        System.out.println(Arrays.toString(arr));

        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quick(int[] arr,int low, int hi){
        if(low>=hi){
            return;
        }
        int s= low;
        int e = hi;
        int m = s + (e-s)/2;
        int pivot = arr[m];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                swap(arr,s,e);
                s++;
                e--;
            }
        }
        quick(arr,low,e);
        quick(arr,s,hi);

    }
    private static void swap(int[]arr,int j, int i) {
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
