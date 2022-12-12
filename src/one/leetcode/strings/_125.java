package one.leetcode.strings;

import java.util.Locale;

public class _125 {
    public static void main(String[] args) {
        String s = ".";
        System.out.println(isPalindrome4(s));

    }
    public static boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ROOT);
        String one = s.substring(0,s.length()/2);
        String two = s.substring(s.length()/2,s.length());
        StringBuilder t = new StringBuilder();
        t.append(two);
        t.reverse();
        if(s.length()%2!=0) t.deleteCharAt(t.length()-1);
        return one.equals(t.toString());
    }
    public static boolean isPalindrome2(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ROOT);
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
    public static boolean isPalindrome3(String s) {
        s=s.toLowerCase();
//        s=s.trim();
        StringBuilder ans = new StringBuilder();
        int i =0,j=s.length()-1,count=0;
        if(s.trim().length()<=1) return true;
        while(i<j){
            while((s.charAt(i)<'0'|| s.charAt(i)>'9') && (s.charAt(i)<'a'|| s.charAt(i)>'z') && i<j)    i++;
            while((s.charAt(j)<'0'|| s.charAt(j)>'9') && (s.charAt(j)<'a'|| s.charAt(j)>'z') && i<j)    j--;
            if(s.charAt(i)!=s.charAt(j))    return false;
            i++;
            j--;
            count++;
        }
        if(count<1) return false;
        return true;
    }
    public static boolean isPalindrome4(String s){
        s = s.toLowerCase();
//        s=s.trim();
        int i = 0;
        int j = s.length()-1;
        int count = 0;
        if(s.trim().length()<=1) return true;
        while(i<j){
            while((s.charAt(i)<'0' || s.charAt(i)>'9') && (s.charAt(i)<'a' || s.charAt(i)>'z') && i<j){
                i++;
            }
            while((s.charAt(j)<'0' || s.charAt(j)>'9') && (s.charAt(j)<'a' || s.charAt(j)>'z') && i<j){
                j--;
            }
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
            count++;


        }
        if(count<1) return false;
        return true;
    }
}
