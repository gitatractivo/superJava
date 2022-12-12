package one.leetcode.strings;

import java.util.Stack;

public class _32 {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses("(()"));
    }


    public static int longestValidParentheses(String s) {
        int maxCount=0;
        int lCount=0;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' | c == '{' | c == '[') {
                stack.push(c);
                lCount-=2;
            }
            else if(stack.empty() || c == ')' && stack.pop() != '(' || c == '}' && stack.pop() != '{' || c == ']' && stack.pop() != '[') {
                stack.clear();
                maxCount=Math.max(lCount,maxCount);
                lCount=0;
            }
            else{
                stack.pop();
                lCount+=4;
            }


        }
        if(maxCount==0)    maxCount=lCount;
        return maxCount;
    }
}
