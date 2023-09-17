package old.second;

import java.util.Arrays;

public class SearchingIterative {
    public static void main(String[] args) {
        int[] arr1 = {25, 31, 84, 75, 12, 10, 2, 36, 45, 78};
        System.out.println("Linear:");
        System.out.println(linear(arr1,12));
        System.out.println("219303019");
        System.out.println();


        int[] arr2 = {2, 10, 12, 25, 31, 36, 45, 75, 78, 84};
        System.out.println("Binary:");
        System.out.println(binary(arr2,12));
        System.out.println("219303019");
        System.out.println();
    }
    static int linear(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target) return i;
        }
        return -1;
    }
    static int binary(int[] arr,int target){
        int s = 0, e=arr.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(target==arr[m])  return m;
            if(target>arr[m]){
                s=m+1;
            }
            else {
                e=m-1;
            }
        }
        return -1;
    }

}
