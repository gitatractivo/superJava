package one.leetcode.stacksnque;

import java.util.Stack;

public class _20 {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }
    //see 0ms solution very nice
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' | c == '{' | c == '[') stack.push(c);
            else if(stack.empty())  return false;
            else if (c == ')' && stack.pop() != '(') return false;
            else if (c == '}' && stack.pop() != '{') return false;
            else if (c == ']' && stack.pop() != '[') return false;
        }
        return stack.size()==0;
    }
}
