package one.leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

public class _78 {
    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(0,nums,result,new ArrayList<>());
        return result;
    }
    public static void dfs(int i,int[] nums,List<List<Integer>> result, ArrayList<Integer> list) {
        if(i==nums.length)  {
            result.add(new ArrayList<>(list));
            return;
        }
        dfs(i+1,nums,result,list);

        list.add(nums[i]);

        dfs(i+1,nums,result,list);
        list.remove(list.size()-1);



    }
}
