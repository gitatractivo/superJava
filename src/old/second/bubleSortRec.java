package old.second;

import java.util.Arrays;

public class bubleSortRec {
    public static void main(String[] args) {
        int[]arr= {9,8,7,6,5};
        sort(arr,arr.length,0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[]arr,int i , int j){
        if(i==0){
            return;
        }
        else if(j==i-1){
            sort(arr,i-1,0);
        }

        else if(arr[j+1]<arr[j]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1]=temp;
            sort(arr,i,j+1);
        }
        else sort(arr,i,j+1);

    }
}
