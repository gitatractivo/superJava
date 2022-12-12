package one.leetcode.array;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _992 {
    public static void main(String[] args) {
        int[] arr = {3,1,4,2};
        System.out.println(Arrays.toString(sortArrayByParityII(arr)));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        for(int i = 0 ; i<nums.length; i++){
            if(i%2==0 && nums[i]%2!=0){
                int k=i+1;
                while (k<nums.length && i % 2 == 0 && nums[i] % 2 != 0) {
                    swap(nums,i,k);
                    k++;
                }
            }

            if(i%2!=0 && nums[i]%2==0){
                int k=i+1;
                while (k<nums.length && i % 2 != 0 && nums[i] % 2 == 0) {
                    swap(nums,i,k);
                    k++;
                }
            }


        }
        return nums;
    }



    private static void swap(int[] nums, int a , int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
