package one.leetcode.array;

import java.util.Arrays;

public class matMulti {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{3,4},{5,6}};
        int[][] arr2 = {{1,2,3},{4,5,6}};
        int[][] ans = multi(arr1,arr2);
        for (int i = 0; i <ans.length ; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    private static int[][] multi(int[][] arr1, int[][] arr2) {
        int m1 = arr1.length;
        int n1 = arr1[0].length;
        int m2 = arr2.length;
        int n2 = arr2[0].length;

        if(m2!=n1)  return new int[][] {{-1,-1}};
        int[][] ans = new int[m1][n2];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                for (int k = 0; k < n1; k++) {
                    ans[i][j]+=(arr1[i][k]*arr2[k][j]);
                }
            }
        }
        return ans;
    }
}
