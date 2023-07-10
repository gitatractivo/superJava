package one.leetcode.hash;

import java.util.Arrays;
import java.util.HashSet;

public class _36 {
    public static void main(String[] args) {
        char[][] board ={{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        for (char[] arr:board) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(isValidSudoku(board));

    }
    public static boolean isValidSudoku(char[][] board) {
        //checkingRowsNd columns
        HashSet<Character> rowSet = null;
        HashSet<Character> columnSet = null;

        for (int i = 0; i < 9; i++) {
            rowSet = new HashSet<>();
            columnSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char a = board[i][j];
                char b = board[j][i];
                if (a != '.') {
                    if(rowSet.contains(a))  return false;
                    else rowSet.add(a);
                }

                if (b != '.') {
                    if(columnSet.contains(b))   return false;
                    else    columnSet.add(b);
                }

                if(i%3==0 && j%3==0){
                    boolean check = checkBox(board,i,j);
                    if (!check) return  false;
                }

            }
        }

        return true;
    }

    public static boolean checkBox(char[][] board,int i,int j){
        HashSet<Character> set = new HashSet<>();
        int rowLength = i+3, columnLength=j+3;
        for (int k = i; k < rowLength; k++) {
            for (int l = j; l < columnLength; l++) {
                char a = board[k][l];
                if (a != '.') {
                    if(set.contains(a))  return false;
                    else set.add(a);
                }
            }
        }
        return true;
    }
}
