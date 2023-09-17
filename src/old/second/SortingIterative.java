package old.second;

import java.util.Arrays;

public class SortingIterative {
    public static void main(String[] args) {
        int[] arr1 = {25,31,84,75,12,10,2,36,45,78};
        System.out.println("Bubble Sort:");
        System.out.println(Arrays.toString(arr1));
        buble(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("219303019");
        System.out.println();


        int[] arr2 = {25,31,84,75,12,10,2,36,45,78};
        System.out.println("Selection Sort:");
        System.out.println(Arrays.toString(arr2));
        select(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println("219303019");
        System.out.println();

        int[] arr3 = {25,31,84,75,12,10,2,36,45,78};
        System.out.println("Insertion Sort:");
        System.out.println(Arrays.toString(arr3));
        insertion(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println("219303019");




    }
    static void buble(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            boolean swap=false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    swap(arr, j, j + 1);
                    swap=true;
                }
            }
            if(!swap) break;
        }
    }

    static void select(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int max = arr[0], maxI = 0;
            for (int j = 1; j < arr.length-i; j++) {
                if(max<arr[j]) {
                    max=arr[j];
                    maxI=j;
                }
            }
            swap(arr,maxI,arr.length-i-1);
        }
    }
    static void insertion(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int temp = arr[i];
            while(j>0&&temp<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]= temp;
        }
    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
