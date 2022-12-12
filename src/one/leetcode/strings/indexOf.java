package one.leetcode.strings;

public class indexOf {
    public static void main(String[] args) {
        String s = "ggg";
        String g = "g";
        int index=s.indexOf(g);
        while(index>=0){
            index=s.indexOf(g,index+1);
            System.out.println(index);
        }
    }
}
