package one.leetcode.Contest.Biweekly_1;

import java.util.*;

public class three {
    public static void main(String[] args) {
//        HashMap<String, Integer> map
//                = new HashMap<>();
//        map.put("a", 100);
//        map.put("b", 200);
//        map.put("c", 300);
//        map.put("d", 400);
//
//        // print map details
//        System.out.println("HashMap: " + map.toString());
//
//        // provide key whose value has to be obtained
//        // and default value for the key. Store the
//        // return value in k
//        int k = map.getOrDefault("y", 500);
//
//        // print the value of k returned by
//        // getOrDefault(Object key, V defaultValue) method
//        System.out.println("Returned Value: " + k);
//        System.out.println("HashMap: " + map.toString());
        int[] arr = {5,2,39,1};
        List<Integer> list = new ArrayList<>();
        for (int i:arr) {
            list.add(i);
        }
        System.out.println(maxSum(list,1,1));

    }
    public static long maxSum(List<Integer> nums, int m, int k) {
        boolean[] hs ;
        long max = 0;
        for(int i =0;i<=nums.size()-k;i++){
            hs=   new boolean[10];
            int count=0;
            long sum =0;
            for (int j = i; j < i+k; j++) {
                if(!hs[nums.get(j)]){
                    hs[nums.get(j)]=true;
                    count++;
                }
                sum+=nums.get(j);
            }
            if(count<m) continue;
            if(max<sum) max=sum;
        }
        return max;
    }
}
