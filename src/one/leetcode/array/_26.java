package one.leetcode.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class _26 {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
    static HashSet<Integer> hs = new HashSet<>();
    static PriorityQueue<Integer> pq = new PriorityQueue<>();
    public static int removeDuplicates(int[] nums) {
        for(int i : nums){
            if(!hs.contains(i)){
                hs.add(i);
                pq.add(i);
            }

        }
//        nums = new int[nums.length];
        int i =0, count =0;
        while(!pq.isEmpty()){
            nums[i++]= pq.remove();
            count++;
        }
        while(i<nums.length){
            nums[i++]=0;
        }
        return count;
    }
}
