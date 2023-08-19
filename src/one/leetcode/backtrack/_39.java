package one.leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

public class _39 {
    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2,3,6,7},7));
    }
    static List<List<Integer>> list;

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        list = new ArrayList<>();

        dfs(candidates,target,0,new ArrayList<>(),0);

        return list;

    }
    public static void dfs(int[] candidates, int target, int i,List<Integer> curr,int sum){
        if(sum >target || i==candidates.length){
            return;
        }
        if(sum==target){
            list.add(new ArrayList(curr));
            return;
        }
        curr.add(candidates[i]);
        dfs(candidates,target,i,curr,sum+candidates[i]);
        curr.remove(curr.size()-1);
        dfs(candidates,target,i+1,curr,sum);

    }

}
