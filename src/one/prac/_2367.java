package one.prac;

import java.util.HashSet;

public class _2367 {
    public static void main(String[] args) {
        System.out.println(arithmeticTriplets(new int[]{0,1,2},1));
    }
    public static int arithmeticTriplets(int[] nums, int diff) {
        boolean[] hm = new boolean[201];
        int count =0;
        for(int num: nums){
            if(num-diff>=0 && hm[num-diff]){
                if(num-2*diff>=0 && hm[num-2*diff]){
                    count++;
                }


            }
            hm[num]=true;
        }
        return count;

    }
}
