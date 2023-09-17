package one.leetcode.heap;

import old.latest.hash.PriorityQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class _1337 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };
        int[] arr = kWeakestRows(matrix,3);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.sold==o2.sold){
                    return Integer.compare(o1.index, o2.index);
                }
                return Integer.compare(o1.sold, o2.sold);
            }
        });

        for (int i = 0; i < mat.length; i++) {
            int count=0;
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j]==0){
                    break;
                }
                count++;


            }
            pq.add(new Pair(count,i));

        }

        for (int i = 0; i < k; i++) {
            ans[i]=pq.poll().index;
        }



        return ans;
    }

}
  class Pair{
    int sold;
    int index;

    public Pair(int sold, int index) {
        this.sold = sold;
        this.index = index;
    }

}
