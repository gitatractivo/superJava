package one.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

public class _220 {
    public static void main(String[] args) {

    }
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                int j = map.get(nums[i]);
                if(i-j>indexDiff) map.put(nums[i],i);
                else return true;
            }
            else{
                map.put(nums[i], i);
            }

        }
        return false;
    }

}
