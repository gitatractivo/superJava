package one.leetcode.strings;

public class _168 {
    public static void main(String[] args) {
        int a = 18253;
        System.out.println(convertToTitle(a));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
//        int i = 1;

        while(columnNumber>0){
            int temp = columnNumber%26;
            if(temp==0) {
                ans.append("Z");
                columnNumber /= (26);
                columnNumber--;

            }
            else {
                ans.append((char) (temp + 'A' - 1));
                columnNumber /= 26;
            }
//            i++;
        }


        return ans.reverse().toString();

    }
}
