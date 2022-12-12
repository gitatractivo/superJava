package old.old;

import java.util.Arrays;

public class firstAndLastPostion {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,8,8,8,8,8,8,10};
        int target = 8;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1]= end;
        return ans;
    }
    public static int search (int[] nums, int target, boolean firstPosition){
        int ans= -1;
        int s=0, e= nums.length-1;
        while(s<=e){
            int mid = s+((e-s)/2);
            if(target>nums[mid]){
                s = mid +1;

            }
            else if(target< nums[mid]){
                e=mid-1;
            }
            else{
                ans=mid;
                if(firstPosition){
                   e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }

        }

        return ans;
    }
}
