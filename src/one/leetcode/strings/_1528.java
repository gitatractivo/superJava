package one.leetcode.strings;
//https://leetcode.com/problems/shuffle-string/
public class _1528 {
    public static String restoreString(String s, int[] indices) {
        char[] ans = new char[indices.length];
        for(int i = 0; i< ans.length; i++) ans[indices[i]]=s.charAt(i);
        return String.valueOf(ans);
    }

    private static String toString(char[] ans) {
        String string = new String(ans);

        return string;
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }
}
