package one.leetcode.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _238 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));
    }
    public static int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0)  zeroCount++;
            else product*=nums[i];
        }
        if(zeroCount==0){
            for (int i = 0; i < nums.length; i++) {
                nums[i]= product/nums[i];
            }
        }
        if(zeroCount==1){
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]==0)  nums[i]=product;
                else nums[i]=0;
            }
        }
        if(zeroCount>1){
            for (int i = 0; i < nums.length; i++) {
                nums[i]=0;
            }
        }
        return nums;
    }

}
