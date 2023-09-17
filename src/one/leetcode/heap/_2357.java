package one.leetcode.heap;

import java.util.PriorityQueue;

public class _2357 {
    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{1,5,0,3,5}));
    }
    public static int minimumOperations(int[] nums) {
        PriorityQueue<Integer> pq ;
        Integer min ;
        int count=0;
        do{
            pq= new PriorityQueue<>();
            for(int num: nums){
                if(num>0) pq.add(num);
            }
            min = pq.poll();
            System.out.println(min);
            if(min!=null){
                for(int i=0; i< nums.length; i++){
                    if(nums[i]>0) nums[i]-=min;
                }
                count++;
            }

        }
        while(min!=null);
        return count;
    }

}
