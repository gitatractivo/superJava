package old.old;

import java.util.Arrays;

public class transpose {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0; i< arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();

        transpose(arr);
//        for(int i=0; i< arr.length; i++){
//            for(int j = 1+i; j< arr.length; j++){
//                swap(arr[i][j],arr[j][i]);
//            }
//        }
        for(int i=0; i< arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }


    }
    static void transpose(int[][] arr){
        for(int i=0; i< arr.length; i++){
            for(int j = 1+i; j< arr.length; j++){
                swap(i,j,arr);
            }
        }

    }
    static void swap (int num1, int num2,int[][]arr){
        int temp = arr[num2][num1];
        arr[num2][num1]=arr[num1][num2];
        arr[num1][num2]=temp;

    }
}
