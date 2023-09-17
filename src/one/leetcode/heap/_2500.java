package one.leetcode.heap;

import java.util.PriorityQueue;

public class _2500 {
    public static void main(String[] args) {

    }
    public static int deleteGreatestValue(int[][] grid) {
        PriorityQueue<Integer>[] pq = new PriorityQueue[grid.length];
        for (int i = 0;i<grid.length;i++) {
            pq[i]= new PriorityQueue<>();
            for (int num :grid[i]) {
                pq[i].add(num);
            }
        }
        int sum=0;
        for (int i = 0; i < grid[0].length; i++) {
            int max =0;
            for (int j = 0; j < grid.length; j++) {
                int a = pq[j].poll();
                if(a>max){
                    max=a;
                }
            }
            sum+=max;
        }
        return sum;
    }

}
