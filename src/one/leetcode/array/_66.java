package one.leetcode.array;

import java.util.Arrays;

public class _66 {
    public static void main(String[] args) {
        int[] arr = {1,5,6,9,9,9};
        System.out.println(Arrays.toString(plusOne2(arr)));

    }
    public static int[] plusOne(int[] digits) {
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]++;
            return digits;
        }
        int[] temp = new int[digits.length];
        int i;
        for ( i = digits.length-1; i >=0 ; i--) {
            if(digits[i]!=9) {
                temp[i]=digits[i]+1;
                break;
            }
            else{
                temp[i]=0;

            }
        }
        if(i==-1)   {
            temp=new int[digits.length+1];
            temp[0]=1;
        }

        else    System.arraycopy(digits,0,temp,0,digits.length-2);
        return temp;

    }
    public static int[] plusOne2(int[] digits) {
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]++;
        }

        else{
            int i;
            for (i = digits.length - 1; i >= 0; i--) {
                if (digits[i] != 9) {
                    digits[i]++;
                    break;
                } else digits[i] = 0;

            }
            if (i == -1) {
                digits = new int[digits.length + 1];
                digits[0] = 1;
            } else System.arraycopy(digits, 0, digits, 0, i);
        }
        return digits;

    }
}
