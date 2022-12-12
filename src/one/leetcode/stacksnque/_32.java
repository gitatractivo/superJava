package one.leetcode.stacksnque;

import java.util.Stack;

public class _32 {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses("(()"));
    }
    public static int longestValidParentheses(String s) {
        int maxCount=0;
        int lCount=0;
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length();i++) {
            char c = s.charAt(i);
            if (c == '(' | c == '{' | c == '[') {
                stack.push(c);
            }
            else {
                int ch = stack.pop();
                if (stack.empty() || (c == ')' && ch != '(') || (c == '}' && ch != '{') || (c == ']' && ch != '[')) {
                    stack.clear();
                    maxCount = Math.max(lCount-1, maxCount);
                    lCount = 0;
                }
            }
            lCount++;


        }

        return maxCount;
    }
}
