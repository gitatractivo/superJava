package one.leetcode.strings;

public class newss {
    public static void main(String[] args) {
        String str = "university ";
        int i =0,j=str.length()-1;
        char[] p = str.toCharArray();
        for (i= 0; i < j; i++) {
            char t=p[i];
            p[i]=p[j-i];
            p[j-i]=t;
            System.out.println(p[i]);
        }
    }
}
