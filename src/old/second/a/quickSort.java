package old.second.a;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {5,6,4,2,9,3,8,1,7};
        quick(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    public static void quick(int[] arr, int s , int end){
        int p = (end+s)/2;
        int e = end-1;
        while(s<e){
            if(arr[s]>arr[e]){
                while(arr[p]<arr[e]) e--;
                if(arr[p]>arr[e]) {
                    swap(arr,s,e);
                    s++;
                    e--;
                }
            }
            else s++;
        }
        quick(arr,s,p);
        quick(arr,p,e);
    }
    public static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1]=arr[i2];
        arr[i2]= temp;
    }

}
