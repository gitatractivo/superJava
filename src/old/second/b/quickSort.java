package old.second.b;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {5,9,3,7,1,6};
//        sort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr, int low, int hi){
         if(low>=hi) return;
         int s = low, e=hi;
         int m = s+(e-s)/2;
         int pivot =arr[m];
         while (s<=e){
             //this is also the reason why quick sort does not
             while (arr[s]<pivot) s++;
             while (arr[e]>pivot) e--;
             if(s<=e) {
                 int temp = arr[e];
                 arr[e]=arr[s];
                 arr[s]=temp;
                 s++;
                 e--;
             }

         }
         sort(arr,low,e);
         sort(arr,s,hi);
    }
}
