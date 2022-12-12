package one.leetcode.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class _73 {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1, 3, 1,5}};
        for(int i=0; i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        setZeroes(matrix);
        for(int i=0; i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    public static void setZeroes(int[][] matrix) {
        int count =0;
        ArrayList<Integer> listc = new ArrayList<Integer>();
        ArrayList<Integer> listr = new ArrayList<Integer>();

        for(int i = 0; i<matrix.length; i++){
            for (int j = 0; j <matrix[i].length ; j++) {
                if(matrix[i][j]==0){
                    listc.add(j);
                    listr.add(i);

//                    break;
                }
            }
        }
        col(matrix,listc);
        row(matrix,listr);


    }
    public static void col(int[][] matrix,ArrayList<Integer> list) {
        int count =0;
        for (int i = 0; i < list.size(); i++) {
            int k = list.get(i);
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][k]=0;
            }
        }

    }
    public static void row(int[][] matrix,ArrayList<Integer> list) {
        int count =0;
        for (int i = 0; i < list.size(); i++) {
            int k = list.get(i);
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[k][j]=0;
            }
        }

    }
}
