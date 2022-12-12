package old.old;

import java.util.Scanner;


public class random {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(viciousKeyboard(s));


    }
    public static int viciousKeyboard(String s) throws Exception{
        if(s.length()>100)  throw new Exception("String size greater than 100");
        if(s.length()==1)   return 0;

        int count = 0;
        StringBuilder ss = new StringBuilder();
        ss.append(s);
        for(int i = 1; i<s.length();i++) {
            if(s.charAt(i)=='K' && s.charAt(i-1)=='V'){
                count++;
                ss.replace(i-1,i+1,"**");
            }
        }
        for (int i = 1; i < ss.length(); i++) {
            if(ss.charAt(i)=='V' &&ss.charAt(i-1)=='V'||ss.charAt(i)=='K' &&ss.charAt(i-1)=='K'){
                count++;
                break;
            }
        }
        return count;
    }
}
