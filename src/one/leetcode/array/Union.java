package one.leetcode.array;

import java.util.Arrays;

public class Union {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,7};
        int[] b = {1,3,5,9};
        System.out.println(Arrays.toString(union(a,b)));
        System.out.println(Arrays.toString(intersect(a,b)));

    }

    private static int[] intersect(int[] a, int[] b) {
        int[] ans = new int[20];
        int i =0,j=0,k=0;
        while(k<a.length&&j<b.length){
            if(a[k]==b[j]){
                ans[i++]=a[k++];
                j++;
            }
            else if(a[k]>b[j]) {
                j++;
            }
            else{
                k++;
            }
        }
        int[] abc = Arrays.copyOfRange(ans,0,i);
        return abc;
    }

    private static int[] union(int[] a, int[] b) {
        int[] ans = new int[20];
        int i =0,j=0,k=0;
        while(k<a.length&&j<b.length){
            if(a[k]<b[j]) {
                ans[i++] = a[k++];

            }
            else if(a[k]>b[j]) {
                ans[i++] = b[j++];
            }
            else{
                ans[i++]=a[k++];
                j++;
            }
        }
        while(k<a.length){

            ans[i++] = a[k++];


        }
        while(j<b.length){

            ans[i++]=b[j++];
        }
        int[] abc = Arrays.copyOfRange(ans,0,i);
        return abc;
    }
}
