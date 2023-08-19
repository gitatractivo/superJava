package one.leetcode.heap;

import java.util.PriorityQueue;

public class _973 {
    public static void main(String[] args) {

    }

    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>((arr1,arr2)->{
            double a1= Math.sqrt(arr1[0]*arr1[0]+arr1[1]*arr1[1]);
            double a2= Math.sqrt(arr2[0]*arr2[0]+arr2[1]*arr2[1]);
            return Double.compare(a1,a2);

        });;
        for (int[] arr:points) {
            pq.offer(arr);
        }
        for (int i = 0; i < k; i++) {
            ans[i]=pq.poll();
        }
        return ans;
    }
}
