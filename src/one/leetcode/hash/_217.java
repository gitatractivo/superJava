package one.leetcode.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _217 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,1};
        int[] arr2={1,2,3,4};
        int[] arr3 ={1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(arr1));
        System.out.println(containsDuplicate(arr2));
        System.out.println(containsDuplicate(arr3));

    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for(int i : nums){
            if(map.contains(i))  return true;
            map.add(i);
        }
        return false;
    }
}
