package one.leetcode.strings;

public class _657 {
    public static void main(String[] args) {
        String moves = "RLUURDDDLU";
        System.out.println(judgeCircle(moves));

    }
    public static boolean judgeCircle(String moves) {
        int count =0;
        for (int i = 0; i < moves.length(); i++) {
            if(moves.charAt(i)=='U')    count+=5;
            else if(moves.charAt(i)=='D')   count-=5;
            else if(moves.charAt(i)=='L')   count+=11;
            else if(moves.charAt(i)=='R')   count-=11;
        }
        return count==0;
    }
    public static boolean judgeCircle2(String moves) {
        int x = 0;
        int y = 0;

        for(char c : moves.toCharArray()){
            switch(c){
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
            }
        }
        return x == 0 && y == 0;
    }

    public static boolean judgeCircle3(String moves) {

        int[] arr = new int[26];
        for(char c : moves.toCharArray()){
            arr[c-'A']++;
        }
        return arr['L'-'A']==arr['R'-'A'] && arr['U'-'A']==arr['D'-'A'];
    }

}
