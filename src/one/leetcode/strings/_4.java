package one.leetcode.strings;

public class _4 {
    public static void main(String[] args) {
        int[] num1 = {1,2};
        int[] num2 ={3,4};
        System.out.println(findMedianSortedArrays(num1,num2));
    }
    public static double findMedianSortedArrays(int[] first, int[] second) {
        double ans;
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        if(mix.length%2==0) ans = ((double)(mix[mix.length/2-1]+mix[mix.length/2]))/2;
        else ans = mix[mix.length/2];
        return ans;
    }
}
