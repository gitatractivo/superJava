package one.leetcode.strings;

public class _680 {
    public static void main(String[] args) {
        String s = "deeee";//cup pucu
        System.out.println(validPalindrome(s));
    }

    private static boolean validPalindrome(String s) {
        int count = 0,i=0,j=s.length()-1;
        while(i<j){
            if (s.charAt(i) != s.charAt(j)) {
                if(s.charAt(i+1)==s.charAt(j) && (s.charAt(j)!=s.charAt(j-2))){
                    count++;
                    i++;
                }
                else if(s.charAt(i)==s.charAt(j-1)  && (s.charAt(i)!=s.charAt(i+2))){
                    count++;
                    j--;
                }
                else return false;
            }
            i++;
            j--;
        }
        return count<2;

    }
    private static boolean validPalindrome2(String s) {
//        int count =0;
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        int count = 0,i=0,j=s.length()-1;
        while(i<j){
            if (s.charAt(i) != s.charAt(j)) {
                if(s.charAt(i+1)==s.charAt(j) && (s.charAt(i)!=s.charAt(i+2))){
                    count++;
                    i++;
                }
                else if(s.charAt(i)==s.charAt(j-1)  && (s.charAt(j-2)!=s.charAt(j))){
                    count++;
                    j--;
                }
                else return false;
            }
            else
            i++;
            j--;
        }
        return false;

    }
}
