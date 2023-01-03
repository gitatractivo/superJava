package one.leetcode.stacksnque;

import java.util.Arrays;
import java.util.Stack;

public class nextGreaterRight {
    public static void main(String[] args) {
        int[] arr = {4,5,8,7,3,2,4,9,1,6};
        System.out.println(Arrays.toString(nextGreatest(arr)));
        System.out.println(Arrays.toString(nextGreatest2(arr)));
        System.out.println(Arrays.toString(stock(arr)));


    }

    private static int[] nextGreatest(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length-1; i >=0 ; i--) {
            while(!stack.isEmpty() && stack.peek()<=arr[i]  ){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=stack.peek();
            }
            stack.push(arr[i]);

        }
        return ans;
    }

    private static int[] nextGreatest2(int[] arr) {
//        going from left to right here we will deal with positions
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i <arr.length ; i++) {
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]  ){
                int p = stack.pop();
                ans[p]= arr[i];
            }

            stack.push(i);

        }
        while(!stack.isEmpty()){
            int p = stack.pop();
            ans[p]= -1;
        }
        return ans;
    }
    private static int[] stock(int[] arr) {
//        going from left to right here we will deal with positions
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 0; i <arr.length ; i++) {
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]  ){
                 stack.pop();
            }
            if(stack.isEmpty()) ans[i]=i+1;
            else    ans[i]=(i-stack.peek());

            stack.push(i);

        }

        return ans;
    }

}
