package one.leetcode.heap;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class _621 {
//    Pair
    private class Pair{
        int val;
        int freq;

        public Pair(int val, int freq) {
            this.val = val;
            this.freq = freq;
        }
    }
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Queue<Pair> que = new LinkedList<>();
        int[] arr = new int[26];
        for (char ch:tasks) arr[ch-'A']++;

        //Here we don't really care about what char is going inside pq we just care about its frequency
        for(int i: arr) if(i>0) pq.add(i);
        int time = 0;

        //we need to process the maximum frequency first
        //why because if we do it at last than lots of ideal time


        while(!pq.isEmpty() && !pq.isEmpty()){
            time++;
            if(!pq.isEmpty()){
                int val = pq.poll();
                val--;
                que.add(new Pair(val,time+n));
            }
            if(!que.isEmpty() && que.peek().freq==time){
                pq.add(que.poll().val);
            }
        }

        return time;

        
    }
}
