package one.leetcode.stacksnque;

import java.util.Stack;

public class _150 {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2","1","+","3","*"}));
        System.out.println(evalRPN(new String[]{"4","13","5","/","+"}));

        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
    public static int evalRPN(String[] tokens) {
        int[] arr = new int[tokens.length];
        int i =0;
        for(String s: tokens){

            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int b = arr[--i];
                int a = arr[--i];
                if(s.equals("+")) {
                    a = a + b;
                } else if(s.equals("-")) {
                    a = a - b;
                } else if(s.equals("*")) {
                    a = a * b;
                } else {
                    a = a / b;
                }
                arr[i++]=a;
            }
            else{
                arr[i++]=Integer.parseInt(s);
            }
        }
        return arr[--i];

    }
}
