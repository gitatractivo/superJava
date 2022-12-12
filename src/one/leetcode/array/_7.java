package one.leetcode.array;

import java.util.ArrayList;
import java.util.LinkedList;

public class _7 {
    public static void main(String[] args) {
        System.out.println(reverse(901));
    }
    public static int reverse(int x) {
        if(x<0) return -reverse(-x);
        if((int)(Math.log10(x))==0 ) return x;
//        if(x==0)    return 0;

        int temp = reverse(x/10);
        int count = (int)(Math.log10(temp))+1;

        return (x%10)*(int)(Math.pow(10,count))+temp;
    }
}
