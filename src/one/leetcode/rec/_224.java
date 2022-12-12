package one.leetcode.rec;

public class _224 {
    public static void main(String[] args) {
        String s ="(1+(4+5+2)-3)+(6+8)";
//        String s = "(1+((2)))-3";
        System.out.println(calculate(s));
    }
    public static int calculate(String s) {
        return cal(s,0);

    }

    private static int cal(String s, int i) {
        int result=0;
        int number = 0;
        int sign = 1;
        if(Character.isDigit(s.charAt(i))) {
            while (Character.isDigit(s.charAt(i))) {
                number *= 10;
                number += s.charAt(i) -'0';
                i++;
            }
        }
        else if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = s.charAt(i) == '+' ? 1 : -1;
            result += sign * number;
            number = 0;
        }
        return 0;
    }
}
