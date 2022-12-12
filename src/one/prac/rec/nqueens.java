package one.prac.rec;

public class nqueens {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(queens(new boolean[n][n],0));
    }
    static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        //placing the queen and checking the row and column
        for (int col = 0; col < board.length; col++) {
            //place the queen if it is safe
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=queens(board,row+1);
                board[row][col]=false;

            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical row
        for (int i = 0; i < row; i++) {
            if(board[i][col])   return false;
        }
        //check diagnol left row
        int r =row-1,c=col-1;
        while(r>=0 && c>=0){
            if(board[r--][c--])   return false;
        }
        //check diagnol right row
        r =row-1;
        c=col+1;
        while(r>=0 && c< board.length ){
            if(board[r--][c++])   return false;
        }

        return true;
    }

    static void display(boolean[][] board){
        for (int i = 0; i < board.length; i++) {
            StringBuilder ans = new StringBuilder();
            ans.append('[');
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j])    ans.append("Q");
                else    ans.append('.');
                ans.append(" ");
            }
            ans.append(']');
            System.out.println(ans.toString());
        }
    }
}
