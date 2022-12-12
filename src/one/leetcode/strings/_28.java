package one.leetcode.strings;

public class _28 {
    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);

    }


}
