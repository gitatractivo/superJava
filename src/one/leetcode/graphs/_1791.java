package one.leetcode.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class _1791 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2},{2,3},{4,2}};
        System.out.println(findCenter(matrix));
    }
    public int findCenterBrut(int[][] edges) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<edges.length;i++){
            int a = edges[i][0],b=edges[i][1];
            if(!hm.containsKey(a)) hm.put(a,1);
            else hm.put(a,hm.get(a)+1);
            if(!hm.containsKey(b)) hm.put(b,1);
            else hm.put(b,hm.get(b)+1);
        }
        int max = Integer.MIN_VALUE;
        int key = 0;
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            if(entry.getValue()>max){
                key = entry.getKey();
                max = entry.getValue();
            }
        }
        return key;

    }

    public static int findCenter(int[][] edges) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i< edges.length; i++){
            int a = edges[i][0],b=edges[i][1];
            int max = a>b?a:b;
            if(max>list.size()){
                for (int j = list.size(); j <max ; j++) {
                    list.add(new ArrayList<>());
                }
            }
            list.get(a-1).add(b-1);
            list.get(b-1).add(a-1);

        }
        int max=0,maxi=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).size()>max){
                max=list.get(i).size();
                maxi=i;
            }
        }

        return maxi+1;

    }
}
