package one.leetcode.Contest.Biweekly_1;

import java.util.Arrays;

public class oneTwo {
    public static void main(String[] args) {

//        System.out.println(canBeEqual("abcd","dacb"));
//        System.out.println('a'-'a');
        System.out.println(checkStrings("kvwdssgl",
                "wskxsdgv"));

    }

    public static boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
       char one[] = s1.toCharArray();
       char two[] = s2.toCharArray();


       //case 1 ac
        if((one[0]==two[2])&&(one[2]==two[0])&&(one[1]==two[1])&&(one[3]==two[3])) return true;
        if((one[0]==two[0])&&(one[2]==two[2])&&(one[1]==two[3])&&(one[3]==two[1])) return true;
        if((one[0]==two[2])&&(one[2]==two[0])&&(one[1]==two[3])&&(one[3]==two[1])) return true;
        return false;



    }

    public static boolean checkStrings(String s1, String s2) {
        int[] oneEven = new int[26];
        int[] oneOdd = new int[26];
        int[] twoEven = new int[26];
        int[] twoOdd = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            if(i%2==0){
                int o  = s1.charAt(i)-'a';
                int t  = s2.charAt(i)-'a';
                oneEven[o]++;
                twoEven[t]++;

            }
            else{
                int o  = s1.charAt(i)-'a';
                int t  = s2.charAt(i)-'a';
                oneOdd[o]++;
                twoOdd[t]++;
            }
        }
        System.out.println(Arrays.toString(oneOdd));
        System.out.println(Arrays.toString(twoOdd));

        for (int i = 0; i < 26; i++) {
            if(oneOdd[i]!=twoOdd[i] || twoEven[i]!=oneEven[i]) return false;
        }


        return true;
    }
}
