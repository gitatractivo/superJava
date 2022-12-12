package one.prac.rec;

import java.util.ArrayList;
import java.util.List;

public class _17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
    public static String letters(int n){
        if(n<0 || n>9)  return "";
        String[] arr = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return arr[n-1];
    }
    public static List<String> letterCombinations(String digits){
//        List<String> list = new ArrayList<>();
        if(digits.isEmpty())    return new ArrayList<>();

        return let("",digits);
    }
    public static List<String> let(String p, String up){
        ArrayList<String> list= new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
//        int n = Character.getNumericValue(up.charAt(0));
        String letter = letters(up.charAt(0)-'0');
        for (char ch: letter.toCharArray()) {
            list.addAll(let(p+ch,up.substring(1)));
        }
        return list;
    }

    public static List<String> letterCombinations2(String digits){
        if(digits.isEmpty())    return new ArrayList<>();
        String[] arr = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return let2("",digits,arr);
    }
    public static List<String> let2(String p, String up,String arr[]){
        ArrayList<String> list= new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
//        int n = Character.getNumericValue(up.charAt(0));
//        char letter[] = arr[up.charAt(0)-'1'].toCharArray();
        for (char ch: arr[up.charAt(0)-'1'].toCharArray()) {
            list.addAll(let2(p+ch,up.substring(1),arr));
        }
        return list;
    }

}
