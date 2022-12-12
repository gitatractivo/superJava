package one.leetcode.stacksnque;

import java.util.Stack;

public class duplicateBrackets {
    public static void main(String[] args) {
        System.out.println(hasDuplicate("((x+y) + (z+w)"));
    }
    public static boolean hasDuplicate(String s){
        if(s==null || s.length()<=3)    return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c != ')')    stack.push(c);
            else{
                if(stack.peek()=='(')   return true;
                while(stack.peek()!='('){
                    stack.pop();
                }
                stack.pop();

            }

        }
        return false;
    }
}
