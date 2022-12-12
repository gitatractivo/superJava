package two.oops;

import java.util.Scanner;

public class oopsLab {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        do{
            ch= in.next().charAt(0);
            System.out.println(ch);
        }
        while(ch!=Character.MIN_VALUE);
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] ans = multi(arr,arr2);
//        replaceMax(ans);
//        int[][] ans  = sub(arr,arr2);
//        int[][] ans  = add(arr,arr2);
//
//
//        for (int i = 0; i < ans.length; i++) {
//            System.out.println(Arrays.toString(ans[i]));
//        }
    }

    private static int[][] add(int[][] arr, int[][] arr2) {
        int[][] ans = new int[arr.length][arr[0].length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j]=arr[i][j]+arr2[i][j];
            }
        }
        return ans;
    }
    private static int[][] sub(int[][] arr, int[][] arr2) {
        int[][] ans = new int[arr.length][arr[0].length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j]=arr[i][j]-arr2[i][j];
            }
        }
        return ans;
    }

    private static void replaceMax(int[][] ans) {
        int max = 0 , min = Integer.MAX_VALUE;
        int[] maxI = new int[2], minI = new int[2];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                if(ans[i][j]>max){
                    max = ans[i][j];
                    maxI[0]=i;
                    maxI[1]=j;
                }
                if(ans[i][j]<min){
                    min = ans[i][j];
                    minI[0]=i;
                    minI[1]=j;
                }

            }
        }
        int temp = ans[minI[0]][minI[1]];
        ans[minI[0]][minI[1]] = ans[maxI[0]][maxI[1]];
        ans[maxI[0]][maxI[1]] = temp;
    }

    private static int[][] multi(int[][] arr, int[][] arr2) {
        if(arr[0].length!=arr2.length)  return new int[][]{};
        int[][] ans = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                for (int k = 0; k < arr[0].length; k++) {
                    ans[i][j]+=(arr[i][k]*arr2[k][j]);
                }
            }
        }
        return ans;
    }
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)  max=arr[i];
        }
        return max;
    }
}
