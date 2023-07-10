package one.leetcode.array;

import java.util.HashSet;

public class _73 {
    public static void main(String[] args) {
    }
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]==0) {
                    row[i]++;
                    col[j]++;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(row[i]!=0 || col[j]!=0) {
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void setZeroes1(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]==0) {
                    col.add(j);
                    row.add(i);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(row.contains(i) || col.contains(j)) {
                    matrix[i][j]=0;
                }
            }
        }
    }
}
