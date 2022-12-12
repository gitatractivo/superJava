package old.latest.randomQues;

import java.util.Arrays;

public class _2dTo1d {
    public static void main(String[] args) {
        int i;
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[] ans = func(arr);
        System.out.println(Arrays.toString(ans));
     }

    private static int[] func(int[][] arr) {
        int m = arr.length, n= arr[0].length;
        int[] ans = new int[m*n];
        int count = 1;
        for(int i=0; i<n;i++){
            System.arraycopy(arr[i],0,ans,3*i,n);
            
        }

        return ans;
    }
}
