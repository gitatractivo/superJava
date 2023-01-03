package one.leetcode.strings;

import java.util.*;

public class _290 {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm = new HashMap<>();
        HashMap<String, Character> hm2 = new HashMap<>();



        String[] arr = s.split(" ",-1);
        if(arr.length != pattern.length())    return false;

        for(int i = 0; i < arr.length; i++){
            char ch = pattern.charAt(i);
            if(hm.containsKey(ch)){
                if(!hm.get(ch).equals(arr[i]))  return false;
            }
            else {
                if(hm2.containsKey(arr[i])) return false;

                hm.put(ch,arr[i]);
                hm2.put(arr[i],ch);

            }
        }
        return true;
    }
}
