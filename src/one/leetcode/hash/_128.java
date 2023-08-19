package one.leetcode.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class _128 {
    public static void main(String[] args) {
//        System.out.println(longestConsecutive1(new int[]{0,0,-1}));
        System.out.println(longestConsecutive1(new int[]{9,1,4,7,3,-1,0,5,8,-1,6}));

    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int n: nums) {
            if(hm.containsKey(n-1)){
                int i = hm.remove(n-1);
                hm.put(n,i+1);
            }
            else if(!hm.containsKey(n)) hm.put(n,1);
        }
        int maxValue = Integer.MIN_VALUE;

        for (int value : hm.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
    public static int longestConsecutive1(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
//        System.out.println(Arrays.toString());
        int max = 1;
        int current = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]-1==nums[i-1]){
                current++;
                if(max<current) max=current;
            }
            else current=1;
        }
        return max;
    }
}
