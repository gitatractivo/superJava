package one.leetcode.strings;

import java.math.BigInteger;

public class _7 {
    public static void main(String[] args) {
        System.out.println(reverse(-21474836));
    }
    public static int reverse(int x){
        if(x>Integer.MAX_VALUE || x<(Integer.MIN_VALUE+1))  return 0;
        if(x<0) {
            return reverse(-1*x)*-1;
        }
        StringBuilder s = new StringBuilder();
        s.append(x);
        long num = Long.parseLong(s.reverse().toString());
        if(num>Integer.MAX_VALUE)   return 0;
        return  (int) num;

    }
}
