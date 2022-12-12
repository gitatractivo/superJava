package one.leetcode.strings;

import java.util.Arrays;

public class sortRev {
    public static void main(String[] args) {
        int[] arr = {1,5,6,8,7,2,4,9,3};
//        insSort(arr);
//        bubSort(arr);
        cycSort(arr);
//        selSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cycSort(int[] arr) {
        int i=0,count =0;
        while (i< arr.length){
            int index = arr[i]-1;
            count++;
            if(index!=i)    swap(arr,i,index);
            else    i++;

        }
        System.out.println(count);

    }

    private static void insSort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                count++;
                if(arr[j]<arr[j-1]) swap(arr,j,j-1);
                else break;
            }

        }
        System.out.println(count);
    }

    private static void selSort(int[] arr) {
        int count = 0;
        boolean correct;
        for (int i = 0; i < arr.length; i++) {
            int max = arr[0];
            int maxo = 0;

            for (int j = 1; j < arr.length-i; j++) {
                if(max<arr[j])  {
                    max=arr[j];
                    maxo=j;
                }
                count++;
            }

            swap(arr,maxo,arr.length-1-i);

        }

        System.out.println(count);

    }

    private static void bubSort(int[] arr) {
        boolean swapped;
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j <arr.length -i -1; j++) {
                if(arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                    swapped = true;
                }
                count++;

            }
            if(!swapped)     break;

        }
        System.out.println(count);
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

}
