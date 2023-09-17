package old.second;

import java.util.Arrays;

public class SortingRecursive {
    public static void main(String[] args) {
        int[] arr1 = {25,31,84,75,12,10,2,36,45,78};
        System.out.println("Bubble Sort:");
        System.out.println(Arrays.toString(arr1));
        buble(arr1,0,0);
        System.out.println(Arrays.toString(arr1));
        System.out.println("219303019");
        System.out.println();


        int[] arr2 = {25,31,84,75,12,10,2,36,45,78};
        System.out.println("Selection Sort:");
        System.out.println(Arrays.toString(arr2));
        select(arr2,0,1,arr2[0],0);
        System.out.println(Arrays.toString(arr2));
        System.out.println("219303019");
        System.out.println();

        int[] arr3 = {25,31,84,75,12,10,2,36,45,78};
        System.out.println("Insertion Sort:");
        System.out.println(Arrays.toString(arr3));
        insertion(arr3,1,1);
        System.out.println(Arrays.toString(arr3));
        System.out.println("219303019");




    }
    static void buble(int[] arr,int i,int j){
        if(i>=arr.length-1){
            return;
        }
        if(j>=arr.length-i-1){
            buble(arr,i+1,0);
            return;
        }
        if(arr[j]>arr[j+1]) swap(arr,j,j+1);

        buble(arr,i,j+1);

    }

    static void select(int[] arr,int i,int j,int max,int maxI){
        if(i>=arr.length-1){
            return;
        }
        if(j>=arr.length-i){
            swap(arr,maxI,arr.length-i-1);
            select(arr,i+1,1,arr[0],0);
            return;
        }
        if(max<arr[j]) {
            max=arr[j];
            maxI=j;

        }
        select(arr,i,j+1,max,maxI);


}
    static void insertion(int[] arr,int i,int j){
        if(i>=arr.length){
            return;
        }
        if(j==0){
            insertion(arr,i+1,i+1);
            return;
        }
        if(j>0&&arr[j]<arr[j-1]){
            swap(arr,j,j-1);
            insertion(arr,i,j-1);
        }
        insertion(arr,i+1,i+1);

    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
