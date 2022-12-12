package one.prac.rec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetIterative {
    public static void main(String[] args) {
//        int[] arr ={1,2,2};
//        List<List<Integer>> ans = subset(arr);
//        List<List<Integer>> ans2 = subsetDup(arr);
//
//        System.out.println(toString(ans));
//        System.out.println(toString(ans2));
        List<String> ans =permutations("","abcdefghij");
        System.out.println(ans);
        System.out.println(ans.size());
//        String s = "aabbcd";
//        System.out.println(sol(s,3));
//        System.out.println(s.contains(""));

    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num: arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    static List<List<Integer>> subsetDup(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int i =0 ;i<arr.length;i++) {
            int n = outer.size();
            if(i==0 || arr[i]!=arr[i-1]){
                for (int j = 0; j < n; j++) {
                    List<Integer> internal = new ArrayList<>(outer.get(j));
                    internal.add(arr[i]);
                    outer.add(internal);
                }
            }
            else{
                for (int j = n/2; j < n; j++) {
                    List<Integer> internal = new ArrayList<>(outer.get(j));
                    internal.add(arr[i]);
                    outer.add(internal);
                }
            }
        }
        return outer;
    }


    public static String toString(List<List<Integer>> ans) {
        if (ans == null)
            return "null";
        int iMax = ans.size() - 1;
        if (iMax == -1)
            return "[]";
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0;i<iMax;i++) {
            b.append(ans.get(i));
            if (i == iMax-1)
                return b.append(']').toString();
            b.append(", ");
        }
        return b.append(']').toString();

    }
    static List<String> permutations(String p , String up){
        List<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
//        for (int i = 0; i <= p.length(); i++) {
//            String f = p.substring(0,i);
//            String s = p.substring(i,p.length());
//            permutations(f + ch + s,up.substring(1));
//        }
        for (int i = 0; i <= p.length(); i++) {
            StringBuilder a = new StringBuilder();
            a.append(p);
            a.insert(i,ch);
            list.addAll(permutations(a.toString(),up.substring(1)));
        }
        return list;

    }

    public static String sol(String s,int n){
        return s.substring(n,s.length())+s.substring(0,n
        );
    }
}
