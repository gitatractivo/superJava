package one.leetcode.strings;

public class _925 {
    public static void main(String[] args) {
//        String name = "pyplrz", typed = "ppyypllr";
        String name = "leelee", typed = "lleeelee";

        System.out.println(isLongPressedName3(name,typed));
    }
    public static boolean isLongPressedName(String name, String typed) {
        StringBuilder ans = new StringBuilder();
        ans.append(typed.charAt(0));
        for (int i = 1; i < typed.length(); i++) {
            if(typed.charAt(i)!=typed.charAt(i-1) || (i>1 && typed.charAt(i)==typed.charAt(i-2)) && typed.charAt(i)==typed.charAt(i-1) ) ans.append(typed.charAt(i));
        }
        return name.equals(ans.toString());
    }
    public static boolean isLongPressedName2(String name, String typed) {
        int i =0 , j = 0;
        if(name.length()>typed.length()) return false;
        while(j<typed.length()){
            if(i<name.length() && name.charAt(i)==typed.charAt(j)){
                char ch = name.charAt(i);
                int countn =0 , countt=0;
                while(i<name.length() && name.charAt(i)==ch){
                    countt++;
                    i++;
                }
                while(j<typed.length() && typed.charAt(j)==ch){
                    countn++;
                    j++;
                }
                if(countt>countn)   return false;
            }

            else return false;

        }
        if(i<name.length())  return false;
        return true;
    }
    public static boolean isLongPressedName3(String name, String typed) {
        int i =0 , j = 0;
        if(name.equals(typed)) return true;
        if(name.length()>typed.length()) return false;
        while(j<typed.length()){
            if(i<name.length() && name.charAt(i)==typed.charAt(j)){
                i++;
            }

            else if(j==0 || typed.charAt(j)!=typed.charAt(j-1)) return false;
            j++;
        }
        return i==name.length();
    }

}
