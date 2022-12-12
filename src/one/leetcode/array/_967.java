package one.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;

public class _967 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numsSameConsecDiff(2, 0)));
        System.out.println(Math.log10(181));
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static int count=0;
    public static int[] numsSameConsecDiff(int n, int k) {
        for(int i =1; i<=9; i++){
            helper(i,n,k);
        }
        int[] arr = new int[count];
        int i =-1;

        for(int in: list){

            arr[++i]=in;
        }
        return arr;
    }
    public static void helper(int i, int n, int k){
        if((int)(Math.log10(i))==n-1){
            list.add(i);
            count++;
            return;
        }
        int temp =i%10;
        int sub = temp -k, add = temp +k;
        if(sub>=0 && sub <=9){
            helper(i*10+sub,n,k);
        }
        if(add>=0 && add <=9&& k!=0){
            helper(i*10+add,n,k);
        }

    }
}
