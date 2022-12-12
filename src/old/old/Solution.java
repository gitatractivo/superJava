package old.old;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7};
        int n = 3;
        int[] ans = shuffle(arr,n);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for(int i=0; i< nums.length;i++){
            if(i%2==0){
                ans[i]=nums[i * 2];
            }else{
                ans[i]=nums[n];
                n++;
            }
        }
        return ans;
        
    }
}