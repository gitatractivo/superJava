package one.prac.rec;

public class nKnights {
    static int count = 0;
    public static void main(String[] args) {
        int n=8;
        knights(new boolean[n][n],0,0,n);
        System.out.println(count);
    }
    public static void knights(boolean[][] board,int row, int col, int knights){
        if(knights==0){
            display(board);
            System.out.println();
            return;
        }
        if(row==board.length-1 && col== board.length) return;
        if(col==board.length){
            knights(board, row+1, 0, knights);
            return;
        }
        if(isSafe(board,row,col)){
            board[row][col]=true;
            knights(board,row,col+1,knights-1);
            board[row][col]=false;

        }
        knights(board,row,col+1,knights);

    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if(isValid(board,row-2,col-1)){
            if(board[row-2][col-1]) return false;
        }
        if(isValid(board,row-2,col+1)){
            if(board[row-2][col+1]) return false;
        }
        if(isValid(board,row-1,col-2)){
            if(board[row-1][col-2]) return false;
        }

        if(isValid(board,row-1,col+2)){
            if(board[row-1][col+2]) return false;
        }
        return true;
    }

    private static boolean isValid(boolean[][] board, int row, int col){
        if(row>=0 && row< board.length && col>=0 && col< board.length)  return true;
        return false;
    }

    static void display(boolean[][] board){
        count++;
        for (int i = 0; i < board.length; i++) {
            StringBuilder ans = new StringBuilder();
            ans.append('[');
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j])    ans.append("K");
                else    ans.append('.');
                ans.append(" ");
            }
            ans.append(']');
            System.out.println(ans.toString());
        }
    }
}
