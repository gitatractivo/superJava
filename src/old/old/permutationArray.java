package old.old;

import java.util.Arrays;

public class permutationArray {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int[] ans = buildArray(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        int sum=0;
        for(int i=0; i<nums.length ; i++){
            sum+=nums[i];
            ans[i] = sum;
        }
        return ans;

    }
}
