package one.leetcode.array;

import java.util.*;
public class _15 {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{0,0,0,0}));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        Map<Integer, List<List<Integer>>> hm = new HashMap<>();
        for(int num:nums){
            for(int m: hm.keySet()){
                if(m+num==0){
                    for(List<Integer> list : hm.get(m)){
                        if(list.size()>2)   continue;
                        list.add(num);
                        boolean flag = true;
                        for (List<Integer> l:ans) {
                            if(l.equals(list)){
                                flag=false;
                                break;
                            }
                        }
                        if(flag) ans.add(list);
                    }

                }
            }
            for(int m: l1){
                List<Integer> list = new ArrayList<>();
                list.add(m);
                list.add(num);
                int sum = m+num;
                if(hm.containsKey(sum)) {
                    List<List<Integer>> l = hm.get(sum);
                    boolean flag = true;
                    for (List<Integer> li:l) {
                        if(li.equals(list)) {
                            flag=false;
                            break;
                        }
                    }
                    if(flag)    l.add(list);

                }
                else{
                    List<List<Integer>> l = new ArrayList<>();
                    l.add(list);
                    hm.put(sum,l);
                }
            }
            if(!l1.contains(num)) l1.add(num);

        }
        return ans;

    }
}
