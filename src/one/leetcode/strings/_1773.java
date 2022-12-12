package one.leetcode.strings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Arrays;

public class _1773 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> items = new ArrayList<ArrayList<String>> (Arrays.asList(new ArrayList<String>(Arrays.asList("phone","blue","pixel")),new ArrayList<String>(Arrays.asList("computer","silver","lenovo")),new ArrayList<String>(Arrays.asList("phone","gold","iphone"))));
//        ArrayList<ArrayList<String>> items = new ArrayList<ArrayList<String>>();
        System.out.println(countMatches(items, "type", "phone"));

    }
    public static int hash(String ruleKey){
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("type",0);
        hm.put("color",1);
        hm.put("name",2);

        return hm.get(ruleKey);
    }
    public static int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {
        int i=hash(ruleKey),count=0;
        for(int j=0; j<items.size();j++){
            if(ruleValue.equals(items.get(j).get(i))) count++;
        }
        return count;


    }
}
