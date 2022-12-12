package one.leetcode.strings;

import java.util.Arrays;
import java.util.Scanner;

public class sample3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for (int i = 0; i < test; i++) {
            int length = in.nextInt();
            int[] arr = new int[length];
            for (int j = 0; j < length; j++) {
                arr[i]=in.nextInt();
            }
            System.out.println(soln(arr,length,0,0));
        }

    }
    public static int soln(int[] arr,int n,int i,int max){
        if(n==i)    return max;
        int length=arr.length;
        int temp= arr[arr.length-1];
        System.arraycopy(arr,0,arr,1,length-1);
        arr[0]=temp;
//        System.out.println(Arrays.toString(arr));
        max=Math.max(max,(arr[0]+arr[arr.length-1]));
        return soln(arr,n,++i,max);
    }
}
