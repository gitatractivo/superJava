package one.leetcode.hash;

import java.util.HashMap;
import java.util.HashSet;

public class _242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram",  "nagaram"));
        System.out.println(isAnagram("rat",  "car"));

    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        if(s.equals(t)) return true;
        HashMap<Character, Integer> map  = new HashMap<>();

        for (char ch :s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }
            else {
                map.put(ch, 1);
            }

        }
        for (char ch :t.toCharArray()) {
            if (map.containsKey(ch)) {
                int val = map.get(ch)-1;
                if(val==0){
                    map.remove(ch);
                }
                else{
                    map.put(ch,val);
                }
            }
            else return false;

        }
        return map.size()==0;

    }

    public static boolean isAnagram2(String s, String t) {
        if(s.length()!=t.length()) return false;
        if(s.equals(t)) return true;
        int[] arr = new int[26];
        int[] arr2 = new int[26];
        HashSet<Character> set = new HashSet<>();

        for (char ch :s.toCharArray()) {
            arr[ch-'a']++;
            set.add(ch);
        }
        for (char ch :t.toCharArray()) {
            arr2[ch-'a']++;
        }

        for (char ch :set) {
            if(arr[ch-'a']!=arr2[ch-'a'])   return false;
        }

        return true;

    }
}

