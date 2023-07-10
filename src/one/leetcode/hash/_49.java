package one.leetcode.hash;

import java.util.*;

public class _49 {
    public static void main(String[] args) {
//        String s = "dcba";
//        HashMap<String, List<String>> hm = new HashMap<>();
//        ArrayList<String> list = new ArrayList<>();
////        list.add(s);
//        hm.put("abcd",new ArrayList<>(){});
//        System.out.println(hm.get("abcd"));
        funcBrut(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});


    }
    public static String sortString(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static List<List<String>>  funcBrut(String[] strs){
        HashMap<String, List<String>> hm = new HashMap<>();
        List<List<String>> ans = new LinkedList<>();
        for (String s:strs) {
            String ss = sortString(s);
            if(hm.containsKey(ss)){
                hm.get(ss).add(s);
            }
            else hm.put(ss,new ArrayList<>(){{
                add(s);
            }});
        }

        for(List<String> list: hm.values()){
            ans.add(list);
        }
        return ans;
    }
}
