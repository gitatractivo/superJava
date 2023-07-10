package one.leetcode.hash;

import java.util.*;

public class _347 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1,2,2,3,3,3},2)));
        System.out.println(Arrays.toString(topKFrequent(new int[]{1,1,1,2,2,3},2)));

    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] ans = new int[k];
        for (int i:nums) {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) ->
                        a.getValue() - b.getValue()
        );
        for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
            pq.add(entry);
            if(pq.size()>k) pq.poll();
        }
        System.out.println("pq");
        while (!pq.isEmpty()){
            ans[--k]=pq.poll().getKey();
        }
        return ans;

    }
}

