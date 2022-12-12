package one.leetcode.strings;

public class _557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String[] n = s.split(" ",-2);
        for (String p: n) {
            StringBuilder temp = new StringBuilder();
            temp.append(p);
            temp.reverse();
            ans.append(temp);
            ans.append(" ");
        }

        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}
