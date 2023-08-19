package one.leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("2347"));
    }
    static List<String> list = new ArrayList<>();
    static String[] arr = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static List<String> letterCombinations(String digits) {
        if(digits.isEmpty())    return new ArrayList<>();
        backTrack("",digits);
        return list;
    }
    public static void backTrack(String p, String digits  ){
        if(digits.isEmpty()){
            list.add(p);
            return;
        }
        String letters = arr[digits.charAt(0)-'1'];
        for(char ch: letters.toCharArray()){
            backTrack(p+ch,digits.substring(1));
        }
    }
}
