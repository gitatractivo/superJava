package one.leetcode.strings;
//https://leetcode.com/problems/determine-if-string-halves-are-alike/submissions/
import java.util.Arrays;
import java.util.Locale;

public class _1704 {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halves(s));

    }
//the question is that break string into two parts and then check if there are equal no. of
//vowels in each halfes
    private static boolean halves(String s) {
        //atq there can be both lower and upper case
        //convert to lowercase then to array then to two individual array
        String a = s.toLowerCase();
        char[] ans = a.toCharArray();
        char[] ans1 = Arrays.copyOfRange(ans,0,ans.length/2);
        char[] ans2 = Arrays.copyOfRange(ans,ans.length/2,ans.length);

        return vow(ans1)==vow(ans2);
    }

    private static int vow(char[] arr) {
        int count=0;
        for (char item: arr) {
            if(item=='a' || item=='e' || item=='i' || item=='o' || item=='u')   count++;
        }
        return count;
        
    }
}
