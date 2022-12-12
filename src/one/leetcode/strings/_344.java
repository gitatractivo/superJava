package one.leetcode.strings;

import java.util.Arrays;

public class _344 {
    public static void main(String[] args) {
        char[] ch = {'h','e','l','l','o'};
        reverseString(ch);
        System.out.println(Arrays.toString(ch));
    }
    public static void reverseString(char[] s) {

        for(int i=0; i<s.length/2 ; i++){
            swap(i,s.length-i-1, s);
        }


    }

    public static void swap(int i , int j, char[] s) {
        char temp = s[i];
        s[i]=s[j];
        s[j]=temp;
    }
}
