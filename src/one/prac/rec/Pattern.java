package one.prac.rec;

import java.util.Arrays;

public class Pattern {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,0,1,2,3,4};
        selectSort(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void triag1(int n,int col) {
        if(n==0)return;

        if(col<n) {
            System.out.print("* ");
            triag1(n, ++col);
        }
        else {
            System.out.println();
            triag1(--n, 0);
        }
    }
    private static void triag2(int n,int col) {
        if(n==0)return;

        if(col<n) {
            triag2(n, ++col);
            System.out.print("* ");
        }
        else {
            triag2(--n, 0);
            System.out.println();
        }
    }
    static void bubSort(int[] arr,int n, int col){
        if(n==0)return;

        if(col<n) {
            if(arr[col]>arr[col+1]) swap(arr,col,col+1);
            bubSort(arr,n, ++col);
        }
        else {
            bubSort(arr,--n, 0);
        }
    }

    private static void swap(int[]arr,int j, int i) {
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

    static void selectSort(int[] arr,int n, int col,int max){
        if(n==0)return;

        if(col<n) {
            if(arr[col+1]>arr[max]) max=col+1;
            selectSort(arr,n, ++col,max);
        }
        else {
            swap(arr,n,max);
            selectSort(arr,--n, 0,0);
        }
    }
}

