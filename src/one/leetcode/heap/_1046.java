package one.leetcode.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class _1046 {
    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }
    public static int lastStoneWeightRec(int[] stones) {
        if(stones.length==0) return 0;
        if(stones.length==1) return stones[0];
        Arrays.sort(stones);

        int a = Math.abs(stones[stones.length-1]-stones[stones.length-2]);
        int[] arr;
        if(a==0){
            arr = new int[stones.length-2];
            System.arraycopy(stones,0,arr,0,stones.length-2);

        }
        else {
            arr = new int[stones.length-1];
            System.arraycopy(stones,0,arr,0,stones.length-2);
            arr[arr.length-1]=a;
        }

        return lastStoneWeightRec(arr);

    }
    public static int lastStoneWeight(int[] stones){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num:stones) {
            pq.offer(num);
        }
        while(pq.size()>1){
            int a = pq.poll();
            int b = Math.abs(pq.poll()-a);
            if(b!=0) pq.offer(b);

        }
        if(pq.size()==0) return 0;

        return pq.poll();
    }
}
