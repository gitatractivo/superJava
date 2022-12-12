package one.leetcode.strings;

import java.util.Locale;

public class _709 {
    public static void main(String[] args) {
        String s = "Hello";
//        System.out.println((char)(s.charAt(0)+1));
        System.out.println(toLowerCase(s));
    }
    public static String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder(s);

        for(int i = 0;i<ans.length(); i++){
            int a = ans.charAt(i) +0;
            if(65<=a && a<=90){
               ans.replace(i,i+1,String.valueOf((char) (ans.charAt(i)+32)));
            }
        }
        return ans.toString();
    }
    public static String toLowerCase2(String s) {
        return s.toLowerCase();
    }

}
