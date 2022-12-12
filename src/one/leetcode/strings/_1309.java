package one.leetcode.strings;

public class _1309 {
    public static void main(String[] args) {
        String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        System.out.println(decrypt2(s));
    }

    private static String decrypt2(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);
            int num = 0;
            if(ch == '#'){
                num = s.charAt(i-1)-'0' + (s.charAt(i-2)-'0')*10;
                i -= 2;
            } else {
                num = ch - '0';
            }
            sb.append((char)('a' + num - 1));
        }

        return sb.reverse().toString();

    }

    private static String decrypt(String s) {
        String[] ans = s.split("#",-2);
        StringBuilder str = new StringBuilder();
        int i;
        for(i =0; i<ans.length-1; i++){
            for(int j = 0; j<ans[i].length()-2;j++){
                //96 because for a value is 1 hence 97-1
                //this for loop is to
                str.append((char)(96+ Character.getNumericValue(ans[i].charAt(j))));
            }
            int a = (Character.getNumericValue((ans[i].charAt(ans[i].length()-2))))*10;
            int b = (Character.getNumericValue((ans[i].charAt(ans[i].length()-1))));
            str.append((char)(96+ a +b ));
        }
        for(int j = 0; j<ans[i].length();j++){
            str.append((char)(96+ Character.getNumericValue(ans[i].charAt(j))));
        }


        return str.toString();
    }


}
