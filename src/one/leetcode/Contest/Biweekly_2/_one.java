package one.leetcode.Contest.Biweekly_2;

import java.util.ArrayList;
import java.util.List;

public class _one {
    public static void main(String[] args) {
        int[] array = {59, 76, 2, 26, 49, 78, 36, 70, 64, 24};

        // Convert the array to an ArrayList
        List<Integer> list = new ArrayList<>();
        for (int element : array) {
            list.add(element);
        }
//        list.add(1);
//        list.add(2);
//        System.out.println( % 5);
        System.out.println(minimumRightShifts(list));
    }
    public static int minimumRightShifts(List<Integer> nums) {
        int n = nums.size();
        int count =0;
        for(int i = 0;i<n;i++){

            int l = (i-1+n)%n;
            int r = (i+1+n)%n;
            int lv = nums.get(l);
            int rv = nums.get(r);
            int cv = nums.get(i);
            if(lv>cv && rv>cv ) {
                if(rv>lv || count ==1) return -1;
                else count++;
            }

        }

        for(int i = 0;i<n;i++){

            int r = (i+1+n)%n;
            int rv = nums.get(r);
            int cv = nums.get(i);
            if(cv>rv ) return n-(i+1);

        }
        return -1;
    }
}
