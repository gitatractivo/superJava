package old.latest.hash;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQ {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] ranks = {22,99,3,4,5,78,15,12,48,53};
        kLargestElements(ranks,3);
    }
    public static int[] kLargestElements(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if(i<k) pq.add(arr[i]);
            else{
                if(arr[i]>pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        int[] ans = new int[k];
        int j=0;
        for (int i:pq
        ) {
            ans[j++]=i;
        }
        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
